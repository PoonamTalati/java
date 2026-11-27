package fr.eni.zoo.dal;

public class DaoFactory {
	private static AnimalDao animalDaoInstance = null;
	private static SalaryDao salaryDaoInstance = null;

	private DaoFactory() {
	}

	public static AnimalDao getAnimalDao() {
		if (animalDaoInstance == null) {
			animalDaoInstance = new AnimalDaoMock();
		}
		return animalDaoInstance;
	}
	public static SalaryDao getSalaryDao() {
		if (salaryDaoInstance == null) {
			salaryDaoInstance = new SalarieDaoMock();
		}
		return salaryDaoInstance;
	}
	
}
