package cours;

public class Noeud<T extends Comparable<T>> implements BinTree<T> {

	private T root;
	private BinTree<T> left;
	private BinTree<T> right;

	// constructeur

	public Noeud(T r, BinTree<T> g, BinTree<T> d) {
		root = r;
		left = g;
		right = d;
	}

	public boolean estVide() {
		return false;
	}

	public T racine() {
		return root;
	}

	public BinTree<T> sag() {
		return left;
	}

	public BinTree<T> sad() {
		return right;
	}

	public int hauteur() {
		int g = left.hauteur();
		int d = right.hauteur();
		int res = (g > d ? g : d);
		res++;
		return res;
	}

	public int taille() {
		return 1 + left.taille() + right.taille();
	}

	public String prefixe() {
		return "<" + root + "," + left.prefixe() + "," + right.prefixe() + ">";
	}

	public String infixe() {
		return "<" + left.infixe() + "," + root + "," + right.infixe() + ">";
	}

	public String postfixe() {
		return "<" + left.postfixe() + "," + right.postfixe() + "," + root + ">";
	}

	public Boolean isPresent(T x) {

		if (x.equals(root)) {
			return true;
		}

		boolean b1 = left.isPresent(x); // scan profondeur a gauche
		boolean b2 = right.isPresent(x); // scan profondeur a droite

		return b1 ? b1 : b2; // booleanCondition ? executeThisPartIfBooleanConditionIsTrue :
								// executeThisPartIfBooleanConditionIsFalse

	}

}
