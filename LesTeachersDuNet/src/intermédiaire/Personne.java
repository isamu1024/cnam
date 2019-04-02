package intermédiaire;

public class Personne {

	public String nom;
	public int age; // valeur par défaut des entiers en java = 0

	public Personne (String nom) {

		this.nom = nom;		
	}

	public void setAge(int age) {

		if (age < 15) {
			System.out.println("Interdit aux moins de 15 ans ! ");
		} else {

			this.age = age;

		}
	}
	
	public int getAge() {
		
		return this.age*365;
	}

}
