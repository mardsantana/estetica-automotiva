package br.com.clienteveiculos.ClienteVeiculos.veiculos.domain;

import lombok.Value;
import org.hibernate.validator.constraints.UUID;

@Value
public class VeiculoResponse {
    private UUID idVeiculo;
}
