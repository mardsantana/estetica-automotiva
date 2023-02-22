package br.com.clienteveiculos.ClienteVeiculos.infra;

import br.com.clienteveiculos.ClienteVeiculos.application.repository.ClienteRepository;
import br.com.clienteveiculos.ClienteVeiculos.cliente.domain.Cliente;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
public class ClienteInfraRepository implements ClienteRepository {
    @Override
    public Cliente salva(Cliente cliente) {
        log.info("[inicia] ClienteInfraRepository - salva");
        log.info("[finaliza] ClienteInfraRepository - salva");
        return cliente;
    }
}
