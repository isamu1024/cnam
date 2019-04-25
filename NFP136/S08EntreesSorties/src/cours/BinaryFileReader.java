package cours;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * This class reads a binary file containing int values
 * 
 * @author N/A
 *
 */

public class BinaryFileReader {

	File file;
	DataInputStream dataInputStream;

	/**
	 * Constructor : opens the file
	 * 
	 * @param fileName the input file pathname
	 * @throws IOException
	 */

	BinaryFileReader(String fileName) throws IOException {

		this.file = new File(fileName);
		FileInputStream fileInputStream = new FileInputStream(this.file);
		dataInputStream = new DataInputStream(fileInputStream);

	}

	/**
	 * Read one int at the current position in the stream
	 * 
	 * @return the int value that could be read.
	 * @throws IOException
	 */

	public int readInt() throws IOException {
		return dataInputStream.readInt();
	}

	/**
	 * Closes the file
	 */

	public void close() throws IOException {
		dataInputStream.close();
	}

	/**
	 *
	 * @param args
	 * @throws Exception
	 */

	public static void main(String[] args) throws Exception {

		String myInputFileName01 = "C:\\Users\\Alex et Rozenn\\git\\Cnam\\NFP136\\S08EntreesSorties\\data\\my_binary_file001.dat";
		BinaryFileReader myBinaryFileReader01 = new BinaryFileReader(myInputFileName01);
		boolean eof = false;// EOF = end of file
		while (!eof) {
			try {
				int curValue = myBinaryFileReader01.readInt();
				System.out.println(curValue);

			} catch (EOFException e) {
				eof = true; // end of file reach
				System.out.println("We have reached the end of file " + myBinaryFileReader01.file.getName());
				System.out.println("the length of the file is " + myBinaryFileReader01.file.length() + " bytes");
			}

		}
		myBinaryFileReader01.close();
	}

}
