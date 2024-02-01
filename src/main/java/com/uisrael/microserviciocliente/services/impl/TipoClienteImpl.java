package com.uisrael.microserviciocliente.services.impl;

import java.util.List;

import com.uisrael.microserviciocliente.model.TipoCliente;
import com.uisrael.microserviciocliente.services.ITipoClienteService;

public class TipoClienteImpl implements ITipoClienteService {

	@Override
	public boolean guardarTipoCliente(TipoCliente nuevo) {
		// TODO Auto-generated method stub
		return tipoClienteRepo.save(nuevo)!=null;
	}

	@Override
	public List<TipoCliente> listarTipoClientes() {
		// TODO Auto-generated method stub
		return null;
	}

}
