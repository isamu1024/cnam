
public class Baleine extends Mammifere {
	
	private String nom;
	private String race;
	
	// constructeur des objets de la classe Baleine
	
	public Baleine (String nom, String race) {
		this.nom = nom;
		this.race = race;	
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getRace() {
		return race;
	}

	
	public String nager() {
		System.out.print("(méthode Baleine.nager()) ");
		String nager = "il a comme particularité de pouvoir nager comme son ami mammifère le dauphin";
		return nager ;
	}

}
