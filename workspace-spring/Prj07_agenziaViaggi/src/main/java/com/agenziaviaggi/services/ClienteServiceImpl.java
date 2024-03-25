package com.agenziaviaggi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenziaviaggi.entities.Cliente;
import com.agenziaviaggi.repos.ClienteDAO;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteDAO dao;
	
	@Override
	public List<Cliente> getClienti() {
	
		return dao.findAll();
	}

	@Override
	public Cliente getClienteById(int id) {
		
		return dao.findById(id).get();
	}

	@Override
	public Cliente addCliente(Cliente v) {
		
		return dao.save(v);
	}

	@Override
	public Cliente updateCliente(Cliente v) {
	
		return dao.save(v);
	}

	@Override
	public void deleteCliente(Cliente v) {
		dao.delete(v);
	}

	
}
