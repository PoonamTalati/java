package fr.eni.zoo.dal;

public class DaoFactory {
	private static AnimalDao animalDaoInstance = null;

	private DaoFactory() {
	}

	public static AnimalDao getAnimalDao() {
		if (animalDaoInstance == null) {
			animalDaoInstance = new AnimalDaoMock();
		}
		return animalDaoInstance;
	}
	
}
