package TpS06;

import java.util.Arrays;

public class TriABulle{


	static int[] triBulle(int tableau[]) {
		
		System.out.println("Entr�e dans la fonction triBulle");

		boolean permut;
		int indiceMax = tableau.length - 1;
		int swap = 0;		
		do {
			
			permut = false;
			
			for ( int i = 1; i <= indiceMax; i++ ) { // j'ai but� une heure sur le non fonctionnement de la boucle car j'avais mis i == indiceMax (oui c'est idiot)
				
				System.out.printf("%s \n","Balayage du tableau");
				
				if ( tableau[i-1] > tableau[i] ) {
					
					System.out.printf("%s %s %s %s \n","Permutation de la valeur",tableau[i-1],"avec la valeur",tableau[i]);	
					swap = tableau[i-1];
					tableau[i-1] = tableau[i];
					tableau[i] = swap;
					permut = true;
					
					Arrays.stream(tableau).forEach(l -> System.out.printf("%s:",l)); // https://stackoverflow.com/questions/36488806/using-printf-in-a-stream-in-java
					System.out.printf("\n");
				}	
			}
			
			indiceMax--; // Je ne comprends pas bien l'int�r�t de cette op�ration, la supprimmer n'a pas d'incidence sur les performances de la m�thode
			
		} while (permut == true);
		
		return tableau;
		
	}
	
}


