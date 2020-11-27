import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pizza.Pizza;
import pizzeria.Pizzeria;
import pizzeria.PizzeriaFactory;

import static org.junit.Assert.*;

public class StepDefinitions {

    String strA;

    Pizza pizzaA;
    Pizza pizzaB;

    Pizzeria pizzeriaA;
    Pizzeria pizzeriaB;

    @Given("a pizzeriaBrest A and a pizzeriaStrasbourg B")
    public void a_pizzeria_brest_a_and_a_pizzeria_strasbourg_b() {
        pizzeriaA = PizzeriaFactory.getInstance().creer("Brest");
        pizzeriaB = PizzeriaFactory.getInstance().creer("Strasbourg");
    }

    @When("A creates a cheese pizza")
    public void a_creates_a_cheese_pizza() {
        pizzaA = pizzeriaA.commanderPizza("fromage");
    }

    @Then("B's pizza hasn't the same name")
    public void b_s_pizza_hasn_t_the_same_name() {
        pizzaB = pizzeriaB.commanderPizza("fromage");
        assertNotEquals(pizzaB, pizzaA);
    }

    @Given("a pizzeriaBrest A and a pizzeriaStrastbourg B")
    @When("A and B creates a greek pizza")
    public void a_and_b_creates_a_greek_pizza() {
        pizzaA = pizzeriaA.commanderPizza("grecque");
        pizzaB = pizzeriaB.commanderPizza("grecque");

    }

    @Then("A's and B's pizze are the same")
    public void a_s_and_b_s_pizze_are_the_same() {
        assertEquals(pizzaB, pizzaB);
    }

    @Given("a random String A")
    public void a_random_string_a() {
        strA = "random";
    }

    @Given("A isn't Strasbourg or Brest")
    public void a_isn_t_strasbourg_or_brest() {
        assertNotEquals("Strasbourg", strA);
        assertNotEquals("Brest", strA);
    }

    @Then("the pizzeria isn't created")
    public void the_pizzeria_isn_t_created() {
        assertEquals(null, pizzeriaA);
    }

    @Given("a string Brest A")
    public void a_string_brest_a() {
        strA = "Brest";
    }

    @Given("a string Strasbourg A")
    public void a_string_strasbourg_a() {
        strA = "Strasbourg";
    }

    @When("trying to create a pizzeria of type A")
    public void trying_to_create_a_pizzeria_of_type_a() {
        pizzeriaA = PizzeriaFactory.getInstance().creer(strA);
    }

    @Then("the pizzeria is created")
    public void the_pizzeria_is_created() {
        assertNotEquals(null, pizzeriaA);
    }

}
