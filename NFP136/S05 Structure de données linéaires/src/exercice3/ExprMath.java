package exercice3;

import java.util.Stack;

public class ExprMath {

	public static boolean verifExpMath(String a) {

		boolean isOk = false;
		char c = '\0';

		Stack<Character> stack = new Stack<Character>();

		try {

			for (int i = 0; i < a.length(); i++) {

				c = (char) a.charAt(i);

				if (c == '(')
					stack.push(c);

				if (c == ')')
					stack.pop();

			}

		} catch (Exception e) { // en cas de pop sur une pile vide on lève une exception et on retourne isOK à
								// false

			return isOk;
		}

		finally {

			if (stack.isEmpty()) {

				isOk = true;

			}

		}

		return isOk;
	}

}
