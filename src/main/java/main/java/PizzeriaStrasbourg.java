package main.java;

public class PizzeriaStrasbourg extends Pizzeria {

	

	protected PizzeriaStrasbourg(PizzaFactory pPizzaFactory) {
		super(pPizzaFactory);
		// TODO Auto-generated constructor stub
	}

	
	
	public Pizza commanderPizza(String type) {
		Pizza pizza = this.pizzaFactory.creer(type);
		
		pizza.preparer();
		pizza.cuire();
		pizza.couper();
		pizza.emballer();
		pizza.setNom("Pizza pâte style Strasbourg et fromage");

		return pizza;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Pizzeria Strasbourg";
	}



	protected Pizza creerPizza(String type) {
        
        switch(type) {
        case "fromage": return new PizzaFromageStyleStrasbourg();
                        
        
        case "grecque": return new PizzaGrecqueStyleStrasbourg();
        
        case "poivron": return new PizzaPoivronStyleStrasbourg();
        
        default: return null;
        
        }
        
    }
	
	

}
