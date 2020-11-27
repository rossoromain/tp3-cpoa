package pizza;

public class SimpleFabriqueDePizzasStrasbourg extends SimpleFabriqueDePizzas {

    /**
	 * @param type
	 * @return a Pizza object according to the type
	 */
	public Pizza creerPizza(String type) {

		switch (type) {
			case "fromage":
				return new PizzaFromageStyleStrasbourg();

			default:
				return super.creerPizza(type);
		}
	}
}
