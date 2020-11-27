
package pizza;

/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public class PizzaFromageStyleBrest extends Pizza {
    public PizzaFromageStyleBrest() {
        super();
        this.nom = "Pizza sauce style brest et fromage";
        this.garnitures.add("Parmigiano reggiano râpé");
        
    }

    @Override
    public void couper() {
        System.out.println("Découpage en parts triangulaires");
    }
}
