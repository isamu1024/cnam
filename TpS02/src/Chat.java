
public class Chat extends Mammifere {
	
	private String nom;
	private String race;
	
	// constructeur des objets de la classe Chat
	
	public Chat (String nom, String race) {
		this.nom = nom;
		this.race = race;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getRace() {
		return race;
	}

	
	
	public String signeParticulier() {
		System.out.print("(m�thode Chat.signeParticulier() ) ");
		String ronron = "il a comme particularit� de ronronner";
		return ronron;
	}





}
