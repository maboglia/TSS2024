package com.maboglia.services;

import java.util.List;

import com.maboglia.entities.Prodotto;

public interface ProdottiService {

	List<Prodotto> getProdotti();
	List<Prodotto> getProdottiDummy();
	Prodotto getProdotto(int id);
}
