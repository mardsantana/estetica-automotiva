package br.com.clienteveiculos.ClienteVeiculos.veiculos.infra;

import br.com.clienteveiculos.ClienteVeiculos.veiculos.domain.Veiculo;
import br.com.clienteveiculos.ClienteVeiculos.veiculos.repository.VeiculoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

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
}
