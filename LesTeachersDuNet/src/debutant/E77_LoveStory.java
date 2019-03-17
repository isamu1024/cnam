package debutant;
import com.sun.source.tree.TryTree;

import java.util.Random;

public class E77_LoveStory {

    public static void main(String[] args) {

        System.out.println("Est ce que tu sais que je t'aime ma chérie ?");

        Random random = new Random();
        Boolean success = random.nextBoolean();

        System.out.println(success);

        System.out.println("hmmmmm...");

        /*

        Il faut lever l'execption pour Thread.sleep au cas ou la pause ne

         */

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (success) {

            System.out.println("je t'aime aussi mon coeur.");

        } else {

            System.out.println("Désolé ce n'est plus mon cas :( .");
        }


        // test du random


        for (int i=0; i <= 200; i++) {

            int numero = random.nextInt(200); // attention pour avoir 0 ou 1 il faut un bound de 2 (1) = uniquement 0 en sortie

            try {

                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(numero);

        }

    }

}
