package tri;

import java.util.Arrays;

public class TriABulle{

	public static void main(String[] args) {
		
		int tab[] = new int[] {43,1,5,13,4,9};
		
		Arrays.stream(tab).forEach(System.out::print);
		
		System.out.println();
		
		triBulle(tab);
		
		Arrays.stream(tab).forEach(System.out::print);
		
		System.out.println();
		
	
	}
	
	
	

	private static int[] triBulle(int tableau[]) {
		
		System.out.println("Entr�e dans la fonction triBulle");

		boolean permut;
		int indiceMax = tableau.length - 1;
		int swap = 0;
		int nombreDePermutation = 0;
		
		do {
			
			permut = false;
			
			for ( int i = 1; i <= indiceMax; i++ ) { // j'ai but� une heure sur le non fonctionnement de la boucle car j'avais mis == 
				
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
		
		System.out.println("Tableau tri� en: " + nombreDePermutation +" op�ration(s)");
		
		return tableau;
		
	}

}
