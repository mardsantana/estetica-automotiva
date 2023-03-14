package br.com.clienteveiculos.ClienteVeiculos.veiculos.infra;

import br.com.clienteveiculos.ClienteVeiculos.veiculos.domain.Veiculo;
import br.com.clienteveiculos.ClienteVeiculos.veiculos.repository.VeiculoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class VeiculoInfraRepository implements VeiculoRepository {
    private final VeiculoSpringDataJPARepository veiculoSpringDataJPARepository;
    @Override
    public Veiculo salvaVeiculo(Veiculo veiculo) {
        log.info("[start] VeiculoInfraRepository - salvaVeiculo");
        veiculoSpringDataJPARepository.save(veiculo);
        log.info("[finish] VeiculoInfraRepository - salvaVeiculo");
        return veiculo;
    }
    @Override
    public List<Veiculo> buscaVeiculosDoClienteID(UUID idCliente) {
        log.info("[start] VeiculoInfraRepository - buscaVeiculosDoClienteID");
        var veiculos = veiculoSpringDataJPARepository.findByIdClienteProrprietario(idCliente);
        log.info("[finish] VeiculoInfraRepository - buscaVeiculosDoClienteID");
        return veiculos;
    }
}
