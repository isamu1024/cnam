package listesRecursives;

public class ListePlein<T extends Comparable<T>> implements ListLisp<T> {

	// Attention "objet de type T qui étend la classe Comparable"

	private T element;
	private ListLisp<T> suivt;

	public ListePlein(T e1, ListLisp<T> s1) {

		element = e1;
		suivt = s1;

	}

	public ListLisp<T> cons(T e) {
		return new ListePlein<T>(e, this);
	}

	public T head() {
		return element;
	}

	public ListLisp<T> tail() {
		return suivt;
	}

	public boolean estVide() {
		return false;
	}

	public int longueur() {
		return 1 + suivt.longueur();
	}

	public boolean member(T x) {
		if (x.compareTo(element) == 0) {
			return true;
		} else {
			return suivt.member(x);
		}
	}
}
