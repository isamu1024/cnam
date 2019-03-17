package debutant;
/* A retenir :

Ce qui est écrit après le return n'est pas pris en compte dans l'exécution.
Une méthode peut appeler une autre méthode (une infinité de fois).


 */


public class E71_BonASavoir {

    public static void main(String[] args) {

        System.out.println(methode2());

    }


    static void methode1 () {
        System.out.println("je suis la méthode 1");
    }

    static int methode2 () {
        methode1();
        return 2;
    }

}


