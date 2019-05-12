package cours;

public interface BinTree<T extends Comparable<T>> {

	boolean estVide();

	T racine();

	BinTree<T> sag();

	BinTree<T> sad();

	int hauteur();

	int taille();

	// ajout d'un attribut prefixe
	// parcours l'arbre dans l'ordre : root, left, right
	String prefixe();

	// exercice 1

	// ajout d'un attribut infixe
	// parcours l'arbre dans l'ordre : left, root, right
	String infixe();

	// ajout d'un attribut postfixe
	// parcours l'arbre dans l'ordre ; left, right, root
	String postfixe();

	// exercice 2

	// Déterminer sur un élément se trouve dans une liste
	Boolean isPresent(T x); // T type d'objet x valeur en paramètre

	T minVal();

	T maxVal();

	void prefixeIteratif(BinTree<T> t);

	BinTree<T> add(T x, BinTree<T> t);

}
