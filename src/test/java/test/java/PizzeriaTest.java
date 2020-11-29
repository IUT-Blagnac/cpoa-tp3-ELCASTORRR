package test.java;
import static org.junit.Assert.*;

import main.java.*;
import org.junit.Test;

public class PizzeriaTest {

    @Test
    public void testIfThePizzaIsNotNull() {
    	Pizzeria boutiqueBrest = PizzeriaFactory.getInstance().creer("Brest");
        Pizza pizzaFromage = boutiqueBrest.commanderPizza("fromage");
        assertNotNull("An Ordered Pizza Is Not Null",pizzaFromage);
    }

    @Test
    public void TestIfItIsThesamePizza() {
        Pizza p = PizzeriaFactory.getInstance().creer("Strasbourg").commanderPizza("grecque");
        Pizza p2 = PizzaFactoryStrasbourg.getInstance().creer("grecque");
        assertEquals(p.getClass(), p2.getClass());
    }

    @Test
    public void testIfThePizzasAreDifferent() {
        Pizzeria boutiqueBrest = PizzeriaFactory.getInstance().creer("Brest");;
        Pizzeria boutiqueStrasbourg = PizzeriaFactory.getInstance().creer("Strasbourg");
        Pizza pizzaBrestFromage = boutiqueBrest.commanderPizza("fromage");
        Pizza pizzaStrasbourgFromage = boutiqueStrasbourg.commanderPizza ("fromage");
        assertNotEquals("Two Ordered Pizzas Are Different",pizzaBrestFromage,pizzaStrasbourgFromage);
    }

    @Test
    public void TestIfItIsTheGoodPizzeria() {
        Pizzeria p1 = PizzeriaFactory.getInstance().creer("Brest");
        assertEquals(PizzeriaBrest.class, p1.getClass());

        Pizzeria p2 = PizzeriaFactory.getInstance().creer("Strasbourg");
        assertEquals(PizzeriaStrasbourg.class, p2.getClass());
    }


    
    
}