package demo;

public class ProvaString {

	public static void main(String[] args) {


		String saluto = "ciao";//primo modo per inizializzare una stringa
		String salutoObj = new String("ciao");//secondo modo per inizializzare una stringa
		
		char[] saluto2 = {'c','i','a','o'};
		
		char[] saluto3 = saluto.toCharArray();//ottengo un char[] da una String
		
		String saluto4 = new String(saluto2);//ottengo una String da un char[]
		
		
		char primochar = saluto.charAt(0);
		char primochar2 = saluto2[0];
		
		System.out.println(primochar == primochar2);
		
		System.out.println(saluto.length() == saluto2.length );

	}

}
