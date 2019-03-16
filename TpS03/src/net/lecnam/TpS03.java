package net.lecnam;
import java.util.Scanner;

public class TpS03 {

	public static void main(String[] args) {
	
		Personne paul = new Personne ("Paul","Dupuis") ;
		
		Compte compte1 = paul.ouvrirCompte(); // Une personne ouvre un compte.
		
		float montant ;
		
		montant = compte1.getSolde();
		
		System.out.println("Solde du compte n° " + compte1.getNumero() + " solde = " + montant + " euros");
		
		compte1.crediter(100.f); // Une personne dépose de l'argent sur un compte.
		
		montant = compte1.getSolde();
		
		System.out.println("Solde du compte n° " + compte1.getNumero() + " solde = " + montant + " euros" );
		
		compte1.retirer(100.f); // Une personne retire de l'argent d'un compte.
		
		montant = compte1.getSolde(); // Une personne consulte le solde d'un de ses comptes
		
		System.out.println("Solde du compte n° " + compte1.getNumero() + " solde = " + montant + " euros" );
		
		paul.fermerCompte(compte1); // Une personne ferme un compte.
		
		compte1= null ; // plus aucune reference au compte
	

	}

}
