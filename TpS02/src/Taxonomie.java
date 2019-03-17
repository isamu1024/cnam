
public class Taxonomie {
	
	/*
	 * 
	 * Alexandre Moro
	 * 
	 * TP NFP136 S02 - Implantation des classes vues en cours 
	 * Mise en �vidence des propri�t�s de polymorphisme
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		

		Chat chat1 = new Chat("felix","chat de type europ�en");
		
		System.out.print(chat1.getNom() + " est un " + chat1.getRace() + ". \n");
		System.out.print("," + chat1.boireDuLait(2) + ". \n") ;
		System.out.print(chat1.signeParticulier() + "\n");
		System.out.print(chat1.naitre() + ". \n");
		System.out.print(chat1.mourir() + ",pauvre b�te. \n");
		System.out.println();
		
		Chat chat2 = new Chat("Garfield","chat de gouti�re");
		
		System.out.print(chat2.getNom() + " est un " + chat2.getRace() + ". \n");
		System.out.print("," + chat2.boireDuLait(33) + ". \n") ;
		System.out.print(chat2.signeParticulier() + "\n");		
		System.out.print(chat2.naitre() + ". \n");
		System.out.print(chat2.mourir() + ",pauvre b�te. \n");
		System.out.println();
		
		Poisson poisson1 = new Poisson("N�mo","poisson clown");
		
		System.out.print(poisson1.getNom() + " est un " + poisson1.getRace() +". \n");
		System.out.print(poisson1.signeParticulier(2) + ".\n");
		System.out.print(poisson1.naitre() + ". \n");
		System.out.print(poisson1.mourir() + ",pauvre b�te. \n");
		System.out.println();
		
		Poisson poisson2 = new Poisson("Marko Ramius","poisson de classe typhon");
		
		System.out.print(poisson2.getNom() + " est un " + poisson2.getRace() +". \n");
		System.out.print(poisson2.signeParticulier(0) + ".\n");
		System.out.print(poisson2.naitre() + ". \n");
		System.out.print(poisson2.mourir() + ",pauvre b�te. \n");
		System.out.println();
		
		Baleine baleine1 = new Baleine("Moby Dick","baleine bleue");
		
		System.out.print(baleine1.getNom() + " est une " + baleine1.getRace() +". \n");		
		System.out.print(baleine1.boireDuLait(1)+ ". \n");
		System.out.print(baleine1.nager() + ".\n");
		System.out.print(baleine1.naitre() + ". \n");
		System.out.print(baleine1.mourir() + ",pauvre b�te. \n");
		System.out.println();
		
		Baleine baleine2 = new Baleine("Monstro","baleine cellulo");

		System.out.print(baleine2.getNom() + " est une " + baleine2.getRace() +". \n");
		System.out.print(baleine2.boireDuLait(1) +". \n");
		System.out.print(baleine2.nager() + ".\n");
		System.out.print(baleine2.naitre() + ". \n");
		System.out.print(baleine2.mourir() + ",pauvre b�te. \n");
		System.out.println();
		
		// Tout �a est bien laborieux et indigeste, En utilisant une liste ou un tableau � plusieurs dimensiosn on devrait
		// pouvoire all�ger tout �a (enfin je pense ...), mais � mon niveau je ne suis pas certains d'y arriver.
		
		
	}

}

