package pizza;

/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public class PizzaFromage extends Pizza {
    public PizzaFromage() {
        super();
        this.nom = "Pizza fromage";
		this.pate = "Farine de blé";
		this.sauce = "Sauce tomate";
		this.garnitures.add("Roquefort");
		this.garnitures.add("Emmental");
		this.garnitures.add("Cantal");
		this.garnitures.add("Mozzarella");
    }
}
