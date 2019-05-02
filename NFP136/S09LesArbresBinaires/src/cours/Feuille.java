package cours;

public class Feuille<T extends Comparable<T>> implements BinTree<T> { // type générique paramétré par le type <T>

	public boolean estVide() {
		return true;
	}

	public T racine() {
		throw new IllegalArgumentException("C'est une feuille");
	}

	public BinTree<T> sad() {
		throw new IllegalArgumentException("C'est une feuille");
	}

	public BinTree<T> sag() {
		throw new IllegalArgumentException("C'est une feuille");
	}

	public int hauteur() {
		return 0;
	}

	public int taille() {
		return 0;
	}

	public String prefixe() {
		return "<>";
	}

	public String infixe() {
		return "<>";
	}

	public String postfixe() {
		return "<>";
	}

	public Boolean isPresent(T x) {
		return false;
	}

}
