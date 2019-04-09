package TpS06;

public class TriDeShell {
	
	//Animation du tri de shell https://www.youtube.com/watch?v=1yk92IPV0BU
	
	static int[] triDeShell (int tableau[]) {
		
		System.out.printf("%s \n","Entrée dans la fonction tri de shell");
		
		int pas = 0;
		int valIns =0;
		
		while (pas < tableau.length) {
			
			pas = (pas*3) +1;
		
		}
		
		System.out.printf("%s %s \n","Plus grand pas trouvé après premier dépassement de la longueur du tableau:",pas);
		
		pas = pas / 3;
		
		System.out.printf("%s %s \n","Pas courant:",pas);
		
		while ( pas > 1) {
			
			pas = pas / 3;
			
			System.out.printf("%s %s \n","pas courant:",pas);
			
			
			for (int i = pas; i <= tableau.length - 1; i++) {
				
				valIns = tableau[i];
					
				int j = i;
				
				while (j >= pas && tableau[j - pas] > valIns) {  // solution de la première valeur non triée reprise du TP de Gabriel Bouty (merci à lui) 
					
					tableau[j] = tableau[j - pas];
					
					j = j - pas;
						
				} 
				
				tableau[j] = valIns;
			}
						
		}
		
		return tableau;
		
		
	}

}
