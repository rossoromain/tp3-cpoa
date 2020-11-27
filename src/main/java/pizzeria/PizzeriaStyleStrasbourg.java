package pizzeria;

import pizza.Pizza;
import fabrique.SimpleFabriqueDePizzas;

public class PizzeriaStyleStrasbourg extends Pizzeria {

    
    public PizzeriaStyleStrasbourg(SimpleFabriqueDePizzas f) {
        super(f);
    }

    @Override
    protected Pizza creerPizza(String type) {
        
        return this.fabrique.creerPizza(type);
    }
    
}
