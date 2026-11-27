package fr.eni.tp.filmotheque.bo;

public class Avis {
	private int note;
	private String commentaire;
	private long id;
	private Membre membre;
	public Avis(int note, String commentaire) {
		super();
		this.note = note;
		this.commentaire = commentaire;
	}
	public Avis(long id, int note, String commentaire, Membre m) {
		this.id=id;
		this.note = note;
		this.commentaire = commentaire;
		this.membre=m;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public Avis() {
		super();
		
	}
	@Override
	public String toString() {
		return "Avis de "+membre.getPrenom()+" "+membre.getNom()
		+"("+membre.getId()+") - Membre (pseudo="+membre.getPseudo()+
		" admin= "+membre.isAdmin()+
		" - note= "+this.getId()+
		" , commentaire="+this.getCommentaire();
		
	}
	
	
}
