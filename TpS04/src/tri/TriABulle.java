package tri;

import java.util.Arrays;

public class TriABulle{

	public static void main(String[] args) {
		
		int tab[] = new int[] {283, 196, 752, 162, 193, 467, 154, 681, 352, 582, 372, 500, 631, 390, 44, 532, 313, 785, 208, 231, 169, 438, 747, 580, 629, 12, 881, 734, 841, 100, 624};
		
		Arrays.stream(tab).forEach(i -> System.out.printf("%s : ",i ));
		
		System.out.println();
		
		triBulle(tab);
		
		Arrays.stream(tab).forEach(i -> System.out.printf("%s : ",i ));
		
		System.out.println();
		
	
	}
	
	
	

	private static int[] triBulle(int tableau[]) {
		
		System.out.println("Entrée dans la fonction triBulle");

		boolean permut;
		int indiceMax = tableau.length - 1;
		int swap = 0;
		int nombreDePermutation = 0;
		
		do {
			
			permut = false;
			
			for ( int i = 1; i <= indiceMax; i++ ) { // j'ai buté une heure sur le non fonctionnement de la boucle car j'avais mis i == indiceMax (oui c'est idiot)
				
				if ( tableau[i-1] > tableau[i] ) {
					
					swap = tableau[i-1];
					tableau[i-1] = tableau[i];
					tableau[i] = swap;
					permut = true;
					nombreDePermutation ++;	
				}	
			}
			
			indiceMax--;
			
		} while (permut == true);
		
		System.out.println("Tableau trié en: " + nombreDePermutation +" opération(s)");
		
		return tableau;
		
	}

}
