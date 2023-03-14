package br.com.clienteveiculos.ClienteVeiculos.veiculos.application.api;

import br.com.clienteveiculos.ClienteVeiculos.veiculos.domain.Cor;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class VeiculoRequest {
    @NotBlank
    private String modeloCarro;
    @NotBlank
    @Column(unique = true)
    private String placa;
    @Enumerated(EnumType.STRING)
    private Cor cor;
}
