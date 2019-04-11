package exercice3;

import java.util.*;

public class VectMath01<T> implements Pile<T> {


	private Vector<T> tab;
	private boolean check;


	public VectMath01( Vector<T> tab ) { // constructeur de l'objet

		this.tab = tab;

	}


	public boolean estVide() {

		return tab.isEmpty();

	}


	public Pile<T> push(T e) {

		tab.addElement(e);
		
		return this;

	}

	public T getTop() {

		if (tab.isEmpty() == true) {

			throw new IllegalArgumentException("Pile vide ");

		} else {

			return (tab).lastElement();
		}
	}


	public Pile<T> pop() {

		if (tab.isEmpty() == true ) {

			throw new IllegalArgumentException("Pile vide" );

		} else {

			tab.remove(this.getTop());

			return this;
		}
	}


	public boolean check() {
		
		if (tab.isEmpty() == true) {
			
			check = true;
			
			
		} else {
			
			check = false;
			
		}
		
		return check;
	}

}
