package tri;

public class TriParInsertion {

		static int[] triParInsertion(int tableau[]) {
			
			System.out.printf("%s \n","Entrée dans la fonction triParInsertion");			
			
			for (int i = 1; i <= tableau.length -1; i++) {
				
				
				int valIns = tableau[i];
				int j = i;
				
				while (j > 0 && tableau[j-1] > valIns) {

					tableau[j] = tableau[j-1];
					j--;
					
				}
				
				tableau[j] = valIns;
				
			}
			
			return tableau;
			
		
	}

}
