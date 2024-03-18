package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import model.Provincia;
import model.Regione;

public class RegioniCtrl {

	Set<Regione> regioniSet;

	public RegioniCtrl(Set<Regione> regioniSet) {//basso accoppiamento
		//dependency injection
		this.regioniSet = regioniSet;//new HashSet<Regione>
		System.out.println(regioniSet);
	}
	
	public List<Regione> getListRegioni(){
		return new ArrayList<Regione>(this.regioniSet);
	}
	
	public List<Regione> getRegioniByPopolazioneBetween(int min, int max){
		return this
				.getListRegioni()
				.stream()
				.filter(r -> r.getPopolazione()>min)
				.filter(r -> r.getPopolazione()<max)
				.toList();
	}
	
//	List<Provincia> getProvinceFiltrateOrdinate(int min, int max){
//		return this.getRegioniByPopolazioneBetween(min, max)
//				.stream()
//				.map(r -> r.getProvince())
//				.toList();
//	}
	
}
