package fr.eni.tp.filmotheque.bo;

public class Genre {
	private long id=1;
	private String titre;
	public Genre(long id, String titre) {
		this.id = id;
		this.titre = titre;
	}
	public Genre(String titre) {
		this.titre = titre;
		this.id++;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	@Override
	public String toString() {
		return this.titre+" ("+ this.id+") ";
	}
	
	
	
}
