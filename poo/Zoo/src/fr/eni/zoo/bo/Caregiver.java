package fr.eni.zoo.bo;

public class Caregiver extends Salary{
		private TypeAnimal specialite;

		
		public Caregiver() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Caregiver(int id, String surname, String firstname, double salary, Addresse address,TypeAnimal typeAnim) {
			super(id, surname, firstname, salary, address);
			this.specialite=typeAnim;

		}
		@Override
		public String toString() {
			return "Caregiver "+super.toString()+" [specialite="+this.specialite+"]";
		}
		

		
		
}
