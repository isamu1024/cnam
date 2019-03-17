package tri;

public class TriABulle{


	static int[] triBulle(int tableau[]) {
		
		System.out.println("Entr�e dans la fonction triBulle");

		boolean permut;
		int indiceMax = tableau.length - 1;
		int swap = 0;
		int nombreDePermutation = 0;
		int operation = 0;
		
		do {
			
			permut = false;
			
			for ( int i = 1; i <= indiceMax; i++ ) { // j'ai but� une heure sur le non fonctionnement de la boucle car j'avais mis i == indiceMax (oui c'est idiot)
				
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
			
			indiceMax--; // Je ne comprends pas bien l'int�r�t de cette op�ration, la supprimmer n'a pas d'incidence sur les performances de la m�thode
			
		} while (permut == true);
		
		//System.out.println("Tableau tri� en: " + nombreDePermutation +" op�ration(s)");
		System.out.printf("%s %s %s %s %s \n", "Tableau tri� en:", operation, "op�ration(s) et", nombreDePermutation, "permutation(s)");
		return tableau;
		
	}

}
