package br.com.clienteveiculos.ClienteVeiculos.veiculos.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/cliente/{idCliente}/veiculo")
public interface VeiculoAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    VeiculoResponse postVeiculo(@PathVariable UUID idCliente,
                                @Valid @RequestBody VeiculoRequest veiculoRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<VeiculoClienteListResponse> getVeiculoClienteId(@PathVariable UUID idCliente);

}
