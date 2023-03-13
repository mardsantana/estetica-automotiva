package br.com.clienteveiculos.ClienteVeiculos.veiculos.domain;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/v1/cliente/{idCliente}/veiculo")
public interface VeiculoAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    veiculoResponse postVeiculo(@PathVariable UUID idCliente,
            @Valid @RequestBody VeiculoRequest veiculoRequest);

}
