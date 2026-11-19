package fr.livremoi.bo;

public class Author {
	private String nom;
	private String nationalite; 
	private int anneeDeNaissance;
	public Author(String nom, String nationalite, int anneeDeNaissance) {
		this.nom = nom;
		this.nationalite = nationalite;
		this.anneeDeNaissance = anneeDeNaissance;
	}
	public Author() {
		super();
		this.nom="";
		this.nationalite="";
		this.anneeDeNaissance=1990;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	public int getAnneeDeNaissance() {
		return anneeDeNaissance;
	}
	public void setAnneeDeNaissance(int anneeDeNaissance) {
		this.anneeDeNaissance = anneeDeNaissance;
	}
	public String tracer()
	{
		return "author is "+this.nom+"(nationalité nationality: "+this.nationalite+", born (e)in "+this.anneeDeNaissance+"))";
	}
}
