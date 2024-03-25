package ricorsione;

public class Fattoriale {

	public static void main(String[] args) {

		int x = 19;
		
		long start = System.currentTimeMillis();
		long result = calcola(x);
		long stop = System.currentTimeMillis();

		
		System.out.println("Il fattoriale di " + x);
		System.out.println(result);
		System.out.printf("Il tempo impiegato è %d", (stop-start));
		

	}

	private static int calcola(int x) {

		if (x == 0) {
			return 1;
		} else {
			return x * calcola(x-1);
		}

	}

	
	
	
}
