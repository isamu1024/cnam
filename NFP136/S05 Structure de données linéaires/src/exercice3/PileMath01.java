package exercice3;

public class PileMath01<T> implements Pile<T> {

	private T tab[];
	private int maxi;
	private int sommet = -1;
	
	public PileMath01( T[] tab, int maxi ) { // constructeur de l'objet

		tab = this.tab;
		maxi = this.maxi;
	}
	
		
	public boolean estVide() {

		return sommet == -1;
	}

	@Override
	public Pile<T> push(T e) {
		
		if (sommet == limite -1 ) {

			throw new IllegalArgumentException("Pile pleine !");

		} else {

			valeurs[++sommet] = e;

			return this;

		
		return null;
	}

	@Override
	public T getTop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pile<T> pop() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
