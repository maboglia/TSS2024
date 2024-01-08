package modelli;

public class StudenteDemo {

	public static void main(String[] args) {
		
		Studente s1 = new Studente("pippo", "pippo", 2000);
		
		s1.sostieneEsame(30, 0);
		s1.sostieneEsame(20, 1);
		s1.sostieneEsame(23, 2);
		s1.sostieneEsame(25, 3);
		s1.sostieneEsame(24, 4);
		s1.sostieneEsame(28, 5);
		s1.sostieneEsame(30, 6);

		System.out.println("lo studente");
		System.out.println(s1.informazioni());
		System.out.println("ha la media");
		System.out.println(s1.calcolaMedia());
		s1.sostieneEsame(18, 7);
		System.out.println("adesso ha la media");
		System.out.println(s1.calcolaMedia());
	}

}
