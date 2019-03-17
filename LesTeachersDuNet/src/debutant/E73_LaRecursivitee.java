package debutant;
public class E73_LaRecursivitee { // une méthode s'apelle elle même

    public static void main(String[] args) {
        System.out.println(factoriel(1));
    }


    /*
     Rappel sur les factoriels
     4!=4*3*2*1 =  1*2*3*4
     5!=5*4*3*2*1
     0! = 1
     1! = 1
    */

    static int factoriel(int nbre) {

        if (nbre < 0) {
            System.out.println("le nombre doit être un entier positif");
            return -1;
        } else {
            int res = 1;

            for (int i = nbre; i > 1; i--) {
                res = res * i;
            }
            return res;
        }
    }
}