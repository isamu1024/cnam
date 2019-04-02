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
	
	

}
