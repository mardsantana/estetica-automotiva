package br.com.clienteveiculos.ClienteVeiculos.veiculos.service;

import br.com.clienteveiculos.ClienteVeiculos.veiculos.domain.VeiculoRequest;
import br.com.clienteveiculos.ClienteVeiculos.veiculos.domain.VeiculoResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
public class VeiculoApplicationService implements VeiculoService{
    @Override
    public VeiculoResponse CriaVeiculo(UUID idCliente, VeiculoRequest veiculoRequest) {
        log.info("[start] VeiculoApplicationService - CriaVeiculo");
        
        log.info("[finish] VeiculoApplicationService - CriaVeiculo");
        return null;
    }
}
