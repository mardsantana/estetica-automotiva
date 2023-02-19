package br.com.clienteveiculos.ClienteVeiculos.application.api;

import lombok.Builder;
import lombok.Value;
import org.hibernate.validator.constraints.UUID;

@Value
@Builder
public class ClienteResponse {
    private UUID idCliente;
}
