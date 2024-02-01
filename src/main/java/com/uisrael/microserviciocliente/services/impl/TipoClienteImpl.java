package com.uisrael.microserviciocliente.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.uisrael.microserviciocliente.model.TipoCliente;

import com.uisrael.microserviciocliente.repository.ItipoClienteRepository;
import com.uisrael.microserviciocliente.services.ITipoClienteService;

public class TipoClienteImpl implements ITipoClienteService {
	

	@Autowired
	private ItipoClienteRepository tipoCliente;

	@Override
	public boolean guardarTipoCliente(TipoCliente nuevo) {
		// TODO Auto-generated method stub
		
		return tipoCliente.save(nuevo)!=null;
	}

	@Override
	public List<TipoCliente> listarTipoClientes() {
		// TODO Auto-generated method stub
		return tipoCliente.findAll();
	}

}
