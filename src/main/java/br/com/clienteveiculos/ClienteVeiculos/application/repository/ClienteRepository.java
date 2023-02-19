package br.com.clienteveiculos.ClienteVeiculos.application.repository;

import br.com.clienteveiculos.ClienteVeiculos.cliente.domain.Cliente;

public interface ClienteRepository {
    Cliente salva(Cliente cliente);
}
