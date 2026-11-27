package fr.eni.tp.filmotheque.bo;

public class Membre extends Person{
	
	private String pseudo;
	private String motdepass;
	private boolean admin;
	public Membre(long id, String nom, String prenom,String pseudo,String motdepass) {
		super(id, nom, prenom);
		this.pseudo=pseudo;
		this.motdepass=motdepass;
		
	}
	public Membre(String nom, String prenom) {
		super(nom, prenom);
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getMotdepass() {
		return motdepass;
	}
	public void setMotdepass(String motdepass) {
		this.motdepass = motdepass;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	@Override
	public String toString() {
		return "Membre [pseudo=" + pseudo + ", motdepass=" + motdepass + ", admin=" + admin + "]";
	}

	

}
