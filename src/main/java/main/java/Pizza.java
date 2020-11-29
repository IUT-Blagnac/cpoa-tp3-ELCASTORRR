package main.java;
import java.util.ArrayList;

/**
 * @author bruel (from O'Reilly Head-First series)
 */
public abstract class Pizza {
	String nom;
	String pate;
	String sauce;
	ArrayList<String> garnitures;

	abstract void preparer();

	public void cuire() {
		// TODO Auto-generated method stub
		System.out.println("Cuisson 25 minutes à 180 degrés");
	}

	abstract void couper();

	public void emballer() {
		// TODO Auto-generated method stub
		System.out.println("Emballage dans une boîte officielle");
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String pNom) {
		this.nom = pNom;
	}

}
