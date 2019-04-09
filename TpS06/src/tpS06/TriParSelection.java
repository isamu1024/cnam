package tpS06;


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
			
			System.out.printf("%s %s\n","Plus petite valeur trouvée dans la partie non triée:",tableau[indMinPartieNonTriee]);
			swap = tableau[i];
			tableau[i] = tableau[indMinPartieNonTriee];
			tableau[indMinPartieNonTriee] = swap;
			System.out.printf("%s %s %s %s\n","permutation de",tableau[indMinPartieNonTriee],"avec",tableau[i]);

		}
		
		return tableau;
		
		
	}
	

}
