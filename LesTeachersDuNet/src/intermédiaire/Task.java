package intermédiaire;

public class Task {

	public String description = "Description par defaut";
	public boolean completed = false;
	
	public Task(String desc) {
		
		description = desc;
		
	}
	
	public void complete() {
		
		completed = true;
		
	}
	
}
