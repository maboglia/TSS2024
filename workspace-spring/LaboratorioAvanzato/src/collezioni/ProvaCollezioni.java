package collezioni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class ProvaCollezioni {

	public static void main(String[] args) {

		String[] note = {"do", "re", "mi","do", "re", "mi","do", "re", "mi"};
		
		
		
		List<String> parole = new LinkedList<String>(Arrays.asList(note));  //Arrays.asList(note);
		
		
		
		
		parole.addAll(List.of("do", "re", "do"));
		
		//Collections.sort(parole);
		
		Set<String> paroleSet = new HashSet<String>(parole);
		Set<String> paroleTreeSet = new TreeSet<String>(parole);
		
		parole.stream().sorted().forEach(s -> System.out.println(s));
		System.out.println("--------------");
		parole.forEach(s -> System.out.println(s));
		System.out.println("--------------");
		paroleTreeSet.forEach(System.out::println);
		
		
		
		
		System.out.println(paroleSet.size());
		
		

	}

}
