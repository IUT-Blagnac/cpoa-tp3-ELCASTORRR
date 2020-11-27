package main.java;

public class PizzaFromageStyleStrasbourg extends Pizza{
	
	public PizzaFromageStyleStrasbourg() {

	}
	
	protected void preparer() {
		System.out.println("Préparation de Pizza pâte style Strasbourg et fromage\r\n" + 
				"Étalage de la pâte...\r\n" + 
				"Ajout de la sauce...\r\n" + 
				"Ajout des garnitures:\r\n" + 
				" Mozzarella en lamelles");
	}

	@Override void couper() {
		// TODO Auto-generated method stub
		System.out.println("Découpage en parts carrées");
	}

}
