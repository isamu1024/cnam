package net.lecnam;
import java.util.List;
import java.util.ArrayList;

public class Personne{
	
	
	// *** Attribut de classe ***
	
	static private int nombreDePersonnesAyantExiste =0;
	
	// *** Atteribut d'instance ***
	
	private String nom;
	private String prenom;
	private List<Compte> listeDesComptes;
	
	
	// *** Methode de classe ***
	
	static int getNombreDePersonnesAyantExiste() {
		
		return nombreDePersonnesAyantExiste;
		
	}
	
	// *** Methode d'instance ***
	
	// *** Constructeur ***
	
	public Personne (String nom,String prenom) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.listeDesComptes = new ArrayList<Compte>();
		
	}
	
	public void ouvrirCompte() {
		
		Compte compte = new Compte(); // Creation de la nouvelle instance
		this.listeDesComptes.add(compte); // "stockage" de l'instance Compte dans la liste
		System.out.println(this.getPrenom() + this.getNom() + " ouvre le compte n° " + compte.getNumero());
	}
	
	public void fermerCompte( Compte leCompteAFermer) {
		
		this.listeDesComptes.remove(leCompteAFermer);
		return;
	}
	
	private String getNom() {
		
		return this.nom;
	}
	
	private String getPrenom() {
		
		return this.prenom;
		
	}
	
	
}
