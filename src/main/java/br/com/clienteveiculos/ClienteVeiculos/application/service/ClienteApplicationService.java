package br.com.clienteveiculos.ClienteVeiculos.application.service;

import br.com.clienteveiculos.ClienteVeiculos.application.api.ClienteDetalhadoResponse;
import br.com.clienteveiculos.ClienteVeiculos.application.api.ClienteListResponse;
import br.com.clienteveiculos.ClienteVeiculos.application.api.ClienteRequest;
import br.com.clienteveiculos.ClienteVeiculos.application.api.ClienteResponse;
import br.com.clienteveiculos.ClienteVeiculos.application.repository.ClienteRepository;
import br.com.clienteveiculos.ClienteVeiculos.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService{
    private final ClienteRepository clienteRepository;
    @Override
    public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
        log.info("[inicia] ClienteApplicationService - criaCliente");
        Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
        log.info("[finaliza] ClienteApplicationService - criaCliente");
        return ClienteResponse.builder()
                .idCliente(cliente.getIdCliente())
                .build();
    }
    @Override
    public List<ClienteListResponse> buscaClientes() {
        log.info("[inicia] ClienteApplicationService - buscaClientes");
        List<Cliente> clientes = clienteRepository.buscaClientes();
        log.info("[finaliza] ClienteApplicationService - buscaClientes");
        return ClienteListResponse.converte(clientes);
    }
    @Override
    public ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente) {
        log.info("[inicia] ClienteApplicationService - buscaClienteAtravesId");
        Cliente cliente = clienteRepository.buscaClienteAtravesId(idCliente);
        log.info("[finaliza] ClienteApplicationService - buscaClienteAtravesId");
        return new ClienteDetalhadoResponse(cliente);
    }
}
