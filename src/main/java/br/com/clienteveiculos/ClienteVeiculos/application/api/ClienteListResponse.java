package br.com.clienteveiculos.ClienteVeiculos.application.api;

import br.com.clienteveiculos.ClienteVeiculos.cliente.domain.Cliente;
import lombok.Value;
import org.hibernate.validator.constraints.UUID;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.stream.Collectors;

@Value
public class ClienteListResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String celular;
    private String whatsapp;

    public static List<ClienteListResponse> converte(List<Cliente> clientes) {
        return clientes.stream()
                .map(ClienteListResponse::new)
                .collect(Collectors.toList());
    }
    private ClienteListResponse(@NotNull Cliente cliente) {
        this.idCliente = getIdCliente();
        this.nomeCompleto = cliente.getNomeCompleto();
        this.cpf = cliente.getCpf();
        this.email = cliente.getEmail();
        this.celular = cliente.getCelular();
        this.whatsapp = cliente.getWhatsapp();
    }
}
