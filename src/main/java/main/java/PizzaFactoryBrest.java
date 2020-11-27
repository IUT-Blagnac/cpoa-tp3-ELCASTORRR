package main.java;

public class PizzaFactoryBrest extends PizzaFactory {
	private static PizzaFactoryBrest instance = new PizzaFactoryBrest();

	public Pizza creer(String name) {
		if (name.equals("fromage")) {
			return new PizzaFromageStyleBrest();
		} else if (name.equals("grecque")) {
			return new PizzaGrecqueStyleBrest();
		} else {
			return new PizzaPoivronStyleBrest();
		}
	}
	
	public static PizzaFactoryBrest getInstance() {
		return instance;
	}
}
