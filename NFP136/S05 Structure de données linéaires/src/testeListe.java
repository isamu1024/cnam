import java.util.ArrayList;
import java.util.List;

public class testeListe {

	public static void main(String[] args) {

		List<Boisson> myList; // D�claration de la variable myList
		// qui peut stocker une r�f�rence � tout type d'objet qui 
		// impl�mente l'interface List (comme ArrayList) typ�e par Boisson :
		//La liste ne contiendra que des r�f�rences � des instances de classe Boisson.

		myList = new ArrayList<Boisson>(); // appel du constructeur

		myList.add( new Boisson("eau"));
		myList.add( new Boisson("th�"));
		myList.add( new Boisson("caf�"));
		myList.add( new Boisson("chocolat"));


	}

}
