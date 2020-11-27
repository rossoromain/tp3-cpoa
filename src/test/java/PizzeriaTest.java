import static org.junit.Assert.*;

import org.junit.Test;

import pizza.Pizza;
import pizza.SimpleFabriqueDePizzasBrest;
import pizza.SimpleFabriqueDePizzasStrasbourg;
import pizzeria.Pizzeria;
import pizzeria.PizzeriaStyleBrest;
import pizzeria.PizzeriaStyleStrasbourg;

public class PizzeriaTest {

    @Test
    public void anOrderedPizzaIsNotNull() {
        Pizzeria boutiqueBrest = new PizzeriaStyleBrest(new SimpleFabriqueDePizzasBrest());
        Pizza miam = boutiqueBrest.commanderPizza("cheese");
        assertNotNull("An Ordered Pizza Is Not Null",miam);
    }

    @Test
    public void twoOrderedPizzasAreDifferent() {
        Pizzeria boutiqueBrest = new PizzeriaStyleBrest(new SimpleFabriqueDePizzasBrest());
        Pizzeria boutiqueStrasbourg = new PizzeriaStyleStrasbourg(new SimpleFabriqueDePizzasStrasbourg());
        Pizza miam1 = boutiqueBrest.commanderPizza("cheese");
        Pizza miam2 = boutiqueStrasbourg.commanderPizza ("Greek");
        assertNotEquals("Two Ordered Pizzas Are Different",miam1,miam2);
    }
}