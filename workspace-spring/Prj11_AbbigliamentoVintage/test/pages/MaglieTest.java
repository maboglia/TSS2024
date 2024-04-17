package pages;

import org.junit.jupiter.api.Test;

import pages.Maglie;

public class MaglieTest {

	Maglie pagina = new Maglie();
	
	@Test
	public void leggiTabellaMaglie() {
		pagina.leggiRighe();
	}
	
	
}
