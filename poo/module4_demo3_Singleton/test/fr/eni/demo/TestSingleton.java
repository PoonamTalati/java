package fr.eni.demo;

import fr.eni.demo.bo.Address;
import fr.eni.demo.bo.Person;

public class TestSingleton {
	public static void main(String[] args) {
		
		Logger logger1 = Logger.getInstance();
		Person p1 = new Person();
		Address a1 = new Address();
		System.out.println("Logs from logger1:");
		logger1.printLogs();
		
		
	}
}
