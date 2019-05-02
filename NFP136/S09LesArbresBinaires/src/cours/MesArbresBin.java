package cours;

public class MesArbresBin {

	public static void main(String[] args) {

		BinTree<Integer> a0 = new Feuille<Integer>();
		BinTree<Integer> a2 = new Noeud<Integer>(2, a0, a0);
		BinTree<Integer> a4 = new Noeud<Integer>(4, a0, a0);
		BinTree<Integer> a7 = new Noeud<Integer>(7, a0, a0);
		BinTree<Integer> a01 = new Noeud<Integer>(0, a2, a7);
		BinTree<Integer> a1 = new Noeud<Integer>(1, a01, a4);

		System.out.println("Taille de a1 : " + a1.taille());
		System.out.println("Hauteur de a1 : " + a1.hauteur());
		System.out.println(a1.prefixe());
		System.out.println(a1.infixe());
		System.out.println(a1.postfixe());

		int test[] = { 2, 4, 7, 0, 1, 3, 0, 4, 17, 4 };
		for (int s : test) {
			System.out.println(a1.isPresent(s));
		}
	}

}
