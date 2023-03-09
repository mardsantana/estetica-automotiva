package br.com.clienteveiculos.ClienteVeiculos.application.repository;

import br.com.clienteveiculos.ClienteVeiculos.cliente.domain.Cliente;

import java.util.List;
import java.util.UUID;

public interface ClienteRepository {
    Cliente salva(Cliente cliente);
    List<Cliente> buscaClientes();
    Cliente buscaClienteAtravesId(UUID idCliente);
}
