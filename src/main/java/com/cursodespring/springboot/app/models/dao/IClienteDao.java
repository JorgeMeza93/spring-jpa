package com.cursodespring.springboot.app.models.dao;

import java.util.List;

import com.cursodespring.springboot.app.models.entity.Cliente;

public interface IClienteDao {
	public List<Cliente> findAll();
	
}
