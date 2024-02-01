package com.uisrael.microserviciocliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.microserviciocliente.model.TipoCliente;
import com.uisrael.microserviciocliente.services.IClienteService;
import com.uisrael.microserviciocliente.services.ITipoClienteService;

import lombok.Getter;
import lombok.Setter;

@RestController
@RequestMapping("api/tipoClientes")
@Getter
@Setter
@RefreshScope
public class TipoClienteController {
	
	@Autowired
	private ITipoClienteService servicioTipoCliente;
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void guardarCliente(@RequestBody TipoCliente tipoCliente) {
		servicioTipoCliente.guardarTipoCliente(tipoCliente);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<TipoCliente> listarCliente(){
		return servicioTipoCliente.listarTipoClientes();
	}
	

}
