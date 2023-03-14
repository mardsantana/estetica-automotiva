package br.com.clienteveiculos.ClienteVeiculos.veiculos.domain;

import br.com.clienteveiculos.ClienteVeiculos.veiculos.application.api.VeiculoRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    @NotNull
    @Column(columnDefinition = "uuid", name = "idClienteProprietario", nullable = false)
    private java.util.UUID idClienteProprietario;
    @NotBlank
    private String modeloCarro;
    @NotBlank
    @Column(unique = true)
    private String placa;
    @Enumerated(EnumType.STRING)
    private Cor cor;

    public Veiculo(java.util.UUID idCliente, VeiculoRequest veiculoRequest) {
        this.idClienteProprietario = idCliente;
        this.modeloCarro = getModeloCarro();
        this.placa = getPlaca();
        this.cor = getCor();
    }

}



