package methodes;

import java.io.FileNotFoundException;

public class Driver {

	public static void main(String[] args) {

		
// découpage de la grille en région
//____________
//|re1|re2|re3|
//|re4|re5|re6|
//|re7|re8|re9|
//_____________
//
			
		Region region1 = new Region();
		Region region2 = new Region();
		Region region3 = new Region();
		Region region4 = new Region();
		Region region5 = new Region();
		Region region6 = new Region();
		Region region7 = new Region();
		Region region8 = new Region();
		Region region9 = new Region();

		ImportFile.lireFichierTest();
		ImportFile.lireGrilletest();
		
		try {
			ImportFile.lireGrilleScanner();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
