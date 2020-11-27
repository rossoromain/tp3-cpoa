/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public class PizzaPoivrons extends Pizza {
	public PizzaPoivrons() {
		this.name= "poivron";
		this.sauce = "tomate";
		this.crust= "pâte à pizza";
		this.garnitures.add("poivrons rouges");
		this.garnitures.add("poivrons jaunes");
		this.garnitures.add("poivrons verts");
	}
}
