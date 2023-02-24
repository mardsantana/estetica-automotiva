package br.com.clienteveiculos.ClienteVeiculos.application.api;

import br.com.clienteveiculos.ClienteVeiculos.cliente.domain.Cliente;
import org.hibernate.validator.constraints.UUID;

import java.util.List;

public class ClienteListResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String celular;
    private String whatsapp;

    public static List<ClienteListResponse> converte(List<Cliente> clientes) {
        return null;
    }
}
