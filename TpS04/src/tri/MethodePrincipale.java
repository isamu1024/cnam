/*
 * 
 * TP Séance 04 NFP136
 * https://github.com/isamu1024/cnam/tree/master/TpS04
 * 
 * 
 * Génération de listes aléatoires : https://www.random.org/integer-sets/
 * 
 * 
 */

//TODO Commenter les différentes étapes des méthodes de tri

package tri;

import java.util.Arrays;

public class MethodePrincipale {
	
	public static void main(String[] args) {
		 
		
		//Méthode tri à bulle
		
		System.out.printf("%s \n", "Méthode tri a bulle");
		
		int tab1[] = tableau();
		
		System.out.printf("\n%S \n\n","Tableau initial non trié");
		
		afficher(tab1);
		
		TriABulle.triBulle(tab1);
		
		System.out.printf("\n%S \n\n","Tableau final trié");
		
		afficher(tab1);
		
		System.out.printf("\n \n \n");
		
		
		//Méthode tri par insertion
		 
		
		System.out.printf("%s \n", "Méthode tri par insertion");

		int tab2[] = tableau();
		
		System.out.printf("\n%S \n\n","Tableau initial non trié");
		
		afficher(tab2);
		
		TriParInsertion.triParInsertion(tab2);
		
		System.out.printf("\n%S \n\n","Tableau final trié");
		
		afficher(tab2);
		
		System.out.printf("\n \n \n");		
	
		
		//Méthode tri par sélection
		
		System.out.printf("%s \n", "Méthode tri par sélection");		
		
		int tab3[] = tableau();
		
		System.out.printf("\n%S \n\n","Tableau initial non trié");
		
		afficher(tab3);
		
		TriParSelection.triParSelection(tab3);
		
		System.out.printf("\n%S \n\n","Tableau final trié");
		
		afficher(tab3);
		
		System.out.printf("\n \n \n");
		
		
		//Méthode tri de Shell
		
		System.out.printf("%s \n", "Méthode tri de Shell");		
		
		int tab4[] = tableau();
		
		afficher(tab4);
		
		TriDeShell.triDeShell(tab4);
		
		afficher(tab4);
		
		System.out.printf("\n \n \n");
		
	}
	
	private static int[] tableau() {
		
		int[] tableau = new int[] {9, 4, 13, 5, 1, 3};
		
		return tableau;
		
	}
	
	private static void afficher(int tableau[]) {
		
	
		Arrays.stream(tableau).forEach(l -> System.out.printf("%s:", l)); // https://stackoverflow.com/questions/36488806/using-printf-in-a-stream-in-java
		
		System.out.printf("\n");
			
	}

}
