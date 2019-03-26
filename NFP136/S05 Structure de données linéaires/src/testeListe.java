import java.util.ArrayList;
import java.util.List;

public class testeListe {

	public static void main(String[] args) {

		List<Boisson> myList; // Déclaration de la variable myList
		// qui peut stocker une référence à tout type d'objet qui 
		// implémente l'interface List (comme ArrayList) typée par Boisson :
		//La liste ne contiendra que des références à des instances de classe Boisson.

		myList = new ArrayList<Boisson>(); // appel du constructeur

		myList.add( new Boisson("eau"));
		myList.add( new Boisson("thé"));
		myList.add( new Boisson("café"));
		myList.add( new Boisson("chocolat"));


	}

}
