package fr.eni.zoo.bo;

public class Animal {
	private int id;
	private String name;
	private boolean isFemale;
	private TypeAnimal typeanimal;
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(int id, String name, boolean isFemale, TypeAnimal typeanimal) {
		super();
		this.id = id;
		this.name = name;
		this.isFemale = isFemale;
		this.typeanimal = typeanimal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFemale() {
		return isFemale;
	}
	public void setFemale(boolean isFemale) {
		this.isFemale = isFemale;
	}
	public TypeAnimal getTypeanimal() {
		return typeanimal;
	}
	public void setTypeanimal(TypeAnimal typeanimal) {
		this.typeanimal = typeanimal;
	}
	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + ", isFemale=" + isFemale + ", typeanimal=" + typeanimal + "]";
	}
	
}
