package pile;

interface Pile<T> { // interface générique
	
	boolean estVide();
	int getHight();
	Pile<T> push(T e);
	T getTop();
	Pile<T> pop();
	Pile<T> renverse();
	T afficher(int i);
	
}
