package collezioni;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Parolacce {

	public static void main(String[] args) throws IOException {
		
		Files
			.readAllLines(Paths.get("Z:\\Bogliaccino\\1000_parole_italiane_comuni.txt"))
			.stream()
			.filter(p -> p.length() == 6)
			.filter(p -> p.contains("m")||p.contains("r")||p.contains("l"))
			.forEach(System.out::println);
			;

	}

}
