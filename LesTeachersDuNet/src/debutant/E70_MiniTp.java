package debutant;
import java.util.Scanner;

public class E70_MiniTp {

    private static Scanner clavier = new Scanner(System.in);

    public static void main(String[] args) {

    direBonjour();
    direBonjour();
    direBonjour();
    direBonjour();

    }

    static void direBonjour(){

        String nom;

        System.out.println("Entrez votre nom");

        nom = clavier.nextLine();

        System.out.printf("Bonjour %s\n", nom);

    }

}
