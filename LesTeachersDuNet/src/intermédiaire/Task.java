package intermédiaire;

public class Task {

	public String title;
	public String description = "Description par defaut";
	public boolean completed = false;
	
	public Task(String description, String title ) {
		
		this.title = title;
		this.description = description;
		
	}
	
	public void complete() {
		
		completed = true;
		
	}
	
}
