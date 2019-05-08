package cours;

import java.util.Stack;

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

		s.push(t); // on empile l'arbre passé en argument

		while (!s.isEmpty()) { // tant que le stack n'est pas vide

			t = s.pop(); // on positionne l'arbre courant sur celui dépilé

			if (t.racine() != null) { // j'ai du modifier dans feuille.java la méthode racine() pour qu'elle renvoie
										// null au lieu d'une levée d'exception
				System.out.printf(":%s", t.racine()); // on l'affiche avec printf
			}

			if (t.sad() != null) { // on détecte si le sous arbre droit existe (l'ordre droite puis gauche a son
									// importance)
				s.push(t.sad()); // si oui on le pousse dans la pile
			}

			if (t.sag() != null) { // on détecte si le sous arbre gauche existe
				s.push(t.sag()); // si oui on le pousse dans la pile
			}
		}

	}

}
