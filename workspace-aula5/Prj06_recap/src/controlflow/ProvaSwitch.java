package controlflow;

public class ProvaSwitch {

	public static void main(String[] args) {

		String lingua = "FR";
		
		switch (lingua) {
			case "FR":
				System.out.println("Bonjour");
				break;
			case "EN":
				System.out.println("Good morning");
				break;
	
			default:
				System.out.println("Hola! Buenos dias!");
				break;
		}
		
		

	}

}
