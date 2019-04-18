package listesRecursives;

public class ListVide<T extends Comparable<T>> implements ListLisp<T> {

	public ListVide() {
// constructeur vide
	}

	public ListLisp<T> cons(T e) {

		return new ListePlein<T>(e, this); // l'ajout d'un élément donne ListePlein avec en head e et en suited de e la
											// ListeVide

	}

	public T head() {

		throw new IllegalArgumentException("Liste vide");

	}

	public ListLisp<T> tail() {

		throw new IllegalArgumentException("Liste vide");

	}

	public boolean estVide() {
		return true;
	}

	public int longueur() {
		return 0;
	}

	public boolean member(T x) {

		return false;

	}

}
