package main.java;

public class PizzaGrecqueStyleBrest extends Pizza {
	
	public PizzaGrecqueStyleBrest() {
			
		}
	
	protected void preparer() {
		System.out.println("Préparation de Pizza grecque sauce style Brest\r\n" + 
				"Étalage de la pâte...\r\n" + 
				"Ajout de la sauce...\r\n" + 
				"Ajout des garnitures:\r\n" + 
				" Tomate cerise Olive noir feta");
	}

	
	protected void couper() {
		// TODO Auto-generated method stub
		System.out.println("Découpage en parts triangulaires");
	}
}
