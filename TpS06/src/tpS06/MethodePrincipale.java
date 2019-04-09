package tpS06;

// Reprise du TP sur les Tris

// Implantation des test et des Logs via log4j

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MethodePrincipale {

	private static final Logger logger = LogManager.getLogger(MethodePrincipale.class.getName());

	public static void main(String[] args) {

		// Méthode tri à bulle

		System.out.printf("%s \n \n", "Méthode tri à bulle");

		if (logger.isDebugEnabled())
			logger.debug("Génération du tableau tab1");

		int tab1[] = tableau();

		if (logger.isDebugEnabled())
			logger.debug("Appel de la méthode TriABulle.triBulle(tab1)");

		TriABulle.triBulle(tab1);

		System.out.printf("\n%S \n\n", "Tableau final trié");

		afficher(tab1);

		System.out.printf("\n \n \n");

		// Méthode tri par insertion

		System.out.printf("%s \n \n", "Méthode tri par insertion");

		if (logger.isDebugEnabled())
			logger.debug("Génération du tableau tab2");

		int tab2[] = tableau();

		if (logger.isDebugEnabled())
			logger.debug("Appel de la méthode TriParInsertion.triParInsertion(tab2)");

		TriParInsertion.triParInsertion(tab2);

		System.out.printf("\n%S \n\n", "Tableau final trié");

		afficher(tab2);

		System.out.printf("\n \n \n");

		// Méthode tri par sélection

		System.out.printf("%s \n \n", "Méthode tri par sélection");

		if (logger.isDebugEnabled())
			logger.debug("Génération du tableau tab3");

		int tab3[] = tableau();

		if (logger.isDebugEnabled())
			logger.debug("Appel de la méthode TriParSelection.triParSelection(tab3)");

		TriParSelection.triParSelection(tab3);

		System.out.printf("\n%S \n\n", "Tableau final trié");

		afficher(tab3);

		System.out.printf("\n \n \n");

		// Méthode tri de Shell

		System.out.printf("%s \n \n", "Méthode tri de Shell");

		if (logger.isDebugEnabled())
			logger.debug("Génération du tableau tab4");

		int tab4[] = tableau();

		if (logger.isDebugEnabled())
			logger.debug("Appel de la méthode TriDeShell.triDeShell(tab4)");

		TriDeShell.triDeShell(tab4);

		System.out.printf("\n%S \n\n", "Tableau final trié");

		afficher(tab4);

		System.out.printf("\n \n \n");

	}

	private static int[] tableau() {

		int[] tableau = new int[] { 5, 10, 1, 3, 7, 4, 2, 6, 9, 8 };

		return tableau;

	}

	private static void afficher(int tableau[]) {

		Arrays.stream(tableau).forEach(l -> System.out.printf("%s:", l)); // https://stackoverflow.com/questions/36488806/using-printf-in-a-stream-in-java

		System.out.printf("\n");

	}

}
