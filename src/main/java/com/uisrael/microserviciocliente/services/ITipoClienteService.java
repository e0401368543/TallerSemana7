package com.uisrael.microserviciocliente.services;

import java.util.List;


import com.uisrael.microserviciocliente.model.TipoCliente;

public interface ITipoClienteService {
	public boolean guardarTipoCliente(TipoCliente nuevo);
	public List<TipoCliente> listarTipoClientes();

}
