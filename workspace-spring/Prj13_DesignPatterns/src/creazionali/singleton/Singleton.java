package creazionali.singleton;

public class Singleton {
	
	private static Singleton instance = null;
	
	private Singleton() {
		System.out.println("Oggetto singleton costruito");
	}
	
	public static Singleton getInstance() {
	
		if (instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}
	
	public String speak() {
		return "Hola!";
	}
	
}
