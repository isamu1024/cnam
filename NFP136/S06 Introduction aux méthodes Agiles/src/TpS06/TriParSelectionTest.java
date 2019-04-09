package TpS06;

import org.junit.Test;

public class TriParSelectionTest {

	// Tests avec des nombres négatifs
	@Test
	public void tableauAvecDesNombresNegatifs() {

		int[] tabTest = new int[] { -6, -5, -43 };
		TriParSelection.triParSelection(tabTest);

	}

	@Test
	public void tableauAvecDesNombresDupliqués() {
		int[] tabTest2 = new int[] { 6, 5, 5, 18, 18, 54, 54 };
		TriParSelection.triParSelection(tabTest2);

	}

	@Test
	public void tableauAvecUneSeuleEntrée() {
		int[] tabTest3 = new int[] { 6 };
		TriParSelection.triParSelection(tabTest3);

	}

	@Test()
	public void tableauAvecDuplicationDuMemeInt() {
		int[] tabTest4 = new int[] { 4, 4, 4, 4 };
		TriParSelection.triParSelection(tabTest4);

	}

	@Test(timeout = 20)
	public void testDeDureeDExecution() {
		int[] tabTest5 = new int[] { 5, 10, 1, 3, 7, 4, 2, 6, 9, 8 };
		TriParSelection.triParSelection(tabTest5);
	}

}
