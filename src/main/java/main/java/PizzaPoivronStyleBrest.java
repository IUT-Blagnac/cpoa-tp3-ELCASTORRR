package main.java;

public class PizzaPoivronStyleBrest extends Pizza {
	
	public PizzaPoivronStyleBrest() {
		
	}
	
	protected void preparer() {
		System.out.println("Préparation de Pizza sauce style brest et poivron\r\n" + 
				"Étalage de la pâte...\r\n" + 
				"Ajout de la sauce...\r\n" + 
				"Ajout des garnitures:\r\n" + 
				" Poivrons en lamelle Poulet Mozzarella");
	}

	
	protected void couper() {
		// TODO Auto-generated method stub
		System.out.println("Découpage en parts triangulaires");
	}
}
