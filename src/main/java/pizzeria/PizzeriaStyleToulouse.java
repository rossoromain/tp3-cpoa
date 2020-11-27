package pizzeria;

import pizza.Pizza;
import pizza.SimpleFabriqueDePizzas;

public class PizzeriaStyleToulouse extends Pizzeria {

    public PizzeriaStyleToulouse(SimpleFabriqueDePizzas f) {
        super(f);
    }

    @Override
    protected Pizza creerPizza(String type) {
        
        return this.fabrique.creerPizza(type);
    }
    
}
