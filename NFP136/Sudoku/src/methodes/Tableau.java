// méthode de manipulation de tableau en deux dimensions issue de la séance 4 (rappel de la NFP135)

package methodes;

public class Tableau {
	
	public static void main(String[] args) {
		
		int monTableau2D[][] = {{0,1},{2,3},{4,5}} ;
		for (int i=0 ; i < monTableau2D.length ; i++ ) {
		for (int j=0 ; j < monTableau2D[i].length ; j++ ) {
		System.out.println("monTableau2D["+i+"]["+j+"]="+monTableau2D[i][j] );
		}
		}
		
	}

}
