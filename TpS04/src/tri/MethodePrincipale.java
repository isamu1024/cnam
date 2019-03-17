/*
 * 
 * TP Seance 04 NFP136
 * https://github.com/isamu1024/cnam/tree/master/TpS04
 * 
 * 
 * G�n�ration de liste al�atoire : https://www.random.org/integer-sets/
 * 
 * 
 */

package tri;

import java.util.Arrays;

public class MethodePrincipale {
	
	public static void main(String[] args) {
		 
		
		//M�thode tri � bulle
		
		System.out.printf("%s \n", "M�thode tri a bulle");
		
		int tab1[] = tableau();
		
		afficher(tab1);
		
		TriABulle.triBulle(tab1);
		
		afficher(tab1);
		
		System.out.printf("\n \n \n");
		
		
		//M�thode tri par insertion
		
		System.out.printf("%s \n", "M�thode tri par insertion");

		int tab2[] = tableau();
		
		afficher(tab2);
		
		TriParInsertion.triParInsertion(tab2);
		
		afficher(tab2);
		
		System.out.printf("\n \n \n");		
	
		
		//M�thode tri par s�lection
		
		System.out.printf("%s \n", "M�thode tri par s�lection");		
		
		int tab3[] = tableau();
		
		afficher(tab3);
		
		TriParSelection.triParSelection(tab2);
		
		afficher(tab3);
		
		System.out.printf("\n \n \n");			
		
	}
	
	private static int[] tableau() {
		
		int[] tableau = new int[] {283, 196, 752, 162, 193, 467, 154, 681, 352, 582, 372, 500, 631, 390, 44, 532, 313, 785, 208, 231, 169, 438, 747, 580, 629, 12, 881, 734, 841, 100, 624};
		
		return tableau;
		
	}
	
	private static void afficher(int tableau[]) {
		
		Arrays.stream(tableau).forEach(i -> System.out.printf("%s:",i)); // https://stackoverflow.com/questions/36488806/using-printf-in-a-stream-in-java
		
		System.out.printf("\n");
			
	}

}
