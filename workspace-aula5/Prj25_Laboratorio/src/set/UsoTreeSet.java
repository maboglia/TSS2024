package set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class UsoTreeSet {

	public static void main(String[] args) {

		String[] amiciArray = {"oscar","dario", "mauro", "luca", "paolo", "paolo", "dario"};
		
		List<String> amici = Arrays.asList(amiciArray);

		amici.forEach(a -> System.out.println(a));
		
		System.out.println("\n------------------------------------");
		
		Set<String> invitati = amici.stream().collect(Collectors.toSet());  
		
		invitati.forEach(a -> System.out.println(a));
		

	}

}
