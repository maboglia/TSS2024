package test;

import model.Colore;
import model.Maglia;
import model.Taglia;

public class MagliaDemo {

	public static void main(String[] args) {

		Maglia m1 = new Maglia(Taglia.M , Colore.GREEN , 10);
		Maglia m2 = new Maglia(Taglia.XL , Colore.RED , 12);
		
		System.out.println(m1.getTaglia().getNumTaglia());
		System.out.println(m2.getColore().getEsa());
		

	}

}
