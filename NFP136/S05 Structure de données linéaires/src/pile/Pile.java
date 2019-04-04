package pile;

interface Pile<T> { // interface g�n�rique
	
	boolean estVide();
	Pile<T> push(T e);
	T getTop();
	Pile<T> pop();
	
	// Methodes demand�es pour l'exercice
	
	Pile<T> renverse();
	T afficher(int i);
	int getHight();
	
}
