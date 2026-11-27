package fr.eni.zoo.bo;

public class Guardian extends Salary{
	private boolean gardienNight;

	public Guardian() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Guardian(int id, String surname, String firstname, double salary, Addresse address,boolean isgardenight) {
		super(id, surname, firstname, salary, address);
		this.gardienNight=isgardenight;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Guardian "+super.toString()+" [guard ofNight="+this.gardienNight+"]";
	}
}
