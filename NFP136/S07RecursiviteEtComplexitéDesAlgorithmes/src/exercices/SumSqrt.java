package exercices;

public class SumSqrt {

	public static int sumSqrt(int n) {

		if (n == 0) {
			return 0;
		} else {
			return (int) (sumSqrt(n - 1) + Math.pow(n, 2)); // cast du retour car Math.pow prend des double en paramètre
		}

	}

	public static void main(String[] args) {

		int nb = 5;

		System.out.println(sumSqrt(nb));

	}

}
