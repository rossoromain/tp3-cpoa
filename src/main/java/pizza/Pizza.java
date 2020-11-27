package pizza;

import java.util.ArrayList;

/**
 * @author bruel (from O'Reilly Head-First series)
 */
public abstract class Pizza {

	public String nom;
	public String pate;
	public String sauce;
	public ArrayList<String> garnitures;

	public void preparer() {
		System.out.println("Préparation de Pizza sauce "+getNom());
		System.out.println("Etalage de la pâte...");
		System.out.println("Ajout de la sauce...");
		System.out.println("Ajout des garnitures:");
		System.out.println(this.garnitures);
	}

	public void cuire() {
		System.out.println("Cuisson 25 minutes à 180 degrès");
		
	}

	public void couper() {
		System.out.println("Découpage en parts triangulaires");		
	}

	public void emballer() {
		System.out.println("Emballage dans une boîte officielle");
		System.out.println("");
	}
	
	public String getNom(){
		return this.nom;
	}
}
