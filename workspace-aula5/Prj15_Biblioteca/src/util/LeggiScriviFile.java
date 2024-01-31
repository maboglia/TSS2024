package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LeggiScriviFile {

	public static ArrayList<String> leggi(File f){
		//System.out.println(f.canRead());
		ArrayList<String> righeFile = new ArrayList<String>();
		//System.out.println("Metodo leggi");
		
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			Scanner scanner = new Scanner(f);
			righeFile.add("test");
			String riga;
			while((riga = br.readLine())!=null) {
				if (riga.contains(";")) {
					righeFile.add(riga);
					//System.out.println(riga);
				}
				//System.out.println("lettura riga" + riga);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return righeFile;
	} 
	
	public static void scrivi(File f, String s) {
		
		try {
			PrintWriter out = new PrintWriter(f);
			out.print(s);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
