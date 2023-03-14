package br.com.clienteveiculos.ClienteVeiculos.veiculos.service;

import br.com.clienteveiculos.ClienteVeiculos.veiculos.application.api.VeiculoClienteListResponse;
import br.com.clienteveiculos.ClienteVeiculos.veiculos.application.api.VeiculoRequest;
import br.com.clienteveiculos.ClienteVeiculos.veiculos.application.api.VeiculoResponse;

import java.util.List;
import java.util.UUID;

public interface VeiculoService {
    VeiculoResponse CriaVeiculo(UUID idCliente, VeiculoRequest veiculoRequest);
    List<VeiculoClienteListResponse> buscaVeiculosDoClienteID(UUID idCliente);
}
