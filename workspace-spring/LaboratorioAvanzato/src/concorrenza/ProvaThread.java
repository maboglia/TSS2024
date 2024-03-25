package concorrenza;

public class ProvaThread {

	public static void main(String[] args) {

		MioThread mt = new MioThread();
		
		mt.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Sono il main thread " + i);
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				System.err.println("Si è rotto il thread principale");
			}
		}
		

	}

}
