package exercices;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class MyTextReaderTest {

	@Test
	public void withCorrectTextFile() throws Exception {
		String file = "data\\test.txt";
		String test = MyTextReader.readInputFile(file);
		Assert.assertEquals("ligne1\nligne2\n", test);
	}

	@Test
	public void withNoFile() {
		String file = "data\\falseTest.txt";
		try {
			MyTextReader.readInputFile(file);
		} catch (Exception e) {
			assertEquals("", e.getMessage());
		}
	}

}
