package cours;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class OneTextFileReader {

	static public String readInputFile(String inputFileName) {

		StringBuffer content = new StringBuffer(); // Création du buffer qui contiendra les String lus par le BR
		try {
			InputStream ips = new FileInputStream(inputFileName);

			// An InputStreamReader is a bridge from byte streams to character streams: It
			// reads bytes and decodes them into characters using a specified charset. The
			// charset that it uses may be specified by name or may be given explicitly, or
			// the platform's default charset may be accepted.

			InputStreamReader ipsr = new InputStreamReader(ips, "ISO8859-1"); // caractérisation de l'encodage

			// Reads text from a character-input stream, buffering characters so as to
			// provide for the efficient reading of characters, arrays, and lines.

			BufferedReader br = new BufferedReader(ipsr);

			String line;

			while ((line = br.readLine()) != null) { // tant que la méthode readline de BufferReader est non ulle
				System.out.println(line);
				content.append(line); // rajouter la ligne au buffer
				content.append("\n"); // passage à la ligne
			}
			br.close(); // fermeture, libération de la mémoire
		} catch (Exception e) {
			System.out.println(e.toString()); // voir
												// https://stackoverflow.com/questions/10120709/difference-between-printstacktrace-and-tostring
		}
		return content.toString();
	}

	public static void main(String args[]) throws Exception {

		String myInputFileName01 = "data/README.TXT";
		readInputFile(myInputFileName01);
	}

}
