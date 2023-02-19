package br.com.clienteveiculos.ClienteVeiculos.cliente.domain;

import br.com.clienteveiculos.ClienteVeiculos.application.api.ClienteRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UUID;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "idCliente", updatable = false, unique = true, nullable = false)
    private UUID idCliente;
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    @Email
    private String email;
    private String celular;
    private String whatsapp;
    private Sexo sexo;
    @CPF
    private String cpf;

    private LocalDateTime DataHoraDoCadastro;
    
    public Cliente(ClienteRequest clienteRequest) {
        this.nomeCompleto = clienteRequest.getNomeCompleto();
        this.email = clienteRequest.getEmail();
        this.celular = clienteRequest.getCelular();
        this.whatsapp = clienteRequest.getWhatsapp();
        this.sexo = clienteRequest.getSexo();
        this.cpf = clienteRequest.getCpf();
        this.DataHoraDoCadastro = LocalDateTime.now();
    }
}



