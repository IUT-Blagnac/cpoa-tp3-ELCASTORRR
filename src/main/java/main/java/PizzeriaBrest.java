package main.java;

public class PizzeriaBrest extends Pizzeria{


	
	 

	protected PizzeriaBrest(PizzaFactory pPizzaFactory) {
		super(pPizzaFactory);
		// TODO Auto-generated constructor stub
	}

	

	public Pizza commanderPizza(String type) {
		Pizza pizza = this.pizzaFactory.creer(type);
		
		pizza.preparer();
		pizza.cuire();
		pizza.couper();
		pizza.emballer();
		pizza.setNom("Pizza sauce style brest et fromage");

		return pizza;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Pizzeria Brest";
	}



	protected Pizza creerPizza(String type) {
        
        switch(type) {
        case "fromage": return new PizzaFromageStyleBrest();
                        
        
        case "grecque": return new PizzaGrecqueStyleBrest();
        
        case "poivron": return new PizzaPoivronStyleBrest();
        
        default: return null;
        
        }
        
    }

	

	
	
	

}
