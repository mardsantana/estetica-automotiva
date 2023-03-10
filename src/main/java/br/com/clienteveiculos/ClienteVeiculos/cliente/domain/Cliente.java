package br.com.clienteveiculos.ClienteVeiculos.cliente.domain;

import br.com.clienteveiculos.ClienteVeiculos.application.api.ClienteAlteracaoRequest;
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
   @Column(columnDefinition = "uuid", name = "idCliente", updatable = false, unique = true, nullable = false)
    private UUID idCliente;
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    @Email
    @Column(unique = true)
    private String email;
    @NotBlank
    private String celular;
    @NotBlank
    private String whatsapp;
    private Sexo sexo;
    @CPF
    @Column(unique = true)
    private String cpf;

    private LocalDateTime dataHoraDoCadastro;
    public Cliente(ClienteRequest clienteRequest) {
        this.nomeCompleto = clienteRequest.getNomeCompleto();
        this.email = clienteRequest.getEmail();
        this.celular = clienteRequest.getCelular();
        this.whatsapp = clienteRequest.getWhatsapp();
        this.sexo = clienteRequest.getSexo();
        this.cpf = clienteRequest.getCpf();
        this.dataHoraDoCadastro = LocalDateTime.now();
    }

    public void altera(ClienteAlteracaoRequest clienteRequest) {
        this.nomeCompleto = clienteRequest.getNomeCompleto();
        this.celular = clienteRequest.getCelular();
        this.whatsapp = clienteRequest.getWhatsapp();
        this.sexo = clienteRequest.getSexo();
        this.dataHoraDoCadastro = LocalDateTime.now();
    }
}



