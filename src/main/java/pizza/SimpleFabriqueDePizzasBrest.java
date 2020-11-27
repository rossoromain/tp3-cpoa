package pizza;

public class SimpleFabriqueDePizzasBrest extends SimpleFabriqueDePizzas {

    /**
	 * @param type
	 * @return a Pizza object according to the type
	 */
	public Pizza creerPizza(String type) {

		switch (type) {
			case "fromage":
				return new PizzaFromageStyleBrest();

			default:
				return super.creerPizza(type);
		}
	}
}
