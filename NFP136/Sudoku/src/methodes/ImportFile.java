/*
 * 
 * Methode pour tester la manipulation de fichier
 * 
 * 
 */


package methodes;

import java.io.*;
import java.util.Scanner;

public class ImportFile {


	static void afficherGrille (String fichier) {
	
	String current;

	try { 

		Scanner sc = new Scanner(new File(fichier));


		while (sc.hasNext()) {

			current = sc.next();

			if (current.contains("#")) {

				sc.nextLine();

			} else {

				current = current.replace('.', '0');  // String est une variable immuable, pour remplacer une valeur il faut passer par la fonction replace (swap de char)
				
				System.out.println(current);

			}

		}

		sc.close();

	}

	catch (IOException e) {		
		e.printStackTrace();
	}
	
	}
	
}


