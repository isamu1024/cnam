package tpS06;

public class TriABulle {

	static int[] triBulle(int tableau[]) {

		boolean permut;
		int indiceMax = tableau.length - 1;
		int swap = 0;
		do {

			permut = false;

			for (int i = 1; i <= indiceMax; i++) { // j'ai but� une heure sur le non fonctionnement de la boucle car
													// j'avais mis i == indiceMax (oui c'est idiot)

				if (tableau[i - 1] > tableau[i]) {

					swap = tableau[i - 1];
					tableau[i - 1] = tableau[i];
					tableau[i] = swap;
					permut = true;

				}
			}

			indiceMax--; // Je ne comprends pas bien l'int�r�t de cette op�ration, la supprimmer n'a pas
							// d'incidence sur les performances de la m�thode

		} while (permut == true);

		return tableau;

	}

}
