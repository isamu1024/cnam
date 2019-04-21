import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileWriter {

	File file;
	DataOutputStream dataOutputStream;

	BinaryFileWriter(String fileName) throws IOException {
		this.file = new File(fileName);
		FileOutputStream fileOutputStream = new FileOutputStream(this.file);
		dataOutputStream = new DataOutputStream(fileOutputStream);
	}

	public void writeInt(int value) throws IOException {
		dataOutputStream.writeInt(value);
	}

	public void close() throws IOException {
		dataOutputStream.close();
	}

	public static void main(String[] args) throws Exception {

		String myOutputFileName01 = "C:\\Users\\Alex et Rozenn\\git\\Cnam\\NFP136\\S08EntreesSorties\\data\\my_binary_file001.dat"; // voir comment utiliser le rep courant
		BinaryFileWriter myBinaryFileWriter01 = new BinaryFileWriter(myOutputFileName01);
		int myIntArray[] = { -1, 0, 1, 2 };
		for (int curValue : myIntArray) {
			myBinaryFileWriter01.writeInt(curValue);
		}
		myBinaryFileWriter01.close();
	}

}
