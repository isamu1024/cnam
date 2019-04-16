package cours;

public class Pgcd {

	public static int pgcd1(int m, int n) {
		if (m == n) {
			return m; // fin de la r�cursion
		} else if (m < n) {
			return pgcd1(m, n - m); // appel r�cursif � la m�thode pgcd1()
		} else {
			return pgcd1(n, m - n); // appel r�cursif � la m�thode pgcd1()
		}
	}

	public static void main(String[] args) {

		int nbr1 = 100;
		int nbr2 = 60;

		System.out.println(pgcd1(nbr1, nbr2));

	}

}
