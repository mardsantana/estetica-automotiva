package br.com.clienteveiculos.ClienteVeiculos.infra;

import br.com.clienteveiculos.ClienteVeiculos.application.repository.ClienteRepository;
import br.com.clienteveiculos.ClienteVeiculos.cliente.domain.Cliente;
import br.com.clienteveiculos.ClienteVeiculos.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {
    private final ClienteSpringDataJPARepository clienteSpringDataJPARepository;
    @Override
    public Cliente salva(Cliente cliente) {
        log.info("[inicia] ClienteInfraRepository - salva");
        clienteSpringDataJPARepository.save(cliente);
        log.info("[finaliza] ClienteInfraRepository - salva");
        return cliente;
    }
    @Override
    public List<Cliente> buscaClientes() {
        log.info("[inicia] ClienteInfraRepository - buscaClientes");
        List<Cliente> todosClientes = clienteSpringDataJPARepository.findAll();
        log.info("[finaliza] ClienteInfraRepository - buscaClientes");
        return todosClientes;
    }
    @Override
    public Cliente buscaClienteAtravesId(UUID idCliente) {
        log.info("[inicia] ClienteInfraRepository - buscaClienteAtravesId");
        Cliente cliente = clienteSpringDataJPARepository.findById(idCliente)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Cliente Não Encontrado"));
        log.info("[finaliza] ClienteInfraRepository - buscaClienteAtravesId");
        return cliente;
    }
}
