package br.com.clienteveiculos.ClienteVeiculos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ClienteVeiculosApplication {
	@GetMapping
	public String getHomeTeste(){
		return "Cliente Veiculos - API Home";
	}
	public static void main(String[] args) {
		SpringApplication.run(ClienteVeiculosApplication.class, args);
	}
}
