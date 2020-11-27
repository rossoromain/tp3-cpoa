import static org.junit.Assert.*;

import org.junit.Test;

public class PizzeriaTest {

    @Test
    public void anOrderedPizzaIsNotNull() {
        Pizzeria boutiqueBrest = new Pizzeria(new SimpleFabriqueDePizzasBrest());
        Pizza miam = boutiqueBrest.commanderPizza("cheese");
        assertNotNull("An Ordered Pizza Is Not Null",miam);
    }

    @Test
    public void twoOrderedPizzasAreDifferent() {
        Pizzeria boutiqueBrest = new Pizzeria(new SimpleFabriqueDePizzasBrest());
        Pizzeria boutiqueStrasbourg = new Pizzeria(new SimpleFabriqueDePizzasStrasbourg());
        Pizza miam1 = boutiqueBrest.commanderPizza("cheese");
        Pizza miam2 = boutiqueStrasbourg.commanderPizza ("Greek");
        assertNotEquals("Two Ordered Pizzas Are Different",miam1,miam2);
    }
}