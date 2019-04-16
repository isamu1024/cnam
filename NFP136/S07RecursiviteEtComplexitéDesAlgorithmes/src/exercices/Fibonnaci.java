package exercices;

public class Fibonnaci {

	private static long fibonnaciRecursive(long n) throws Exception {

		if (n < 0)
			throw (new Exception("Le rang demandé doit être positif"));
		if (n == 0 || n == 1) {
			return n;
		} else {
			return (fibonnaciRecursive(n - 1) + fibonnaciRecursive(n - 2));
		}

	}

	// private static int fibannociIterative(int n) throws Exception {

	// }

	public static void main(String[] args) {

		long rang = 50L;

		try {
			rang = fibonnaciRecursive(rang);
		} catch (Exception e) {
			System.out.println("une erreur s'est produite");
		}

		System.out.println(rang);

	}

}
