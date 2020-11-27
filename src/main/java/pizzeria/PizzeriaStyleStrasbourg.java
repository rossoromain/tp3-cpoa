package pizzeria;

import pizza.Pizza;
import pizza.SimpleFabriqueDePizzas;

public class PizzeriaStyleStrasbourg extends Pizzeria {

    
    public PizzeriaStyleStrasbourg(SimpleFabriqueDePizzas f) {
        super(f);
    }

    @Override
    protected Pizza creerPizza(String type) {
        
        return this.fabrique.creerPizza(type);
    }
    
}
