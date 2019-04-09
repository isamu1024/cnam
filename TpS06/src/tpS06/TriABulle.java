package tpS06;

public class TriABulle {

	static int[] triBulle(int tableau[]) {

		boolean permut;
		int indiceMax = tableau.length - 1;
		int swap = 0;
		do {

			permut = false;

			for (int i = 1; i <= indiceMax; i++) { // j'ai buté une heure sur le non fonctionnement de la boucle car
													// j'avais mis i == indiceMax (oui c'est idiot)

				if (tableau[i - 1] > tableau[i]) {

					swap = tableau[i - 1];
					tableau[i - 1] = tableau[i];
					tableau[i] = swap;
					permut = true;

				}
			}

			indiceMax--; // Je ne comprends pas bien l'intérêt de cette opération, la supprimmer n'a pas
							// d'incidence sur les performances de la méthode

		} while (permut == true);

		return tableau;

	}

}
