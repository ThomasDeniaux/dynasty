package dynastie.models;

public class Test {
	
	public static void main(String[] args) {
	
	Dynastie carolingiens = new Dynastie("Carolingiens");
	
	Homme pepin = new Homme("Pépin", "le Bref");
	
	carolingiens.ajouter(pepin);
	
	System.out.println(pepin.getNom());
	
	pepin.naitre(715);
	pepin.mourir(768);
	
	Femme berthe = new Femme("Berthe", "au Grand Pied");
	
	pepin.epouser(berthe);
	
	pepin.getFemme();
	
	Homme charlemagne = new Homme("Charlemagne", "");
	
	berthe.enfanter(charlemagne, 743);
	
	charlemagne.getPere();
	
	}

}
