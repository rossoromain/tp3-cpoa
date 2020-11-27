package pizza;


/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public class PizzaFromageStyleStrasbourg extends Pizza {
    public PizzaFromageStyleStrasbourg() {
        super();
        this.nom = "Pizza pâte style Strasbourg et fromage";
        this.garnitures.add("Mozzarella en lamelles");
        
    }

    @Override
    public void couper() {
        System.out.println("Découpage en parts carrées");
    }
}
