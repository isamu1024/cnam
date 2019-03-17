package debutant;
/*

https://www.youtube.com/watch?v=L75vpKSPgsw&t=26s

 */


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class E78_JeuDeCapitale {

    public static void main(String[] args) {

        final int NUMBER_OF_QUESTION = 7;
        int index;
        int score=0;
        String pays, capitale, userAnswer;

        ArrayList<Integer> indexAlreadyTaken = new ArrayList<>();

//        String[][] data = {
//
//            {"Sengal", "Dakar"},
//            {"France", "Paris"},
//            {"nigeria", "lagos"},
//            {"gabon", "Libreville"},
//            {"Allemagne", "berlin"},
//            {"Italie", "Rome"},
//            {"Monaco", "Monaco"},
//            {"Liberia", "Monrovia"},
//            {"Perou", "Lima"}
//        };

        String[][] data = getData();

        System.out.printf("%s\n", data[8][0]);
        System.out.printf("%s\n", data[8][1]);

        Scanner clavier = new Scanner(System.in);

         for (int i = 0; i < NUMBER_OF_QUESTION; i++) {

             //Choisir un pays de manière aléatoire
             do {
                 Random random = new Random();
                 index= random.nextInt(data.length);
             } while (indexAlreadyTaken.contains(index));

             indexAlreadyTaken.add(index);

             pays = data[index][0];
             capitale = data[index][1];

             // Demander à l'utilisateur d'entrer la capitale de ce pays

             System.out.printf("Quelle est la capitale de ce pays: %s?\n", pays);

             userAnswer = clavier.nextLine();

             // on compare les réponses

             if(capitale.equalsIgnoreCase(userAnswer)){
                 System.out.println("bonne réponse!");
                 score++;
             } else {
                 System.out.println("Mauvaise réponse, il fallait répondre: " + capitale);
             }


             // on affiche notre verdict

         }

        System.out.println("C'est terminé, score = " + score +" sur " + NUMBER_OF_QUESTION);

        clavier.close();

    }

    static String[][] getData() {

        String[][] data = {

            {"Senegal", "Dakar"},
            {"France", "Paris"},
            {"nigeria", "lagos"},
            {"gabon", "Libreville"},
            {"Allemagne", "berlin"},
            {"Italie", "Rome"},
            {"Monaco", "Monaco"},
            {"Liberia", "Monrovia"},
            {"Perou", "Lima"}
        };

        return data;

    }

}
