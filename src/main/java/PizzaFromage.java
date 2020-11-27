/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public class PizzaFromage extends Pizza {
	
	// String type; ????
	public PizzaFromage (/*String type ???*/) {
		this.name= "fromage";
		this.sauce = "tomate";
		this.crust= "pâte à pizza";
		this.garnitures.add("parmesan");
		this.garnitures.add("mozzarella");
		this.garnitures.add("chèvre");
		//this.type = type; ????
	}
	
}
