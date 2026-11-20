package fr.ecoledestalents.bo;

public class Student {
	private String name;
	private String lname;
	private String numStudent;
	private Classe classStudent;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Classe getClassStudent() {
		return classStudent;
	}

	public void setClassStudent(Classe classStudent) {
		this.classStudent = classStudent;
	}

	public Student(String name, String lname, String numStudent) {
		super();
		this.name = name;
		this.lname = lname;
		this.numStudent = numStudent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String tracer() {
		return "Student [name=" + name + ", lname=" + lname + "]";
	}

	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getNumStudent() {
		return numStudent;
	}
	public void setNumStudent(String numStudent) {
		this.numStudent = numStudent;
	}
	
}
