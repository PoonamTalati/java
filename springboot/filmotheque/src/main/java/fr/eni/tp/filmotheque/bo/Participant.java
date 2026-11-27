package fr.eni.tp.filmotheque.bo;

public class Participant extends Person {

	public Participant(long id, String nom, String prenom) {
		super(id, nom, prenom);
	}
	public Participant( String nom, String prenom) {
		super( nom, prenom);
	}
	@Override
	public String toString() {
		
		return getNom()+" "+getPrenom()+" ("+getId()+") ";
		
		//return "Participant [getId()=" + getId() + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom()
			//	+  "]";
	}
	
}
