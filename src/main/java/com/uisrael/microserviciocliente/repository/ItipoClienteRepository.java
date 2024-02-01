package com.uisrael.microserviciocliente.repository;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.uisrael.microserviciocliente.model.TipoCliente;

public interface ItipoClienteRepository extends MongoRepository<TipoCliente, String>{

}
