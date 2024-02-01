package com.uisrael.microserviciocliente.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.uisrael.microserviciocliente.model.Cliente;

public interface IClienteRepository  extends MongoRepository<Cliente, String> {

}
