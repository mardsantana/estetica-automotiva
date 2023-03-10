package br.com.clienteveiculos.ClienteVeiculos.application.api;

import br.com.clienteveiculos.ClienteVeiculos.cliente.domain.Sexo;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;


@Value
public class ClienteAlteracaoRequest {
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    private String celular;
    private String whatsapp;
    private Sexo sexo;
}
