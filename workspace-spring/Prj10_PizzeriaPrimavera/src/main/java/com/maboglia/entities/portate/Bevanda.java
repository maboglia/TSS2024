package com.maboglia.entities.portate;

import com.maboglia.entities.Portata;

public class Bevanda extends Portata {

	public Bevanda() {
		this.setTipo("Bevanda");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bevanda [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
