package exercice3;

interface Pile<T> { // interface générique

	boolean estVide();
	Pile<T> push(T e);
	T getTop();
	Pile<T> pop();

}
