package pizzeria;

import pizza.Pizza;
import fabrique.SimpleFabriqueDePizzas;

public class PizzeriaStyleToulouse extends Pizzeria {

    public PizzeriaStyleToulouse(SimpleFabriqueDePizzas f) {
        super(f);
    }

    @Override
    protected Pizza creerPizza(String type) {
        
        return this.fabrique.creerPizza(type);
    }
    
}
