
public class Mammifere extends Animal {

	public String boireDuLait(int a) {
		
		System.out.print("(m�thode Mammifere.boireduLait()) ");	
		
		if (a == 1 ) {
			String lait = "c'est un mammif�re mais ne peut pas boire de lait";
			return lait;
		}
		
		
		else if (a == 2) {		
			String lait = "c'est un mammif�re et peut boire du lait";	
			return lait;
			
		}
		
		else {
			String lait = " c'est un mammif�re mais nous ne savons pas si il ou elle peut boire du lait";
			return lait;
			
		}	
		
	}
	
}
