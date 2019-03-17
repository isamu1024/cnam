package debutant;
/*

https://www.youtube.com/watch?v=cylOg18apMQ

 */


import java.util.Scanner;

public class E69_LinstructionReturn {

    private static Scanner clavier = new Scanner(System.in);


    public static void main(String[] args) {

System.out.println(doubleFunc(3));
System.out.println(doubleFunc(4));
System.out.println(doubleFunc(12));
System.out.println(doubleFunc(214564));




    }

    static int doubleFunc(int nbre) {

        return nbre = nbre *2;

    }



}
