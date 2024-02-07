package view;

public class ProvaEccezioni1 {

	public static void main(String[] args) {

		int[] voti = {22,24,25,27,29,30};
		try {
			
			
			
			for (int i = 0; i < voti.length; i++) {
				//double divisione = voti[i] / i;
				System.out.println(voti[i]); 
			}
			
			
		} 
		
		catch (ArithmeticException e) {
			System.err.println("Mi dispiace si è verificata un'eccezione di tipo aritmetico");
			
		} 
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Sei uscito dai limiti dell'array");
			
		}
		
		catch (Exception e) {
			System.err.println("Mi dispiace si è verificata un'eccezione");
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Comunque vada io termino le mie operazioni prima di uscire");
		}
		
		System.out.println("finito");

	}

}
