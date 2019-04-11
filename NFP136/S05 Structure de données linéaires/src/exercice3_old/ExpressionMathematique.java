package exercice3;

import java.util.*;

public class ExpressionMathematique {

	public static void main(String[] args) {

		String str;
		char c;
		

		Vector<Character> vc1 = new Vector<Character>();
		Pile<Character> p01 = new VectMath01<Character>(vc1);
		
		str = inputUser();

		for (int i = 0 ; i < str.length(); i++) { // boucle qui parse le String str

			c = (char) str.charAt(i);

			if ( c == '(' ) {

				p01 = p01.push(c);

			} else if ( c == ')' ) {

				p01 = p01.pop();

			}  

		}

		if ( p01.check() ) {

			System.out.println("L'expression est bien �crite");

		} else {

			System.out.println("L'expression est male �crite veuillez v�rifier la syntaxe");	

		}

	}

	public static String inputUser() {

		String expression;

		Scanner sc = new Scanner(System.in); // Cr�ation d'un nouvel objet scanner

		System.out.println("Entrez l'expression: ");

		expression = sc.nextLine(); // La variable expression prend comme valeur la prochaine ligne entr�e par l'utilisateur

		sc.close();

		return expression;

	}

}



