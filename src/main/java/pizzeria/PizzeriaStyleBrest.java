package pizzeria;

import pizza.Pizza;
import pizza.SimpleFabriqueDePizzas;

public class PizzeriaStyleBrest extends Pizzeria {

    public PizzeriaStyleBrest(SimpleFabriqueDePizzas f) {
        super(f);
    }

    @Override
    protected Pizza creerPizza(String type) {
        return this.fabrique.creerPizza(type);
    }
    
}
