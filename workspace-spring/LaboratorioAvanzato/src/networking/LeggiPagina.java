package networking;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class LeggiPagina {

	public static void main(String[] args) throws IOException {
		URL sitoWeb = new URL("https://raw.githubusercontent.com/maboglia/ProgrammingResources/master/StudentsPerformance.csv");
		URLConnection conn = sitoWeb.openConnection();
		
		Scanner input = new Scanner(conn.getInputStream(), StandardCharsets.UTF_8);
		
		while(input.hasNextLine()) {
			System.out.println(input.nextLine());
		}

	}

}
