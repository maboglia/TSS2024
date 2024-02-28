package stream;

import java.util.Arrays;
import java.util.List;

public class ProvaFunzionale {

	public static void main(String[] args) {
		
		String[] amiciArray = {"oscar","dario", "mauro", "luca", "paolo", "paolo", "dario"};
		
		List<String> asList = Arrays.asList(amiciArray);  
		
		List<String> amiciFiltrati =  asList
			.stream()
			.filter(a -> a.endsWith("o"))
			.filter(a -> a.charAt(2)== 'o')
//			.limit(1)
			.toList();
			//.forEach(a -> System.out.println(a));//Consumer
		System.out.println(asList);
		System.out.println(amiciFiltrati);
	}

}
