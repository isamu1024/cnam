package tri;

public class TriABulle{


	static int[] triBulle(int tableau[]) {
		
		System.out.println("Entr�e dans la fonction triBulle");

		boolean permut;
		int indiceMax = tableau.length - 1;
		int swap = 0;
		int nombreDePermutation = 0;
		
		do {
			
			permut = false;
			
			for ( int i = 1; i <= indiceMax; i++ ) { // j'ai but� une heure sur le non fonctionnement de la boucle car j'avais mis i == indiceMax (oui c'est idiot)
				
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
