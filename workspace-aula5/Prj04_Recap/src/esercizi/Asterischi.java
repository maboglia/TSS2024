package esercizi;

public class Asterischi {

	public static void main(String[] args) {


		//cicli: iterazioni
		
		int volte = 10;
		
		for (int i = volte; i >0; i--) {
			//System.out.print("Val i:" + i);
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			
			System.out.print("\n");
			
		}
		
		
		

	}

}
