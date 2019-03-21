/*
 * 
 * Methode pour tester la manipulation de fichier
 * 
 * 
 */


package methodes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ImportFile {


	static void lireFichier() {

		try { // try catch pour lever une exception en cas d'absence de fichier ou d'une erreur de lecture

			BufferedReader in = new BufferedReader(new FileReader("test.txt"));
			
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

}