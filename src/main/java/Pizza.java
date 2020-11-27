import java.util.ArrayList;

/**
 * @author bruel (from O'Reilly Head-First series)
 */
public abstract class Pizza {

	String name;
	String crust;
	String sauce;
	ArrayList<String> garnitures;
	
	public void preparer() {
		System.out.println("Preparation of Pizza with" + this.getName());
		System.out.println("Spread the pizza dough...");
		System.out.println("Add the sauce...");
		System.out.println("Add the garnitures:");
		System.out.println(this.garnitures);
		
	}

	public void cuire() {
		System.out.println("Bake 25 minutes at 180 degrees");
		
	}

	public void couper() {
		System.out.println("Cut the pizza in triangles");
		
		
	}

	public void emballer() {
		System.out.println("Put the pizza in the official box");
		
	}
	
	public String getName() {
		return this.name;
	}

}
