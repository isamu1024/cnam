package pile;

public class Pile1 {
	
	public static void main(String[] args) {
		
		Character[] monTableauCar = new Character[100];
		
		Pile<Character> p01 = new Piletab01<Character>(monTableauCar, 25);
		
		try {
			
			System.out.println("p01 est vide ?" + p01.estVide());
		}
		
		catch(Exception e1) {
			
			System.err.println("Exception levée lors du test pile vide :" + e1);
			
		}
		
		for (int i = 65; i < 91; i++ ) {
			
			char c = (char) i;
			
			try {
				
				p01 = p01.push(c);
				System.out.println("J'empile " + c + " sur p01 ");
				
			}
			
			catch(Exception e1) {
				
				System.err.println("Ajout de " + c + " impossible :  + e1");
				
			}
			
			System.out.println("\nDépilons ! \n");
			
			while (!p01.estVide()) {
				
				System.out.println("Sommet de p01 => " + p01.getTop() );
				p01.pop();
				System.out.println("Je dépile p01 ! Vide p01 ? " + p01.estVide());
				
			}
			try {
				
				System.out.println("Essai Sommet de p01 => " + p01.getTop() );
				}
				catch (Exception e) {
				System.out.println("Rien à dépiler !" + e);
				}
				System.out.println("C'est fini !");
				
		}
		
	}

}
