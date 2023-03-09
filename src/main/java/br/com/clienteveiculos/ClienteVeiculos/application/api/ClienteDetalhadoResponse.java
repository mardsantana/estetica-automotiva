package br.com.clienteveiculos.ClienteVeiculos.application.api;

import br.com.clienteveiculos.ClienteVeiculos.cliente.domain.Cliente;
import org.hibernate.validator.constraints.UUID;

import java.time.LocalDateTime;

public class ClienteDetalhadoResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String celular;
    private String whatsapp;
    private LocalDateTime dataHoraDoCadastro;

    public ClienteDetalhadoResponse(Cliente cliente) {
        this.idCliente = cliente.getIdCliente();
        this.nomeCompleto = cliente.getNomeCompleto();
        this.cpf = cliente.getCpf();
        this.email = cliente.getEmail();
        this.celular = cliente.getCelular();
        this.whatsapp = cliente.getWhatsapp();
        this.dataHoraDoCadastro = cliente.getDataHoraDoCadastro();
    }
}
