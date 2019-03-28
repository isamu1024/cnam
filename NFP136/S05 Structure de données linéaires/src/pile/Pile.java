package pile;

interface Pile<T> { // interface générique
	
	boolean estVide();
	Pile<T> push(T e);
	T getTop();
	Pile<T> pop();
	
}
