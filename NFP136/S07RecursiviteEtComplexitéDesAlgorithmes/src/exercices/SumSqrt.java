package exercices;

public class SumSqrt {

	public static int sumSqrt(int n) {

		if (n == 0) {
			return 0;
		} else {
			return (sumSqrt(n - 1) + n * n);
		}

	}

	public static void main(String[] args) {

		int nb = 5;

		System.out.println(sumSqrt(nb));

	}

}
