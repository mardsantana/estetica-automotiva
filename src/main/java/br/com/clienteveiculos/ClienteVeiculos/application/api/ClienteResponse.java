package br.com.clienteveiculos.ClienteVeiculos.application.api;

import lombok.Value;
import org.hibernate.validator.constraints.UUID;

@Value
public class ClienteResponse {
    private UUID idCliente;
}
