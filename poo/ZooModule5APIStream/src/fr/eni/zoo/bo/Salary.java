package fr.eni.zoo.bo;

public abstract class Salary {
		private int id;
		private String surname;
		private String firstname;
		private double salary;
		private Addresse address;
		
		
		public Salary() {
			super();
		
		}
		public Salary(int id, String surname, String firstname, double salary, Addresse address) {
			
			this.id = id;
			this.surname = surname;
			this.firstname = firstname;
			this.salary = salary;
			this.address = address;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getSurname() {
			return surname;
		}
		public void setSurname(String surname) {
			this.surname = surname;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public Addresse getAddress() {
			return address;
		}
		public void setAddress(Addresse address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "[id=" + id + ", surname=" + surname + ", firstname=" + firstname + ", salary=" + salary
					+ ", address=" + address + "]";
		}
		
}
