
public class Poisson extends Animal {
	
	private String nom;
	private String race;
	
	// constructeur des objets de la classe Poisson
	
	public Poisson (String nom, String race) {
		
		this.nom = nom;
		this.race = race;
		
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getRace() {
		return race;
	}

	public String signeParticulier(int nbNageoire) {
	
		System.out.print("(méthode Poisson.signeParticulier()) ");
		String nageoire = null;
		
		if (nbNageoire <= 0) {
			nageoire = "il n'a pas de nagoire et dispose surement d'un système hydrodynamique sous voute, dit \"la chenille\" ";
		}
		
		else if (nbNageoire == 2) {
			nageoire = "il a comme particularité d'avoir " + nbNageoire + " nageoires";
		}
		
		if (nbNageoire > 2) {
			nageoire = "il a plus de 2 nageoire";
		}

		return nageoire;

	}
	
}
