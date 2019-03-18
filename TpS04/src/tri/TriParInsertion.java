package tri;

import java.util.Arrays;

public class TriParInsertion {

		static int[] triParInsertion(int tableau[]) {
			
			System.out.printf("%s \n","Entrée dans la fonction triParInsertion");			
			
			for (int i = 1; i <= tableau.length -1; i++) {
				
				//System.out.printf("%s \n","Balayage du tableau");				
				
				int valIns = tableau[i];
				
				if (i == 1) {
					
					System.out.printf("%s\n%s\n","on échappe la première valeur pour","initialiser la première partie");	
					
				}
				
				System.out.printf("%s %s \n","stockage dans le tampon de la valeur",tableau[i]);	
				
				int j = i;
				
				System.out.printf("%s \n","Insertion dans la première partie");				
				
				while (j > 0 && tableau[j-1] > valIns) {
					
					System.out.printf("%s %s \n","tri de la première partie, comparaison avec la valeur :",tableau[j-1]);					
					
					tableau[j] = tableau[j-1];
					j--;
					
				}
				
				if (valIns == tableau[j]) {
					
					System.out.printf("%s \n","Pas de permutation");
					
				} else {
					
					System.out.printf("%s %s %s %s \n","permutation de la valeur",tableau[j],"avec la valeur",valIns);
					
				}
				
				
				tableau[j] = valIns;
				
				Arrays.stream(tableau).forEach(l -> System.out.printf("%s:",l));
				System.out.printf("\n");
				
			}
			
			return tableau;
			
		
	}

}
