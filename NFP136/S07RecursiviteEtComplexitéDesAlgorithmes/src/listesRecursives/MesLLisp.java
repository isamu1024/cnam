package listesRecursives;

public class MesLLisp {

	public static void main(String[] args) {

		ListLisp<Character> alpha = new ListVide<Character>();

		char c;
		for (int i = 65; i < 91; i++) {
			try {
				System.out.println("Tete de alpha : " + alpha.head());
			} catch (Exception e1) {
				System.err.println(e1);
			}
			c = (char) i; // Cast de i (entier vers char)

			// alpha = new ListePlein<Character>(c, alpha);
			alpha = alpha.cons(c);
		}
		Character vc1 = 'P';
		Character vc2 = 'P';
		System.out.println("vc1 est egal a P ? " + (vc1 == vc2));
		System.out.println("vc1 est dans alpha ? " + alpha.member(vc2));
		System.out.println("longueur alpha: " + alpha.longueur());
		ListLisp<Character> l1 = new ListVide<Character>();
		System.out.println("P est dans liste vide ? " + l1.member(vc2));

	}

}
