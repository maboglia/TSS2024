package demo;

public class ProvaArrayString {

	public static void main(String[] args) {
		//                 0    1   2     3     4     5     6
		String[] note = {"do","re","mi","fa", "sol", "la", "si"};
		
		System.out.println(note.length);
		
		for(int i = 0; i < note.length; i++) {
			System.out.println("La nota alla posizione " + i);
			System.out.println(note[i].toUpperCase());
		}

	}

}
