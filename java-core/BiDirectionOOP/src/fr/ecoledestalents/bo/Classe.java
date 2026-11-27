package fr.ecoledestalents.bo;

public class Classe {
 private String nom;
 private String level;
 private Student studentlist[];

 public Classe(String nom, String level) {
	super();
	this.nom = nom;
	this.level = level;
	studentlist=new Student[25];
 }
 public Classe() {
	 	this.nom = "Class 1";
		this.level = "Primary";
		studentlist=new Student[25];
 }
 public String getNom() {
	return nom;
 }
 public void setNom(String nom) {
	this.nom = nom;
 }
 public String getLevel() {
	return level;
 }
 public void setLevel(String level) {
	this.level = level;
 }
 public Student[] getStudentlist() {
	return studentlist.clone();
 }
 public void setStudentlist(Student[] studentlist) {
	this.studentlist = studentlist;
 }
 public void addStudent(Student s)
 {
	 for(int i=0;i<this.studentlist.length;i++)
	 {
		 if(this.studentlist[i]==null)
		 {
			 s.setClassStudent(this);
			this.studentlist[i]=s; 
			return;
		 }
		
		
	 }
	
}
 public String tracer() {
     StringBuilder sb = new StringBuilder("Classe " + this.nom);
     sb.append(" (niveau : " + this.level + ")");
     sb.append("\nSes étudiants : [");
     for (int i = 0; i < this.studentlist.length; i++) {
         if (this.studentlist[i] != null) {
             sb.append("\n\t" + this.studentlist[i].tracer());
         }
     }
     sb.append("]");
     return sb.toString();
 }     
 public void deleteStudent(Student s)
 {
	 s.setClassStudent(null);
	 for(int i=0;i<this.studentlist.length;i++)
	 {
		 if(this.studentlist[i]!=null && this.studentlist[i].getNumStudent().equals(s.getNumStudent()))	 
		 {
			
			this.studentlist[i]=null; 
			return;
		 }
		
		
	 }
	 
 }

 	 
}
