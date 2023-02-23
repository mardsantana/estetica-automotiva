package br.com.clienteveiculos.ClienteVeiculos.application.api;

import br.com.clienteveiculos.ClienteVeiculos.application.service.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {
    private final ClienteService clienteService;
    @Override
    public ClienteResponse postCliente(@Valid ClienteRequest clienteRequest) {
        log.info("[inicia] ClienteController - postCliente");
        ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
        log.info("[finaliza] ClienteController - postCliente");
        return clienteCriado;
    }
    @Override
    public List<ClienteListResponse> getTodosClientes() {
        log.info("[inicia] ClienteController - getTodosClientes");
        List<ClienteListResponse> clientes = clienteService.buscaClientes();
        log.info("[finaliza] ClienteController - getTodosClientes");
        return clientes;
    }
}
