package br.com.clienteveiculos.ClienteVeiculos.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/cliente")
public interface ClienteAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ClienteResponse postCliente(@RequestBody ClienteRequest clienteRequest);

}
