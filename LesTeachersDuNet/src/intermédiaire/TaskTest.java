package intermédiaire;

public class TaskTest {

	public static void main(String[] args) {
		
		
		Task tache1 = new Task("Faire un tutoriel JAVA", "description 1");
		tache1.complete();
		Task tache2 = new Task("Aller au cinema", "description 2");
		tache2.complete();
		Task tache3 = new Task("Dire Mamamiya a la fin", "description 3");
		tache3.complete();
		
		System.out.println(tache1.description);
		System.out.println(tache1.completed);
		System.out.println(tache2.description);
		System.out.println(tache3.description);

		

	}

}
