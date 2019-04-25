package exercices;

public class MytextCopier {

	public static void main(String[] args) {

		String myInputfileName = "data/ex1SourceTextFile.txt"; // initialisation du fichier source
		String OriginalsLines[] = { MyTextReader.readInputFile(myInputfileName) }; // création d'un tableau de String
																					// contenant le buffer de sortie de
																					// la méthode MyTextReader
		String outputFilename = "data/ex1CopiedTextFile"; // initialisation du fichier de sortie

		MytextWriter.writeOutputFile(outputFilename, OriginalsLines); // appel de la méthode writeOutputFile

	}

}
