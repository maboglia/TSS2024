package creazionali.singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();

		System.out.println(instance == instance2);
		
	}

}
