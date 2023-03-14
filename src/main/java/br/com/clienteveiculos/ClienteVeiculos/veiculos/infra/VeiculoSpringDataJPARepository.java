package br.com.clienteveiculos.ClienteVeiculos.veiculos.infra;

import br.com.clienteveiculos.ClienteVeiculos.veiculos.domain.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VeiculoSpringDataJPARepository extends JpaRepository<Veiculo, UUID>{
}
