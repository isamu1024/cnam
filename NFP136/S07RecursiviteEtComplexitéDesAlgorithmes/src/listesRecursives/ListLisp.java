package listesRecursives;

interface ListLisp<T extends Comparable<T>> {

	ListLisp<T> cons(T e); // rappel head > ajouter un élement à une liste,

	T head(); // récupération (extraction) du premier élément de la liste

	ListLisp<T> tail(); // récupration de la suite égale à la précédente amputée de son premier élément
	// (type ListLip<T>)

	boolean estVide();

	int longueur();

	boolean member(T x); // est membre ou non de la liste (x ??)

}
