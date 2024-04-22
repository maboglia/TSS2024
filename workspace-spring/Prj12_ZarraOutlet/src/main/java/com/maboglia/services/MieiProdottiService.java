package com.maboglia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.MioProdotto;
import com.maboglia.entities.Prodotto;
import com.maboglia.repos.MioProdottoDAO;

@Service
public class MieiProdottiService {

	@Autowired
	private MioProdottoDAO dao;
	
	@Autowired 
	private ProdottiService service;
	
	public void caricaProdotti() {
		for (Prodotto p:  service.getProdotti()) {
			MioProdotto mp = new MioProdotto();
			mp.setTitle(p.getTitle());
			mp.setPrice(p.getPrice());
			dao.save(mp);
			
		}
	} 
}
