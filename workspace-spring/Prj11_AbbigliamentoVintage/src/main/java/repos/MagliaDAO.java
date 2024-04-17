package repos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import model.Colore;
import model.Maglia;
import model.Taglia;

public class MagliaDAO {

	private List<Maglia> maglie = new ArrayList<>();

	{
		Colore[] colori = {Colore.BLUE, Colore.RED, Colore.GREEN};
		Taglia[] taglie = {Taglia.S,Taglia.M,Taglia.L};
		String[] scritte = {"Frutta", "Verdura", "Carne", "Cocktail"};
		Random random = new Random();
		
		for (int i = 0; i < 50; i++) {
			maglie.add(new Maglia(scritte[random.nextInt(scritte.length)], random.nextInt(10,25), colori[random.nextInt(colori.length)], taglie[random.nextInt(taglie.length)]));
		}
		
		
	}

	public List<Maglia> getMaglie() {
		return maglie;
	}

	
	
}
