package tri;

public class TriDeShell {
	
	//Animation du tri de shell https://www.youtube.com/watch?v=1yk92IPV0BU
	
	static int[] triDeShell (int tableau[]) {
		
		System.out.printf("%s \n","Entr�e dans la fonction tri de shell");
		
		int pas = 0;
		int valIns =0;
		
		while (pas < tableau.length) {
			
			pas = (pas*3) +1;
			
		}
		
		pas = pas / 3;
		
		while ( pas > 1) {
			
			pas = pas / 3;
			
			
			for (int i = pas; i <= tableau.length - 1; i++) {
				
				valIns = tableau[i];
				
				int j = i;
				
				while (j > pas - 1 && tableau[j - pas] > valIns) {  // solution de la premi�re valeur non tri�e reprise de la r�ponse de Gabriel Bouty (merci � lui) 
					
					tableau[j] = tableau[j - pas];
					
					j = j - pas;
						
				} 
				
				tableau[j] = valIns;
			}
			
		}
		
		return tableau;
		
		
	}

}
