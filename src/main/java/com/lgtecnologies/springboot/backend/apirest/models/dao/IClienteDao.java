package com.lgtecnologies.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.lgtecnologies.springboot.backend.apirest.models.entities.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
