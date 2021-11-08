package dynastie.models;

import java.util.ArrayList;
import java.util.List;

public class Dynastie {
	private List<Personnage> personnages;
	private String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Dynastie(String nom) {
		this.nom = nom;
		this.personnages = new ArrayList<Personnage>();
	}

	public void ajouter(Personnage personnage) {
		personnages.add(personnage);
		personnage.setDynastie(this);
	}
}
