package debutant;
/*

https://www.youtube.com/watch?v=dfLPh1oWJNg

 */

public class E74_LaRecursivite2 {

    public static void main(String[] args) {

        System.out.println(factoriel(4));

    }

    static int factoriel(int nbre) {

        // 5! = 5 * 4 * 3 * 2 *1
        // 4! = 4 * 3 * 2 * 1
        // n! = n * (n -1 )! un nombre n factoriel est ce nombre multiplié par le factoriel de ce nombre -1

        if (nbre == 0 || nbre == 1) {
            return 1;
        } else {
            return nbre * factoriel(nbre-1);
        }


    }


}
