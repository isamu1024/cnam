package tri;

public class TriDeShell {
	
	//Animation du tri de shell https://www.youtube.com/watch?v=1yk92IPV0BU
	
	static int[] triDeShell (int tableau[]) {
		
		System.out.printf("%s \n","Entrée dans la fonction triParSelection");
		
		int pas = 0;
		
		while (pas < tableau.length) {
			pas = (pas * 3) +1;
			
		}
		
		pas = pas / 3;
		
		while ( pas > 1) {
			
			pas = pas / 3;
			
			
			for (int i = pas; i <= tableau.length - 1; i++) {
				
				int valIns = tableau[i];
				
				int j = i;
				
				do {
					// j'ai eu une erreur ici, le premier élément du tableau n'était pas trié, car je faisais un while simple qui n'éxécutait pas une première fois le code
					tableau[j] = tableau[j - pas];
					j = j - pas;
						
				} while (j > pas && tableau[j - pas] > valIns);
				
				tableau[j] = valIns;
			}
			
		}
		
		return tableau;
		
		
	}

}
