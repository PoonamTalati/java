package fr.eni.demo.bo;

import fr.eni.demo.Logger;

public class Person {
	public Logger logger =Logger.getInstance();

	public Person() {
		logger.addlog("Person object has been created");
	}
	
}
