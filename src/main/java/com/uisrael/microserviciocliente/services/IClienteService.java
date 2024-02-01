package com.uisrael.microserviciocliente.services;

import java.util.List;

import com.uisrael.microserviciocliente.model.Cliente;

public interface IClienteService {
	public boolean guardarCliente(Cliente nuevo);
	public List<Cliente> listarClientes();

}
