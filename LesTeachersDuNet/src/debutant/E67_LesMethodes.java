package debutant;
public class E67_LesMethodes {

    public static void main(String[] args) {

    direBonjour("Moro", "Alexandre");
    direBonjour("Moro", "Alexandre");
    direBonjour("Moro", "Alexandre");
    direBonjour("Moro", "Alexandre");
    direBonjour("Moro", "Alexandre");

    }

    static void direBonjour (String nom, String prenom) {  // void ne retourne rien, retourne un entier > int retourne un double > double etc ...

        System.out.printf("Bonjour %s %s \n" , prenom, nom);

    }

}
