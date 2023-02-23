package br.com.clienteveiculos.ClienteVeiculos.application.service;

import br.com.clienteveiculos.ClienteVeiculos.application.api.ClienteListResponse;
import br.com.clienteveiculos.ClienteVeiculos.application.api.ClienteRequest;
import br.com.clienteveiculos.ClienteVeiculos.application.api.ClienteResponse;

import java.util.List;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);
    List<ClienteListResponse> buscaClientes();
}
