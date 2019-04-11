package exercice3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class ExprMathTest {

	@Test
	public void testVerifExpMathWithCorrectValue() {

		String validExpression = "";
		validExpression = "(1*(3+2))";

		assertTrue(ExprMath.verifExpMath(validExpression));

	}

	@Test
	public void testVerifExpMathWithIncorrectValue() {

		String invalidExpression = "";
		invalidExpression = "1*(3+2))";

		assertFalse(ExprMath.verifExpMath(invalidExpression));

	}

	@Test
	public void testVerifExpMathWithNoBracket() {

		String ExprWithoutbracket = "";
		ExprWithoutbracket = "1*3+2";

		assertTrue(ExprMath.verifExpMath(ExprWithoutbracket));
	}

	@Test
	public void testVerifExpMathWithNoValue() {

		String ExpMathWithNoValue = "";

		assertTrue(ExprMath.verifExpMath(ExpMathWithNoValue));
	}

	@Test
	public void testVerifExpMathWithExpStartingWithBracket() {

		String ExpStartingWithBracket = "";
		ExpStartingWithBracket = ")5+2";

		assertFalse(ExprMath.verifExpMath(ExpStartingWithBracket));
	}

	@Test
	public void WithIncorrectValue2() {

		String WithIncorrectValue2;
		WithIncorrectValue2 = "((5+2)";
		assertFalse(ExprMath.verifExpMath(WithIncorrectValue2));
	}

}
