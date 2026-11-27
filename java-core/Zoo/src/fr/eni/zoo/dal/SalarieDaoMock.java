package fr.eni.zoo.dal;

import java.util.ArrayList;
import java.util.List;

import fr.eni.zoo.bo.Salary;

public class SalarieDaoMock {
	private List<Salary> salaries = new ArrayList<>();
	private static int id = 1;
	
	public static int changeId() {
		return id++;
	}
	public String insert(Salary salary) throws DALException {
		if(salary == null) {
	        throw new DALException("Salary is null"); // or throw DALException if preferred
	    }
		if(salaries.contains(salary)) {
	        throw new DALException("Salary already exists"); // or throw DALException if preferred
	    }
		salary.setId(changeId());
		salaries.add(salary);

		return salary.toString();
	}
	public void update(Salary salary) throws DALException {
		if (salary == null) {
			throw new DALException("Salary is null");
		}
		for (int i = 0; i < salaries.size(); i++) {
			if (salaries.get(i).getId() == salary.getId()) {
				salaries.set(i, salary);
				return; // Exit the method after updating
			}
		}
		throw new DALException("Salary with id " + salary.getId() + " not found for update");
	}
	public List<Salary> findall() {
		return salaries;
	}
	public void delete(Salary salary) throws DALException {
		if(salary == null) {
	        throw new DALException("Salary is null"); // or throw DALException if preferred
	    }
		boolean removed =salaries.removeIf(s -> s.getId() == salary.getId());
		if (!removed) {
			throw new DALException("Salary with id " + salary.getId() + " not found for deletion");
		}
	}
	public Salary findById(int id) throws DALException {
		for (Salary salary : salaries) {
			if (salary.getId() == id) {
				System.out.println(salary);
				return salary;
			}
		}
		System.out.println("Salary not found");
		throw new DALException("Salary with id " + id + " not found");
	}
	
}
