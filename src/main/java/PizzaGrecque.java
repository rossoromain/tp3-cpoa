/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public class PizzaGrecque extends Pizza {
	public PizzaGrecque() {
		this.name= "grecque";
		this.sauce = "tomate";
		this.crust= "pâte à pizza";
		this.garnitures.add("tomates cerises");
		this.garnitures.add("oignons");
	}
}
