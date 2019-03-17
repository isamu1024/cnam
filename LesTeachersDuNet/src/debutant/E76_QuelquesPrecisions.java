package debutant;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class E76_QuelquesPrecisions {


    public static void main(String[] args) {

        int i = 3;
        double a = 12.5d; // ne pas oublier le d
        float b = 32.5f; // ne pas oublier le f pour float
        long c = 456212L; // Ne pas oublier le GRAND L

        System.out.println("entrer du texte");
        Scanner clavier = new Scanner(System.in);

        String chaine = clavier.nextLine(); // A partir de la version 7 on peut faire des switch sur les switch

        switch ( chaine ) {
            case "toto":
                System.out.println("vous avez entré toto");
                break; // ne pas oublier le break !!

            case "baba":
                System.out.println("vous avez entré baba");
                break;

            case "caca":
                System.out.println("vous avez entré caca");
                break;

                default:
                    System.out.println("pas reconnu");
                    break;
        }

    }
}
