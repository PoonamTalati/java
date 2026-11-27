package fr.eni.demo.bo;

import java.util.Objects;

public class User {
	private int id;
	private String nom;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(id), nom);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return id == other.id && Objects.equals(nom, other.nom);
	}
	@Override
	public String toString() {
		return "User id=" + id + ", nom=" + nom + "\n";
	}
	
}
