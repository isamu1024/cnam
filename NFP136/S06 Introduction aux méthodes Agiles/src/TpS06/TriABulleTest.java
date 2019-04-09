package TpS06;

import org.junit.Test;

// Tests unitaires et TDD en java avec JUnit
// https://www.youtube.com/watch?v=6wE6VhF_uNo

public class TriABulleTest {

	// Tests avec des nombres négatifs
	@Test
	public void tableauAvecDesNombresNegatifs() {

		int[] tabTest = new int[] { -6, -5, -43 };
		TriABulle.triBulle(tabTest);

	}

	@Test
	public void tableauAvecDesNombresDupliqués() {
		int[] tabTest2 = new int[] { 6, 5, 5, 18, 18, 54, 54 };
		TriABulle.triBulle(tabTest2);

	}

	@Test
	public void tableauAvecUneSeuleEntrée() {
		int[] tabTest3 = new int[] { 6 };
		TriABulle.triBulle(tabTest3);

	}

	@Test()
	public void tableauAvecDuplicationDuMemeInt() {
		int[] tabTest4 = new int[] { 4, 4, 4, 4 };
		TriABulle.triBulle(tabTest4);

	}

	@Test(timeout = 20)
	public void testDeDureeDExecution() {
		int[] tabTest5 = new int[] { 5, 10, 1, 3, 7, 4, 2, 6, 9, 8 };
		TriABulle.triBulle(tabTest5);
	}
}
