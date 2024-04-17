package com.maboglia.services;

import java.util.List;

import com.maboglia.entities.Cliente;
import com.maboglia.entities.Ordine;
import com.maboglia.entities.Portata;
import com.maboglia.entities.Tavolo;
import com.maboglia.entities.portate.*;

public interface PizzeriaService {

	List<Pizza> getPizze();
	List<Bevanda> getBevande();
	List<Dolce> getDolci();
	List<Altro> getAltro();
	List<Cliente> getClienti();
	List<Ordine> getOrdini();
	List<Portata> getPortate();
	List<Tavolo> getTavoli();

	Pizza getPizzeById(int id);
	Bevanda getBevandeById(int id);
	Dolce getDolciById(int id);
	Altro getAltroById(int id);
	Cliente getClientiById(int id);
	Ordine getOrdiniById(int id);
	Portata getPortateById(int id);
	Tavolo getTavoliByNumTavolo(int id);
	
	Pizza addPizza(Pizza p);
	Bevanda addBevanda(Bevanda b);
	Dolce addDolce(Dolce d);
	Altro addAltro(Altro a);
	Ordine addOrdine(Ordine o);
	Cliente addCliente(Cliente c);
	Portata addPortata(Portata p);
	Tavolo addTavolo(Tavolo t);
	
	
}
