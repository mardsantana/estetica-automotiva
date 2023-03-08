package br.com.clienteveiculos.ClienteVeiculos.application.service;

import br.com.clienteveiculos.ClienteVeiculos.application.api.ClienteDetalhadoResponse;
import br.com.clienteveiculos.ClienteVeiculos.application.api.ClienteListResponse;
import br.com.clienteveiculos.ClienteVeiculos.application.api.ClienteRequest;
import br.com.clienteveiculos.ClienteVeiculos.application.api.ClienteResponse;

import java.util.List;
import java.util.UUID;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);
    List<ClienteListResponse> buscaClientes();
    ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
}
