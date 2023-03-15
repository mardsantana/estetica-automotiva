package br.com.clienteveiculos.ClienteVeiculos.veiculos.application.api;

import br.com.clienteveiculos.ClienteVeiculos.veiculos.domain.Cor;
import br.com.clienteveiculos.ClienteVeiculos.veiculos.domain.Veiculo;
import lombok.Getter;
import org.hibernate.validator.constraints.UUID;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class VeiculoClienteListResponse {
    private UUID idVeiculo;
    private String modeloCarro;
    private String placa;
    private Cor cor;

    public static List<VeiculoClienteListResponse> converte(List<Veiculo> veiculosDoCliente) {
        return veiculosDoCliente.stream()
                .map(VeiculoClienteListResponse::new)
                .collect(Collectors.toList());
    }
   public VeiculoClienteListResponse(Veiculo veiculo){
        this.idVeiculo = getIdVeiculo();
        this.modeloCarro = getModeloCarro();
        this.placa = getPlaca();
        this.cor = getCor();
    }
}
