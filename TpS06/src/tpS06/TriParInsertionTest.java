package tpS06;


import org.junit.Test;

public class TriParInsertionTest {
	// Tests avec des nombres n�gatifs
	@Test
	public void tableauAvecDesNombresNegatifs() {

		int[] tabTest = new int[] { -6, -5, -43 };
		TriParInsertion.triParInsertion(tabTest);

	}

	@Test
	public void tableauAvecDesNombresDupliqu�s() {
		int[] tabTest2 = new int[] { 6, 5, 5, 18, 18, 54, 54 };
		TriParInsertion.triParInsertion(tabTest2);

	}

	@Test
	public void tableauAvecUneSeuleEntr�e() {
		int[] tabTest3 = new int[] { 6 };
		TriParInsertion.triParInsertion(tabTest3);

	}

	@Test()
	public void tableauAvecDuplicationDuMemeInt() {
		int[] tabTest4 = new int[] { 4, 4, 4, 4 };
		TriParInsertion.triParInsertion(tabTest4);

	}

	@Test(timeout = 20)
	public void testDeDureeDExecution() {
		int[] tabTest5 = new int[] { 5, 10, 1, 3, 7, 4, 2, 6, 9, 8 };
		TriABulle.triBulle(tabTest5);
	}
}