package exercice3;

interface Pile<T> { // interface g�n�rique

	boolean estVide();
	Pile<T> push(T e);
	T getTop();
	Pile<T> pop();

}
