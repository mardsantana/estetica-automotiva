package br.com.clienteveiculos.ClienteVeiculos.application.api;

import org.hibernate.validator.constraints.UUID;

public class ClienteListResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String celular;
    private String whatsapp;
}
