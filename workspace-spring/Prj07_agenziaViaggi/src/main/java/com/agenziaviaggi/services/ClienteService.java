package com.agenziaviaggi.services;

import java.util.List;

import com.agenziaviaggi.entities.Cliente;

public interface ClienteService {

	List<Cliente> getClienti();
	Cliente getClienteById(int id);
	Cliente addCliente(Cliente v);
	Cliente updateCliente(Cliente v);
	void deleteCliente(Cliente v);
}
