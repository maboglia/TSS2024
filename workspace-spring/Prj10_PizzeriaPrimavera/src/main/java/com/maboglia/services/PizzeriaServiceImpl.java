package com.maboglia.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.Cliente;
import com.maboglia.entities.Ordine;
import com.maboglia.entities.Portata;
import com.maboglia.entities.Tavolo;
import com.maboglia.entities.portate.Altro;
import com.maboglia.entities.portate.Bevanda;
import com.maboglia.entities.portate.Dolce;
import com.maboglia.entities.portate.Pizza;
import com.maboglia.repos.ClientiDAO;
import com.maboglia.repos.PortateDAO;

@Service
public class PizzeriaServiceImpl implements PizzeriaService {

	@Autowired
	private ClientiDAO daoClienti;
	@Autowired
	private PortateDAO daoPortate;
	
	
	@Override
	public List<Pizza> getPizze() {
		// TODO Auto-generated method stub
		List<Pizza> pizze = new ArrayList<Pizza>();
		daoPortate
				.findAll()
				.stream()
				.filter(p->p.getTipo().equalsIgnoreCase("pizza"))
				.forEach(p -> {
					Pizza pizza = new Pizza();
					pizza.setId(p.getId());
					pizza.setTipo(p.getTipo());
					pizza.setNome(p.getNome());
					pizza.setPrezzo(p.getPrezzo());
					pizza.setDescrizione(p.getDescrizione());
					pizze.add(pizza);
					});
		System.out.println("llllllll");
		return pizze;
		
	}

	@Override
	public List<Bevanda> getBevande() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dolce> getDolci() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Altro> getAltro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> getClienti() {
		// TODO Auto-generated method stub
		return daoClienti.findAll();
	}

	@Override
	public List<Ordine> getOrdini() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Portata> getPortate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tavolo> getTavoli() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pizza getPizzeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bevanda getBevandeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dolce getDolciById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Altro getAltroById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente getClientiById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ordine getOrdiniById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Portata getPortateById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tavolo getTavoliByNumTavolo(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pizza addPizza(Pizza p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bevanda addBevanda(Bevanda b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dolce addDolce(Dolce d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Altro addAltro(Altro a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ordine addOrdine(Ordine o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente addCliente(Cliente c) {
		// TODO Auto-generated method stub
		return daoClienti.save(c);
	}

	@Override
	public Portata addPortata(Portata p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tavolo addTavolo(Tavolo t) {
		// TODO Auto-generated method stub
		return null;
	}

}
