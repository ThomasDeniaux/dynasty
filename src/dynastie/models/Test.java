package dynastie.models;

public class Test {
	
	public static void main(String[] args) {
	
	Dynastie carolingiens = new Dynastie("Carolingiens");
	
	Homme pepin = new Homme("Pépin", "le Bref");
	
	carolingiens.ajouter(pepin);
	
	System.out.println(pepin.getNom());
	
	
	}

}
