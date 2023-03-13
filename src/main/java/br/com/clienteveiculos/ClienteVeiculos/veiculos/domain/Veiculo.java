package br.com.clienteveiculos.ClienteVeiculos.veiculos.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Veiculo {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(columnDefinition = "uuid", name = "idCliente", updatable = false, unique = true, nullable = false)
    private UUID idVeiculo;
    @NotBlank
    private String modeloCarro;
    @NotBlank
    @Column(unique = true)
    private String placa;
    @Enumerated(EnumType.STRING)
    private Cor cor;
//    private LocalDateTime dataHoraDoCadastro;
//    public Veiculo(ClienteRequest clienteRequest) {
//        this.nomeCompleto = clienteRequest.getNomeCompleto();
//        this.email = clienteRequest.getEmail();
//        this.celular = clienteRequest.getCelular();
//        this.whatsapp = clienteRequest.getWhatsapp();
//        this.sexo = clienteRequest.getSexo();
//        this.cpf = clienteRequest.getCpf();
//        this.dataHoraDoCadastro = LocalDateTime.now();
//    }
//
//    public void altera(ClienteAlteracaoRequest clienteRequest) {
//        this.nomeCompleto = clienteRequest.getNomeCompleto();
//        this.celular = clienteRequest.getCelular();
//        this.whatsapp = clienteRequest.getWhatsapp();
//        this.sexo = clienteRequest.getSexo();
//        this.dataHoraDoCadastro = LocalDateTime.now();
//    }
}



