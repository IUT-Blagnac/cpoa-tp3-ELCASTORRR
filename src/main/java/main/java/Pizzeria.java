package main.java;

/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public abstract class Pizzeria {
	
	
	PizzaFactory pizzaFactory;
	
	
	protected Pizzeria(PizzaFactory pPizzaFactory) {
		pizzaFactory = pPizzaFactory;
	}
	
	
	public abstract Pizza commanderPizza(String type);
		
	protected abstract Pizza creerPizza(String type);
		
		

}