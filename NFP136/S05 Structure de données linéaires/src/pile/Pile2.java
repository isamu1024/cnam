// insertion de la méthode 

package pile;

public class Pile2 {

	public static void main(String[] args) {

		Character[] monTableauCar2 = new Character[100];

		Pile<Character> p02 = new Piletab01<Character>(monTableauCar2, 26);

		try {

			System.out.println("p01 est vide ?" + p02.estVide());
		}

		catch(Exception e1) {

			System.err.println("Exception levée lors du test pile vide :" + e1);

		}

		for (int i = 65; i < 91; i++ ) {

			char c = (char) i;

			try {

				p02 = p02.push(c);
				System.out.println("J'empile " + c + " sur p02 ");

			}

			catch(Exception e1) {

				System.err.println("Ajout de " + c + " impossible :"  + e1);

			}

		}
		
		System.out.println("la pile a une hauteur de: " + p02.getHight());
		
		p02.renverse();
			
		for ( int i = 0; i < p02.getHight(); i ++ ) {
			
			System.out.printf("%s ", p02.afficher(i));
			
		}

	}

}
