package debutant;
import java.util.ArrayList;

public class E60_LesMethodesContainsEtIndexOf {

    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<String>();

        array.add("momo");
        array.add("toto");
        array.add("mamamamama");
        array.add("momo");

        for ( String item: array) {
            System.out.println(item);
        }

        System.out.println(array.contains("momo")); //affiche le boolean si momo est contenu dans le tableau
        System.out.println(array.contains("mushibishi")); //ici false car non contenu dans l'array

        System.out.println(array.indexOf("toto")); //donne l'indice de la premiere occurence /!\ renvoi -1 si non contenu dans le teableu


    }


}
