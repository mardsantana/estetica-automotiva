package br.com.clienteveiculos.ClienteVeiculos.veiculos.application.api;

import lombok.Value;
import org.hibernate.validator.constraints.UUID;

@Value
public class VeiculoResponse {
    private UUID idVeiculo;
}
