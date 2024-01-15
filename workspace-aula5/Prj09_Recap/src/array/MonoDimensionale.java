package array;

import java.util.Arrays;

public class MonoDimensionale {

	public static void main(String[] args) {

		int[] voti = new int[5];

		int[] voti2 = {25,24,26,28,27};
		Arrays.sort(voti2);
		voti[0] = 22;
		voti[1] = 23;
		voti[2] = 24;
		voti[3] = 25;
		voti[4] = 26;
		
		for (int voto : voti2) {
			System.out.println(voto);
		}
	
	}

}
