package vector;

import java.util.Vector;

class PileVect<T> implements Pile<T> {
	
	private Vector<T> valeurs ;
	
	public PileVect(Vector<T> tab) {
		
		valeurs = tab;
		
	}

	public boolean estVide() {
		
		return valeurs.isEmpty();
		
	}

	
	public Pile<T> push(T e) {

		valeurs.addElement(e);
		return this;
		
	}


	public T getTop() {

		if (valeurs.isEmpty() == true) {
			
			throw new IllegalArgumentException("Pile Vide");
			
		} else {
			
			return valeurs.lastElement(); // retourne l'index de la dernière valeur à l'aide de la méthode lastElement 
			
		}
		
	}


	public Pile<T> pop() {

		if (valeurs.isEmpty() == true) {
			
			throw new IllegalArgumentException("Pile Vide");
			
		} else {
			
			valeurs.remove(this.getTop());
			return this;
		}
		
	}
	
	

}
