package debutant;
import java.util.ArrayList;

public class E58_MethodesClassiquesDesArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> tab = new ArrayList<Integer>();
        // tab[0] = 5; valable pour un tableau de taille fixe
        tab.add( 0,5 ); // ajouter une valeur a index donné
        tab.set( 0,128 ); // remplacer une valeur à un indice donné
        System.out.println(tab.get(0));

    }

}
