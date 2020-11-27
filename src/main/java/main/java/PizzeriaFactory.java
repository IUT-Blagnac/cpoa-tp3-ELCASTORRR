package main.java;

public class PizzeriaFactory {
	
	
	private static PizzeriaFactory uniqueInstance = null ;
	
	protected PizzeriaFactory() {
		
		
	}

	
	
	public static final PizzeriaFactory getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new PizzeriaFactory();
		}
		return uniqueInstance;
	}


	public Pizzeria creer(String pNom) {
		if(pNom.equals("Brest")) {
			
			return new PizzeriaBrest(new PizzaFactoryBrest());
		}else {
			
			return new PizzeriaStrasbourg(new PizzaFactoryStrasbourg());}
		
	}
}
