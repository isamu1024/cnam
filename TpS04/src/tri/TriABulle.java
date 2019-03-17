package tri;

public class TriABulle{


	static int[] triBulle(int tableau[]) {
		
		System.out.println("Entrée dans la fonction triBulle");

		boolean permut;
		int indiceMax = tableau.length - 1;
		int swap = 0;
		int nombreDePermutation = 0;
		int operation = 0;
		
		do {
			
			permut = false;
			
			for ( int i = 1; i <= indiceMax; i++ ) { // j'ai buté une heure sur le non fonctionnement de la boucle car j'avais mis i == indiceMax (oui c'est idiot)
				
				operation++;
				
				if ( tableau[i-1] > tableau[i] ) {
					
					swap = tableau[i-1];
					tableau[i-1] = tableau[i];
					tableau[i] = swap;
					permut = true;
					operation++;
					nombreDePermutation ++;	
					
				}	
			}
			
			indiceMax--; // Je ne comprends pas bien l'intérêt de cette opération, la supprimmer n'a pas d'incidence sur les performances de la méthode
			
		} while (permut == true);
		
		//System.out.println("Tableau trié en: " + nombreDePermutation +" opération(s)");
		System.out.printf("%s %s %s %s %s \n", "Tableau trié en:", operation, "opération(s) et", nombreDePermutation, "permutation(s)");
		return tableau;
		
	}

}
