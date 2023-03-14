package br.com.clienteveiculos.ClienteVeiculos.veiculos.application.api;

import br.com.clienteveiculos.ClienteVeiculos.veiculos.service.VeiculoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class VeiculoController implements VeiculoAPI {
    private final VeiculoService veiculoService;
    @Override
    public VeiculoResponse postVeiculo(UUID idCliente, VeiculoRequest veiculoRequest) {
        log.info("[inicia] VeiculoController - postVeiculo");
        log.info("[idCliente] {}", idCliente);
        VeiculoResponse veiculo = veiculoService.CriaVeiculo(idCliente,veiculoRequest);
        log.info("[finaliza] VeiculoController - postVeiculo");
        return  veiculo;
    }
}
