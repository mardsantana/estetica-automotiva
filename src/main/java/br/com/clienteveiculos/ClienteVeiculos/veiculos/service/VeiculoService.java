package br.com.clienteveiculos.ClienteVeiculos.veiculos.service;

import br.com.clienteveiculos.ClienteVeiculos.veiculos.domain.VeiculoRequest;
import br.com.clienteveiculos.ClienteVeiculos.veiculos.domain.VeiculoResponse;

import java.util.UUID;

public interface VeiculoService {
    VeiculoResponse CriaVeiculo(UUID idCliente, VeiculoRequest veiculoRequest);
}
