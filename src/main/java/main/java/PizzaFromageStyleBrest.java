package main.java;

public class PizzaFromageStyleBrest extends Pizza {

	public PizzaFromageStyleBrest() {
		
	}
	
	protected void preparer() {
		System.out.println("Préparation de Pizza sauce style brest et fromage\r\n" + 
				"Étalage de la pâte...\r\n" + 
				"Ajout de la sauce...\r\n" + 
				"Ajout des garnitures:\r\n" + 
				" Parmigiano reggiano râpé");
	}

	
	protected void couper() {
		// TODO Auto-generated method stub
		System.out.println("Découpage en parts triangulaires");
	}
	
	
	
	
	

	
}
