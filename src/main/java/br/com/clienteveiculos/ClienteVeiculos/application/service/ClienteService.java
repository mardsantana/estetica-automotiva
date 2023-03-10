package br.com.clienteveiculos.ClienteVeiculos.application.service;

import br.com.clienteveiculos.ClienteVeiculos.application.api.*;

import java.util.List;
import java.util.UUID;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);
    List<ClienteListResponse> buscaClientes();
    ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
    void deletaClienteAtravesId(UUID idCliente);
    void patchAlteraCliente(UUID idCliente, ClienteAlteracaoRequest clienteAlteracaoRequest);
}
