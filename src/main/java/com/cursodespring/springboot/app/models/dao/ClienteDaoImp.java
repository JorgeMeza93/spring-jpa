package com.cursodespring.springboot.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cursodespring.springboot.app.models.entity.Cliente;

@Repository("clienteDaoJPA")
public class ClienteDaoImp implements IClienteDao{
	@PersistenceContext
	private EntityManager em;
	@Transactional(readOnly = true)
	@Override
	public List<Cliente> findAll() {
		return em.createQuery("From Cliente").getResultList();
	}

}
