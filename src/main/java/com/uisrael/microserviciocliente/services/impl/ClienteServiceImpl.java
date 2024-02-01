package com.uisrael.microserviciocliente.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.microserviciocliente.model.Cliente;
import com.uisrael.microserviciocliente.repository.IClienteRepository;
import com.uisrael.microserviciocliente.services.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService{
	
	@Autowired
	private IClienteRepository clienteRepo;

	@Override
	public boolean guardarCliente(Cliente nuevo) {
		// TODO Auto-generated method stub
		return clienteRepo.save(nuevo)!=null;
		
	}

	@Override
	public List<Cliente> listarClientes() {
		// TODO Auto-generated method stub
		return clienteRepo.findAll();
	}
	

}
