package fr.eni.tp.filmotheque.bo;

import java.util.ArrayList;
import java.util.List;

public class Film {

	private long id;
	private String titre;
	private int annee;
	private int duree;
	public List<Avis> getAvis() {
		return Avis;
	}

	public void setAvis(List<Avis> avis) {
		Avis = avis;
	}

	private String synopsis;
	private Genre Genre;
	private List<Participant> Acteurs;
	private Participant Realisateur;
	private List<Avis> Avis;
	
	public Genre getGenre() {
		return Genre;
	}

	public Participant getRealisateur() {
		return Realisateur;
	}

	public void setRealisateur(Participant realisateur) {
		Realisateur = realisateur;
	}

	public void setGenre(Genre gen) {
		Genre = gen;
	}

	public List<Participant> getActeurs() {
		return Acteurs;
	}

	public void setActeurs(List<Participant> acteurs) {
		Acteurs = acteurs;
	}

	public Film(long id, String titre, int annee, int duree, String synopsis) {
		super();
		this.id = id;
		this.titre = titre;
		this.annee = annee;
		this.duree = duree;
		this.synopsis = synopsis;
		this.Acteurs=new ArrayList<Participant>();
		this.Avis=new ArrayList<Avis>();
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

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	@Override
	public String toString() {
		
		String filmDetail= "Film ("+this.id+")\n\t"+
		"Titre :"+titre+"[annee : "+1993+", duree : "+duree+"minutes]\n\t"
		+"Synopsis : "+synopsis+"\n\t"+
		"Realisateur :"+Realisateur.getNom()+" "+Realisateur.getPrenom()+" ("+Realisateur.getId()+")"+
		"Acteurs :"+getActeurs()+"\n\t"+
		"Genre : "+getGenre()+"\n\t"+
		"Avis : "+getAvis()+"\n";		
		return filmDetail;
	}
	
	
	
}
