package debutant;
/*
Exercice demandé par les teacher du net nommé challenge.
https://www.youtube.com/watch?v=CQMN03IJ6_8
 */

import java.util.ArrayList;
import java.util.Scanner;

public class E79_Challenge {

    public static void main(String[] args) {

        int reponse;                            // Stockage de l'int issu du scanner
        int facteur = 1;                        // plus petit facteur renvoyé par la classe modulo
        boolean done = true;                    // Variable pour boucle while cherchant le nombre de facteur nécessaire

        ArrayList<Integer> results = new ArrayList<>(); // creation de l'arraylist qui contiendra les résultats



        System.out.printf("%s\n", "Entrez un nombre entier");
        Scanner clavier = new Scanner(System.in);

        reponse = clavier.nextInt();

        /*
        Boucle while qui cherchera le nombre de facteurs nécessaire
         */

        while (done) {
            facteur = modulo(reponse);
            results.add(facteur);
            reponse = reponse / facteur;
            if (reponse == 1) {
                done = false;
            }
        }

        /*
        Affichage des résultats et détection des nombres premiers
         */

        if (results.size()==1) {
            System.out.printf("%s", "Le Nombre semble être premier");       // indeed :)
        } else {
            for (int j = 0; j < results.size(); j++) {
                if (j < results.size() - 1) {                   //Affichage des premiers résultats avec un séparateur
                    System.out.print(results.get(j) + ":");
                } else {
                    System.out.print(results.get(j));
                }
            }
        }
    }

        public static int modulo(int a){

            int c = 0;

            for (int i = 2; i <= a; i++) {

                if (i < a && a % i == 0) {
                    c = i;
                    break;
                }
                if (i == a) {
                    c = a;
                }
            }
            return c;
        }

}
