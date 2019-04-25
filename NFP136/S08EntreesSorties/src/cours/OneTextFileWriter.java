package cours;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class OneTextFileWriter {

	static public void writeOutputFile(String outputFileName, String allTheLines[]) {

		try {
			FileWriter fw = new FileWriter(outputFileName);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter outfilepw = new PrintWriter(bw);

			for (String curLine : allTheLines) {
				outfilepw.println(curLine);
			}
			outfilepw.close();
			System.out.println("The file " + outputFileName + " was created!");
		} catch (Exception e) {
			System.out.println(e.toString());
			System.exit(-1);
		}

	}

	public static void main(String[] args) throws Exception {

		String myoutputFileName01 = "C:\\Users\\Alex et Rozenn\\git\\Cnam\\NFP136\\S08EntreesSorties\\data\\output01.txt";
		String allTheLines[] = { "Hello: this is the first line.", "Then comes the second one",
				"Eventually come the third and last line." };
		writeOutputFile(myoutputFileName01, allTheLines);

	}

}
