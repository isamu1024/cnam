package tpS06;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TriDeShell {

	// Animation du tri de shell https://www.youtube.com/watch?v=1yk92IPV0BU

	static int[] triDeShell(int tableau[]) {

		final Logger logger = LogManager.getLogger(TriDeShell.class.getName());

		if (logger.isDebugEnabled())
			logger.debug("Entr�e dans la fonction tri de shell");

		int pas = 0;
		int valIns = 0;

		while (pas < tableau.length) {

			pas = (pas * 3) + 1;

		}

		pas = pas / 3;

		while (pas > 1) {

			pas = pas / 3;

			for (int i = pas; i <= tableau.length - 1; i++) {

				valIns = tableau[i];

				int j = i;

				while (j >= pas && tableau[j - pas] > valIns) { // solution de la premi�re valeur non tri�e reprise du
																// TP de Gabriel Bouty (merci � lui)

					tableau[j] = tableau[j - pas];

					j = j - pas;

				}

				tableau[j] = valIns;
			}

		}

		return tableau;

	}

}
