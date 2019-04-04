package pile;

interface Pile<T> { // interface générique
	
	boolean estVide();
	Pile<T> push(T e);
	T getTop();
	Pile<T> pop();
	
	// Methodes demandées pour l'exercice
	
	Pile<T> renverse();
	T afficher(int i);
	int getHight();
	
}
