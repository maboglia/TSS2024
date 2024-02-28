package test;

import java.io.IOException;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import controller.LeggiScriviFile;
import model.Provincia;

public class ProvinceDemo {

	public static void main(String[] args) {

		try {
			List<Provincia> province = LeggiScriviFile.leggi("files/popolazione_ita.csv");
		
		
			IntSummaryStatistics totalePop = province
				.stream()
				.filter(p -> p.getTotale() > 500000)
				.mapToInt(p -> p.getTotale())
				.summaryStatistics();
				//.forEach(p -> System.out.println(p));

//			System.out.println("La popolazione totale delle province con oltre 500mila ");
//			System.out.println(totalePop);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		IntStream voti = IntStream.of(24,25,28,30,18,19,26,26);

		System.out.println(voti.average());
		
	}

}
