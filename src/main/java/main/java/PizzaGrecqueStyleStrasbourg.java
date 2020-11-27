package main.java;

public class PizzaGrecqueStyleStrasbourg extends Pizza{

	public PizzaGrecqueStyleStrasbourg() {
		
	}
	
	protected void preparer() {
		System.out.println("Préparation de Pizza Grecque pâte style Strasbourg\\r\\n\" + \r\n" + 
				"				\"Étalage de la pâte...\\r\\n\" + \r\n" + 
				"				\"Ajout de la sauce...\\r\\n\" + \r\n" + 
				"				\"Ajout des garnitures:\\r\\n\" + \r\n" + 
				"				\" feta viande hachée olive noir");
	}

	
	protected void couper() {
		// TODO Auto-generated method stub
		System.out.println("Découpage en parts carrées");
	}

}
