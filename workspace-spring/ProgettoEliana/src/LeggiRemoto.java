import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

public class LeggiRemoto {

	public static void main(String[] args) throws IOException {

		URL url = new URL("https://www.lastampa.it/");
		
		url.openConnection();
		
		PrintWriter pw = new PrintWriter("files/stampa.html");
		
		Scanner input = new Scanner(url.openStream());
		
		while(input.hasNextLine()) {
			pw.println(input.nextLine());
		}
		pw.close();

	}

}
