package tpS06;
/*
 * 
 * TP S�ance 04 NFP136
 * 
 * Repo :
 * https://github.com/isamu1024/cnam/tree/master/TpS04
 * 
 * 
 * G�n�ration de listes al�atoires : https://www.random.org/integer-sets/
 * 
 * 
 */

//TODO Commenter les diff�rentes �tapes des m�thodes de tri



import java.util.Arrays;

public class MethodePrincipale {
	
	public static void main(String[] args) {
		 
		
		//M�thode tri � bulle
		
		System.out.printf("%s \n", "M�thode tri a bulle");
		
		int tab1[] = tableau();
		
		System.out.printf("\n%S \n\n","Tableau initial non tri�");
		
		afficher(tab1);
		
		TriABulle.triBulle(tab1);
		
		System.out.printf("\n%S \n\n","Tableau final tri�");
		
		afficher(tab1);
		
		System.out.printf("\n \n \n");
		
		
		//M�thode tri par insertion
		 
		
		System.out.printf("%s \n", "M�thode tri par insertion");

		int tab2[] = tableau();
		
		System.out.printf("\n%S \n\n","Tableau initial non tri�");
		
		afficher(tab2);
		
		TriParInsertion.triParInsertion(tab2);
		
		System.out.printf("\n%S \n\n","Tableau final tri�");
		
		afficher(tab2);
		
		System.out.printf("\n \n \n");		
	
		
		//M�thode tri par s�lection
		
		System.out.printf("%s \n", "M�thode tri par s�lection");		
		
		int tab3[] = tableau();
		
		System.out.printf("\n%S \n\n","Tableau initial non tri�");
		
		afficher(tab3);
		
		TriParSelection.triParSelection(tab3);
		
		System.out.printf("\n%S \n\n","Tableau final tri�");
		
		afficher(tab3);
		
		System.out.printf("\n \n \n");
		
		
		//M�thode tri de Shell
		
		System.out.printf("%s \n", "M�thode tri de Shell");		
		
		int tab4[] = tableau();
		
		System.out.printf("\n%S \n\n","Tableau initial non tri�");
		
		afficher(tab4);
		
		TriDeShell.triDeShell(tab4);
		
		System.out.printf("\n%S \n\n","Tableau final tri�");
		
		afficher(tab4);
		
		System.out.printf("\n \n \n");
		
	}
	
	private static int[] tableau() {
		
		int[] tableau = new int[] {5, 10, 1, 3, 7, 4, 2, 6, 9, 8};
		
		return tableau;
		
	}
	
	private static void afficher(int tableau[]) {
		
	
		Arrays.stream(tableau).forEach(l -> System.out.printf("%s:", l)); // https://stackoverflow.com/questions/36488806/using-printf-in-a-stream-in-java
		
		System.out.printf("\n");
			
	}

}
