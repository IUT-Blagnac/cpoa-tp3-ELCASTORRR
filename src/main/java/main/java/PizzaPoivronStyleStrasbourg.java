package main.java;

public class PizzaPoivronStyleStrasbourg extends Pizza {
	
	public PizzaPoivronStyleStrasbourg() {

	}
	
	protected void preparer() {
		System.out.println("Préparation de Pizza pâte style Strasbourg et Poivron\r\n" + 
				"Étalage de la pâte...\r\n" + 
				"Ajout de la sauce...\r\n" + 
				"Ajout des garnitures:\r\n" + 
				" Poivrons en dés Poulet Mozzarella");
	}

	@Override void couper() {
		// TODO Auto-generated method stub
		System.out.println("Découpage en parts carrées");
	}

}
