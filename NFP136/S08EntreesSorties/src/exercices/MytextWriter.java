/*
 * http://www.cafeconleche.org/books/xmljava/chapters/ch03s03.html
 */

package exercices;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class MytextWriter {

	static public void writeOutputFile(String outputFilename, String allTheLines[]) {

		try {
			// Création d'un flux de sortie de type FileOutputStream
			OutputStream ops = new FileOutputStream(outputFilename);
			// Caractérisation de l'encodage
			OutputStreamWriter opsw = new OutputStreamWriter(ops, "UTF8"); // martine Ã©crrit en UTF-8
			// Création d'un nouveau buffer de sortie
			BufferedWriter bw = new BufferedWriter(opsw);

			// Ecriture par balayage du buffer

			for (String curline : allTheLines) {
				bw.write(curline);
			}
			// Fermeture du buffer
			bw.close();
			System.out.println("File " + outputFilename + " was copied!");

		} catch (Exception e) {
			System.out.println(e.toString());
			System.exit(-1);
		}
	}
}
