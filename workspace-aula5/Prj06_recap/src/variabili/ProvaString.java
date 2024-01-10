package variabili;

public class ProvaString {

	public static void main(String[] args) {
		//                 0    1    2    3
		char[] lettere = {'c', 'i', 'a', 'o'};

		String s1 = "";
		
		for (int i = 0; i < lettere.length; i++) {
			s1 += lettere[i];
		}
		System.out.println(s1);
		
		String s2 = new String(lettere);
		
		System.out.println(s2);
		
		char[] lettere2 = s2.toCharArray();
		
		System.out.println( s1 == s2    );
		
		String s3 = "ciao";
		String s4 = "ciao";
		
		System.out.println( s3 == s4    );
		System.out.println( s3.equals(s4)    );
		
		
	}

}
