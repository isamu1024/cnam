/*
 * 
 * Methode pour tester la manipulation de fichier
 * 
 * 
 */


package methodes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class ImportFile {


	static void lireFichierTest() {

		try { // try catch pour lever une exception en cas d'absence de fichier ou d'une erreur de lecture

			BufferedReader in = new BufferedReader(new FileReader("test\\test.txt"));

			//http://www-labs.iro.umontreal.ca/~dift6810/fichier1.pdf  __ exemple manipumation de fichiers
			//https://stackoverflow.com/questions/1480398/java-reading-a-file-from-current-directory   -- lient expliquant que le txt est par défaut dans le project directory

			String str;

			while ((str=in.readLine()) != null ) {

				System.out.printf("%s",str);

			}

			in.close();

		}catch (IOException e) {		
			e.printStackTrace();
		}


	}

	static void lireGrilletest() {

		// Lit la 

		try { 
			BufferedReader in = new BufferedReader(new FileReader("test\\grille1.txt"));

			String str;

			while ((str=in.readLine()) != null) {

				// On ignore les ligns commençant par #
				if (str.contains("#")) {
					continue;
				}

				System.out.printf("%s \n", str);

			}

			in.close();

		}catch (IOException e) {		
			e.printStackTrace();
		}



	}

	static int [][] lireGrilleScanner() throws FileNotFoundException {

		//TODO revoir la levée d'exception


		//https://stackoverflow.com/questions/18816688/using-bufferedreader-in-java-to-read-a-line-of-ints-before-reading-lines-of-stri

		int[][] grid = new int[9][9]; // initialisation de la grille
		int i,j = 0; // initialisation des incréments, i balayage ligne j décalage ligne
		char current;
		boolean complete = false;

		Scanner sc = new Scanner(new File("test\\grille1.txt"));

			for (i = 0; i <= grid.length; i ++) {

				// https://www.geeksforgeeks.org/gfact-51-java-scanner-nextchar/

				current = sc.next().charAt(0);

				if (current == '.') {

					grid[j][i] = 0;

				} else {

					grid[j][i] = Character.getNumericValue(current);

				}
				
				j++;

			}

			
			System.out.println();
			System.out.println(grid[2][2]);
			
		return grid;

	}
}


