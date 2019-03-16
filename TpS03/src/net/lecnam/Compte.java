package net.lecnam;

public class Compte {
	
	// *** Attribut de classe ***
	// Un attribut statique est un attribut qui est commun à tous les objets que vous pourrez créer
	// https://www.vulgarisation-informatique.com/java-attributs.php
	
	static private int nombreDeCompteAyantEteOuverts = 0; 
	
	// *** Attribut d'instance ***
	// seront propres à l'objet créé
	
	private float solde;
	private int numero;
	
	
	// Methode de classe
	
	static int getNombreDeComptesAyantEteOuverts() {
		
		return nombreDeCompteAyantEteOuverts;
		
	}
	
	// Constructeur
	
	public Compte () {
		
		nombreDeCompteAyantEteOuverts ++;
		this.solde = 0.0f;
		this.numero = nombreDeCompteAyantEteOuverts;
		
	}
	
	
	// Méthode d'instance
	
	public float getSolde() {
		
		return solde;
		
	}
	
	public int getNumero() {
		
		return numero;
		
	}
	
	public float crediter(float a) {
		
		solde += a;
		
		return solde;
	}
	
	public float retirer (float a) {
		
		solde -= a;
		
		return solde;	
	}


}
