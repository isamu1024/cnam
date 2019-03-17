package tri;

public class TriParInsertion {

		static int[] triParInsertion(int tableau[]) {
			
			int operation = 0; 
			
			System.out.println("Entrée dans la fonction triParInsertion");			
			
			for (int i = 1; i <= tableau.length -1; i++) {
				
				operation++;
				
				int valIns = tableau[i];
				int j = i;
				
				while (j > 0 && tableau[j-1] > valIns) {
					
					operation++;
					
					tableau[j] = tableau[j-1];
					j--;
					
				}
				
				tableau[j] = valIns;
				
			}
			
			System.out.printf("%s %s %s \n", "Tableau trié en :", operation, "opération(s)");
			
			return tableau;
			
		
	}

}
