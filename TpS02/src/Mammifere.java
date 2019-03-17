
public class Mammifere extends Animal {

	public String boireDuLait(int a) {
		
		System.out.print("(méthode Mammifere.boireduLait()) ");	
		
		if (a == 1 ) {
			String lait = "c'est un mammifère mais ne peut pas boire de lait";
			return lait;
		}
		
		
		else if (a == 2) {		
			String lait = "c'est un mammifère et peut boire du lait";	
			return lait;
			
		}
		
		else {
			String lait = " c'est un mammifère mais nous ne savons pas si il ou elle peut boire du lait";
			return lait;
			
		}	
		
	}
	
}
