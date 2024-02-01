package com.uisrael.microserviciocliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.microserviciocliente.model.Cliente;
import com.uisrael.microserviciocliente.services.IClienteService;

import lombok.Getter;
import lombok.Setter;
@RestController
@RequestMapping("api/clientes")
@Getter
@Setter
@RefreshScope
public class ClienteController {
	
	@Autowired
	private IClienteService servicio;
	
	@Value("${app.testPropiedad}")
	private String testPropiedad;
	
	@GetMapping("/test")
	public String leerTestProperties() {
		return this.testPropiedad;
	}
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void guardarCliente(@RequestBody Cliente cliente) {
		servicio.guardarCliente(cliente);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Cliente> listarCliente(){
		return servicio.listarClientes();
	}
	
	
	
}
