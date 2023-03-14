package br.com.clienteveiculos.ClienteVeiculos.veiculos.service;

import br.com.clienteveiculos.ClienteVeiculos.application.service.ClienteService;
import br.com.clienteveiculos.ClienteVeiculos.veiculos.domain.Veiculo;
import br.com.clienteveiculos.ClienteVeiculos.veiculos.application.api.VeiculoRequest;
import br.com.clienteveiculos.ClienteVeiculos.veiculos.application.api.VeiculoResponse;
import br.com.clienteveiculos.ClienteVeiculos.veiculos.repository.VeiculoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class VeiculoApplicationService implements VeiculoService{
    private final VeiculoRepository veiculoRepository;
    private final ClienteService clienteService;
    @Override
    public VeiculoResponse CriaVeiculo(UUID idCliente, VeiculoRequest veiculoRequest) {
        log.info("[start] VeiculoApplicationService - CriaVeiculo");
        clienteService.buscaClienteAtravesId(idCliente);
        Veiculo veiculo = veiculoRepository.salvaVeiculo(new Veiculo(idCliente, veiculoRequest));
        log.info("[finish] VeiculoApplicationService - CriaVeiculo");
        return new VeiculoResponse(veiculo.getIdVeiculo());
    }
}
