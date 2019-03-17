/*
 * 
 * TP Seance 04 NFP136
 * https://github.com/isamu1024/cnam/tree/master/TpS04
 * 
 * 
 * Génération de liste aléatoire : https://www.random.org/integer-sets/
 * 
 * 
 */

package tri;

import java.util.Arrays;

public class MethodePrincipale {
	
	public static void main(String[] args) {
		
		int tab[] = new int[] {283, 196, 752, 162, 193, 467, 154, 681, 352, 582, 372, 500, 631, 390, 44, 532, 313, 785, 208, 231, 169, 438, 747, 580, 629, 12, 881, 734, 841, 100, 624};
		
		//Méthode tri à bulle
		
		Arrays.stream(tab).forEach(i -> System.out.printf("%s : ",i )); // https://stackoverflow.com/questions/36488806/using-printf-in-a-stream-in-java
		
		System.out.println();
		
		TriABulle.triBulle(tab);
		
		Arrays.stream(tab).forEach(i -> System.out.printf("%s : ",i ));
		
		System.out.println();
		
		
		//Méthode tri par insertion
		
		
	
	}

}
