package br.com.clienteveiculos.ClienteVeiculos.veiculos.repository;

import br.com.clienteveiculos.ClienteVeiculos.veiculos.domain.Veiculo;

import java.util.List;
import java.util.UUID;

public interface VeiculoRepository {
    Veiculo salvaVeiculo(Veiculo veiculo);
    List<Veiculo> buscaVeiculosDoClienteID(UUID idCliente);
}
