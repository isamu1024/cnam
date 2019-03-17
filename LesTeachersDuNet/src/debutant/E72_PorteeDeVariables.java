package debutant;
public class E72_PorteeDeVariables {

    public static void main(String[] args) {

        System.out.println(racineCarre_double(2));


    }

    /*static int boom(int nbre) {

        return (int) Math.sqrt(nbre); // la methode Math.sqrt retourne un double, pour la rendre compatible avec le type de retour de la fonction, on la transforme en entier avec (int)
    }
    */

    static double racineCarre_double(int nbre) {

        int nbre_double = nbre*2; // La portée de cette variable n'est valable qu'a l'intérieur de la méthode - Portée de la méthode = locale (déclarée dans la méthode)
        return Math.sqrt(nbre_double);

    }


}
