package listesRecursives;

interface ListLisp<T extends Comparable<T>> {

	ListLisp<T> cons(T e); // rappel head > ajouter un �lement � une liste,

	T head(); // r�cup�ration (extraction) du premier �l�ment de la liste

	ListLisp<T> tail(); // r�cupration de la suite �gale � la pr�c�dente amput�e de son premier �l�ment
	// (type ListLip<T>)

	boolean estVide();

	int longueur();

	boolean member(T x); // est membre ou non de la liste (x ??)

}
