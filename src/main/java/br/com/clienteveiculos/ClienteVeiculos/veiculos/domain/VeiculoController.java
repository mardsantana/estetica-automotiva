package br.com.clienteveiculos.ClienteVeiculos.veiculos.domain;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Log4j2
public class VeiculoController implements VeiculoAPI{
    @Override
    public VeiculoResponse postVeiculo(UUID idCliente, VeiculoRequest veiculoRequest) {
        log.info("[inicia] VeiculoController - postVeiculo");
        log.info("[idCliente] {}", idCliente);
        log.info("[finaliza] VeiculoController - postVeiculo");
        return null;
    }
}
