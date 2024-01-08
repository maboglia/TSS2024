package demo;

public class GiocoTrovaDadiUguali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dado dado1 = new Dado(6);
		Dado dado2 = new Dado(6);
		
		final int NUM_LANCI = 1_000_000_000;
		int vittorie = 0;
		
		long start = System.currentTimeMillis();
		for(int i = 0; i < NUM_LANCI; i++) {
			
			int res1 = dado1.lancia();
			int res2 = dado2.lancia();
			
//			System.out.println("dado 1 \t" + res1);
//			System.out.println("dado 2 \t" + res2);
			
			if (res1 == res2) {
				//vittorie = vittorie + 1;
//				vittorie += 1;
				vittorie++;
//				System.out.println("hai vinto");
			} else {
//				System.out.println("hai perso");
			}
		}
		long stop = System.currentTimeMillis();
		
		System.out.println("Hai vinto " + vittorie + " volte");
		System.out.println("l'elaborazione è durata: " + (stop-start));
	}

}
