package debutant;
import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;

public class E61_MethodeAddEtSet {

    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<String>();

        array.add("momo"); // ajoute momo au tableau (Après le dernier index)
        // array.set(0,"toto");
        array.add(0,"toto");

        System.out.println(array.get(0)); // récupère le contenu à l'index 0

    }

}
