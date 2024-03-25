package concorrenza;

public class MioThread extends Thread{

	@Override
	public void run() {

		int counter = 5;
		
		for (int i = 0; i < counter; i++) {
			System.out.println("Sono il thread alla ripetizione " + i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				System.err.println("Mi sono rotto il thread :)");
			}
		}
		
		
	}

	
	
}
