package debutant;
public class E65_LeTypeChar {

    public static void main(String[] args) {

        String chaine = "toto";
        System.out.println(chaine);
        System.out.printf("%s\n", chaine);
        System.out.printf("%S\n", chaine);

        char car = 'a'; // simple quote pour 1 caractère !!
        System.out.printf("%c\n", car); // %c fomatte l'affichage d'un caractère %C pour afficher en MAJ

        // cas spécial affichage des pourcentages :

        int value = 40;
        System.out.printf("chargement à %d%%\n", value); // %% affiche le symbole %
        System.out.printf("chargement %n%d%%", value); // %% affiche le symbole %


    }

}
