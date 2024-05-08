package avanzato;

import java.math.BigDecimal;

public class LibroGiallo extends Libro {

	public static void main(String[] args) {
		
		double numero = .012;
		double somma = numero + numero + numero;
		System.out.println(somma);
		
		 String stringaValore = Double.toString(numero);
	        System.out.println("stringaValore: " + stringaValore);
	        BigDecimal bigDecimalValore = new BigDecimal(stringaValore);

	        BigDecimal bigSomma = bigDecimalValore.add(bigDecimalValore).add(bigDecimalValore);

	        System.out.println("Somma di BigDecimal: " + bigSomma.toString());
	}
	
}
