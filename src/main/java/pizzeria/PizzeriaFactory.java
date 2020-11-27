package pizzeria;

import pizza.SimpleFabriqueDePizzasBrest;
import pizza.SimpleFabriqueDePizzasStrasbourg;

public class PizzeriaFactory {
    private static PizzeriaFactory fabriquePizzeria = new PizzeriaFactory();

    private PizzeriaFactory() {
    }

    public static PizzeriaFactory getInstance() {
        return fabriquePizzeria;
    }

    public Pizzeria creer(String ville) {
        Pizzeria pizzeria;
        switch (ville) {
            case "Brest":
                pizzeria = new PizzeriaStyleBrest(new SimpleFabriqueDePizzasBrest());
                break;

            case "Strasbourg":
                pizzeria = new PizzeriaStyleStrasbourg(new SimpleFabriqueDePizzasStrasbourg());
                break;

            default:
                pizzeria = null;

        }
        return pizzeria;
    }
}
