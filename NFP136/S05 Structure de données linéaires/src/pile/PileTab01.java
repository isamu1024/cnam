package pile;

class Piletab01<T> implements Pile<T> {

	private T[] valeurs;
	private int limite;
	private int sommet = -1;

	public Piletab01( T[] tab, int maxi ) {

		valeurs = tab;
		limite = maxi;


	}

	public boolean estVide( ) {

		return sommet == -1;

	}

	public Pile<T> push(T e) {

		if (sommet == limite -1 ) {

			throw new IllegalArgumentException("Pile pleine !");

		} else {

			valeurs[++sommet] = e;

			return this;

		}
	}




	public T getTop() {

		if (sommet == -1) {

			throw new IllegalArgumentException("Pile vide");

		} else {

			return valeurs[sommet];
		}

	}

	public Pile<T> pop() {

		if (this.estVide()) {

			throw new IllegalArgumentException("Pile vide !" );

		} else {

			sommet --;
			return this;

		}

	}	

}

