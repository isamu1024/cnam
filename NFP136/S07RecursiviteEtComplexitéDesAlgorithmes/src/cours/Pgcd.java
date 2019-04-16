package cours;

public class Pgcd {

	public static int pgcd1(int m, int n) {
		if (m == n) {
			return m; // fin de la récursion
		} else if (m < n) {
			return pgcd1(m, n - m); // appel récursif à la méthode pgcd1()
		} else {
			return pgcd1(n, m - n); // appel récursif à la méthode pgcd1()
		}
	}

	public static void main(String[] args) {

		int nbr1 = 100;
		int nbr2 = 60;

		System.out.println(pgcd1(nbr1, nbr2));

	}

}
