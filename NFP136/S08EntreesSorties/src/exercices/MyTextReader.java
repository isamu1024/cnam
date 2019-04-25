package exercices;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MyTextReader {

	// methode lecture fichier de type texte

	public static String readInputFile(String inputFilename) {

		// Cr�ation d'un buffer de type String
		StringBuffer content = new StringBuffer();

		try {

			// Creation d'un nouvel InputStream
			InputStream ips = new FileInputStream(inputFilename);

			// La classe InputStreamReader �tablit un pont entre les flux d'octets et les
			// flux de caract�res. Cette classe permet de lire des octets et les traduit en
			// caract�res en utilisant un d�codage sp�cifique. L'appel de la m�thode read()
			// d'un InputStreamReader va effectuer la lecture de 1 ou plusieurs octets.

			// La norme ISO 8859-1, dont le nom complet est ISO/CEI 8859-1, et qui est
			// souvent appel�e Latin-1 ou Europe occidentale
			InputStreamReader ipsr = new InputStreamReader(ips, "ISO8859-1");

			// Creation du buffer de lecture
			BufferedReader br = new BufferedReader(ipsr);

			String line;

			// Boucle de lecture
			while ((line = br.readLine()) != null) {
				content.append(line); // on rajoute la ligne au buffer
				content.append("\n"); // passage � la ligne
			}

			br.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());

			// TODO utiliser Junit
		}

		return content.toString(); // la m�thode retourne un buffer String
	}
}
