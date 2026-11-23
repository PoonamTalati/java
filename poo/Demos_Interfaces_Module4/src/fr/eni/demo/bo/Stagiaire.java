package fr.eni.demo.bo;

import java.time.LocalDate;

public class Stagiaire {
	@Override
	public String toString() {
		return "Stagiaire [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + "]";
	}
	//attributs privés
    private long id;
    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public Stagiaire(long id, String nom, String prenom, LocalDate dateNaissance) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}
	private String nom;
    private String prenom;
    private LocalDate dateNaissance;
	public Stagiaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
