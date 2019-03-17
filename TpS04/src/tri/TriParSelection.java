package tri;

public class TriParSelection {
	
	static int[] triParSelection(int tableau[]) {

		System.out.printf("%s \n","Entrée dans la fonction triParSelection");

		int swap;
		
		for (int i = 0; i <= tableau.length - 1; i++) {
			
			int indMinPartieNonTriee = i;
			
			for (int j = indMinPartieNonTriee; j <= tableau.length - 1; j++) {
				
				if (tableau[j] < tableau[indMinPartieNonTriee]) {
					

					indMinPartieNonTriee = j;
					
				}
				
			}
			
			swap = tableau[i];
			tableau[i] = tableau[indMinPartieNonTriee];
			tableau[indMinPartieNonTriee] = swap;

		}
		
		return tableau;
		
		
	}
	

}
