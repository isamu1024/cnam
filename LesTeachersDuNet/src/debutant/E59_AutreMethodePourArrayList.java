package debutant;
import java.util.ArrayList;

public class E59_AutreMethodePourArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> tab = new ArrayList<Integer>();

        tab.add(5); //0
        tab.add(25); //1
        tab.add(35); //2
        tab.add(45); //3 ....
        tab.add(55);
        tab.add(65);
        tab.add(75);

        System.out.println(tab.get(2));

        // tab.clear(); // purger le tableau
        tab.remove(0); // supprimme l'index 25

        if (tab.isEmpty()) {
            System.out.println("tableau vide");
        } else {
            System.out.println(tab.get(0)); // le programme affiche 25 car l'index 0 qui contenait 5 a été supprimé ! L'index 0 est désormais la valeur 25
        }

    }

}
