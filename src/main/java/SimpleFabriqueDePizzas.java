/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public abstract class SimpleFabriqueDePizzas {

	/**
	 * @param type
	 * @return a Pizza object according to the type
	 */
	public Pizza creerPizza(String type) {

		switch (type) {
			case "fromage":
				return new PizzaFromage();
			case "grecque":
				return new PizzaGrecque();
			case "poivrons":
				return new PizzaPoivrons();
			default:
				return new PizzaFromage();
		}
	}
}