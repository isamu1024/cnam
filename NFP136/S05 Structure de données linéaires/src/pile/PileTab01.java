package pile;

class Piletab01<T> implements Pile<T> {

	private T[] valeurs;
	private int limite;
	private int sommet = -1;
	T swap;
	int hight;

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


	public int getHight() {

		hight = sommet + 1;

		return hight;

	}


	public Pile<T> renverse() {
		
		// cas classique de permutation de valeurs dans un tableau
		
		int sommetTemp = sommet;
		
		for ( int i=0; i < sommetTemp; i++) {
			
			swap = valeurs[sommetTemp];
			valeurs[sommetTemp] = valeurs[i];
			valeurs[i] = swap;
			
			sommetTemp--;
			
		}
		
		return this; // retourne la pile inversée
		

	}


	public T afficher(int i) {
		
		// iniquement pour appeler la méthode afficher dans un sysout

		return valeurs[i];
			
	}

}

