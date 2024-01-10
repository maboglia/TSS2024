package demo;

public class ProvaWhile {

	public static void main(String[] args) {


		boolean gira = 5 > 4;
		
		
		while(gira) {
			
			System.out.println("sto girando");
			
			if (Math.random() < 0.1)
				gira = false;
			
			
		}
		

	}

}
