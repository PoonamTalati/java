package fr.eni.classexample;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Patient {
		private String nom;
		private String prenom;
		private String numeroTelephone;
		private char sexe;
		private long numSecu;
		private LocalDate dateofBirth;
		private String comment;
		public Patient(String nom, String prenom, String numeroTelephone, char sexe, long numSecu,
				LocalDate dateofBirth, String comment) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.numeroTelephone = numeroTelephone;
			this.sexe = sexe;
			this.numSecu = numSecu;
			this.dateofBirth = dateofBirth;
			this.comment = comment;
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
		public String getNumeroTelephone() {
			return numeroTelephone;
		}
		public void setNumeroTelephone(String numeroTelephone) {
			this.numeroTelephone = numeroTelephone;
		}
		public char getSexe() {
			return sexe;
		}
		public void setSexe(char sexe) {
			this.sexe = sexe;
		}
		public long getNumSecu() {
			return numSecu;
		}
		public void setNumSecu(long numSecu) {
			this.numSecu = numSecu;
		}
		public LocalDate getDateofBirth() {
			return dateofBirth;
		}
		public void setDateofBirth(LocalDate dateofBirth) {
			this.dateofBirth = dateofBirth;
		}
		public String getComment() {
			return comment;
		}
		public void setComment(String comment) {
			this.comment = comment;
		}
		public Patient() {
			this.nom="Hillary";
			this.prenom="Vambuce";
			this.numeroTelephone="0123456789";
			this.numSecu=287060244010154l;
			this.sexe='F';
			this.dateofBirth = LocalDate.of(1987, 6, 2);
			this.comment="Allergy to peanuts";
		}
		public void display()
		{
			if(this.comment==null)
			{
				this.comment="No Comment";
			}
			DateTimeFormatter formatter= DateTimeFormatter.ofPattern("d MMMM YYYY", Locale.FRENCH);
	        
	        System.out.println("### Patient ###");
	        System.out.println(this.prenom + " " + this.nom);
	        System.out.println("\tTel. :" + this.numeroTelephone);
	        System.out.println("\tSECU : " + this.numSecu 
	          + " (sexe : " + this.sexe + ", date naissance : " + this.dateofBirth.format(formatter) + ")");
	        System.out.println("Commentaires : " + this.comment);
		}
		
}
