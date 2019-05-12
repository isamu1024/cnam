package cours;

import java.util.Stack;

public class NoeudRecherche<T extends Comparable<T>> implements BinTree<T> {

	private T root;
	private BinTree<T> left;
	private BinTree<T> right;

	// constructeur

	public NoeudRecherche(T r, BinTree<T> g, BinTree<T> d) {

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

	public T minVal() {
		T nodeData = root;
		T leftNode = left.minVal();
		T rightNode = right.minVal();

		if (leftNode == null || rightNode == null) {

			return nodeData;

		}

		if (leftNode.compareTo(nodeData) < 0) {
			nodeData = leftNode;
		}

		if (rightNode.compareTo(nodeData) < 0) {
			nodeData = rightNode;
		}

		return nodeData;
	}

	public T maxVal() {
		T nodeData = root;
		T leftNode = left.maxVal();
		T rightNode = right.maxVal();

		if (leftNode == null || rightNode == null) {

			return nodeData;

		}

		if (leftNode.compareTo(nodeData) > 0) {
			nodeData = leftNode;
		}

		if (rightNode.compareTo(nodeData) > 0) {
			nodeData = rightNode;
		}

		return nodeData;
	}

	public void prefixeIteratif(BinTree<T> t) {

		Stack<BinTree<T>> s = new Stack<BinTree<T>>();

		s.push(t);

		while (!s.isEmpty()) {

			t = s.pop();

			if (t.racine() != null) {

				System.out.println(t.racine());

			}

			if (t.sad() != null) {

				s.push(t.sad());
			}

			if (t.sag() != null) {
				s.push(t.sag());
			}
		}

	}

	public BinTree<T> add(T x, BinTree<T> t) {

		if (x.compareTo(t.racine()) == 0) {

			return t;

		}

		if (x.compareTo(t.racine()) > 0) {

			if (!sad().estVide()) {
				right.add(x, right);
			}

			else {
				BinTree<T> feuilleIns = new Feuille<T>();
				BinTree<T> arbreIns = new NoeudRecherche<T>(x, feuilleIns, feuilleIns);
				right = arbreIns;
			}

		}

		if (x.compareTo(t.racine()) < 0) {

			if (!sag().estVide()) {
				right.add(x, right);
			}

			else {
				BinTree<T> feuilleIns = new Feuille<T>();
				BinTree<T> arbreIns = new NoeudRecherche<T>(x, feuilleIns, feuilleIns);
				left = arbreIns;
			}

		}

		return t;

	}

}
