package view;

import java.util.ArrayList;
import java.util.Iterator;

import model.FiguraGeometrica;
import model.Misurabile;
import model.Punto;
import model.Quadrato;
import model.Rettangolo;
import model.Segmento;
import model.Triangolo;

public class ProvaGeometria {

	public static void main(String[] args) {

		ArrayList<FiguraGeometrica> rettangoli = new ArrayList<>();
		ArrayList<Misurabile> miserabili = new ArrayList<>();
		
		Segmento ab = new Segmento(new Punto(2,3), new Punto(7,3));
		Segmento ac = new Segmento(new Punto(2,3), new Punto(2,7));
		Rettangolo r = new Rettangolo(ab, ac);
		
		Quadrato q = new Quadrato(ab);
		
		Triangolo t = new Triangolo(new Punto(2,3), new Punto(7,3), new Punto(2,7));
		
		rettangoli.add(r);
		rettangoli.add(q);
		rettangoli.add(t);
		
		miserabili.add(t);
		miserabili.add(q);
		
		for (FiguraGeometrica figura : rettangoli) {
			System.out.println(figura);
		}
		
		

	}

}
