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

	static void gridToArray (String fichier) {

		//TODO Générer une liste avec les int parsés dans le fichier texte en se basant sur afficherGrille

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

			System.out.println("Erreur dans la génération du tableau");
			e.printStackTrace();

		}


	}

}


