package controlflow;

public class ProvaWhile {

	public static void main(String[] args) {

		boolean gira = true;
		int giri = 0;
		while(gira) {
			System.out.println("gira " + giri++);
			
			if (Math.random() < 0.5) {
				//break;
				gira = false;
			}
		}
		
		do {
			System.out.println("gira " + giri++);
			
			if (Math.random() < 0.5) {
				//break;
				gira = false;
			}
		} while (false);
		
		
		
	}

}
