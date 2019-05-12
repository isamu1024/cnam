package cours;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MesArbresBin {

	private static final Logger logger = LogManager.getLogger(MesArbresBin.class.getName());

	public static void main(String[] args) {

		logger.debug("Création des feuilles et des noeuds : ");

		BinTree<Integer> a0 = new Feuille<Integer>();
		BinTree<Integer> a2 = new Noeud<Integer>(2, a0, a0);
		BinTree<Integer> a4 = new Noeud<Integer>(4, a0, a0);
		BinTree<Integer> a7 = new Noeud<Integer>(7, a0, a0);
		BinTree<Integer> a01 = new Noeud<Integer>(0, a2, a7);
		BinTree<Integer> a1 = new Noeud<Integer>(1, a01, a4);

		System.out.println("Taille de a1 : " + a1.taille());
		logger.debug("Taille de a1 : " + a1.taille());
		System.out.println("Hauteur de a1 : " + a1.hauteur());
		System.out.println(a1.prefixe());
		System.out.println(a1.infixe());
		System.out.println(a1.postfixe());

		int test[] = { 2, 4, 7, 0, 1, 3, 0, 4, 17, 4 };
		for (int s : test) {
			System.out.println(a1.isPresent(s));
		}

		// System.out.println(a1.minVal());
		System.out.println(a1.minVal());
		System.out.println(a1.maxVal());

		a1.prefixeIteratif(a1);

		System.out.println();

		BinTree<Integer> b1 = new Feuille<Integer>();
		BinTree<Integer> b2 = new NoeudRecherche<Integer>(2, b1, b1);
		b2.add(2, b2);
		b2.add(4, b2);
		b2.add(7, b2);
		b2.add(0, b2);
		b2.add(1, b2);

		System.out.println(b2.prefixe());
		b2.prefixeIteratif(b2);

		int test2[] = { 2, 4, 7, 0, 1, 3, 0, 4, 17, 4 };
		for (int s : test2) {
			System.out.println(b2.isPresent(s));
		}

	}

}
