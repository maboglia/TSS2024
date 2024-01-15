package array;

public class MultiDimensionale {

	public static void main(String[] args) {

		int[][] coordinate = new int[3][2];
		
		int[][] coordinate2 = {
				{12,24,36},
				{13, 26},
				{11}
		}; 
		
		
		coordinate[0][0] = 2;
		coordinate[0][1] = 9;
		
		coordinate[1][0] = 8;
		coordinate[1][1] = 7;
		
		coordinate[2][0] = 6;
		coordinate[2][1] = 5;
		
		for (int i = 0; i < coordinate.length; i++) {
			
			for (int j = 0; j < 2; j++) {
				System.out.print(coordinate[i][j]+"|");
			}
			
			System.out.println("\n----");
			
		}

	}

}
