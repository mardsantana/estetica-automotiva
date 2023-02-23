package br.com.clienteveiculos.ClienteVeiculos.infra;

import br.com.clienteveiculos.ClienteVeiculos.cliente.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteSpringDataJPARepository extends JpaRepository<Cliente, UUID> {
}
