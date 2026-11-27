package fr.eni.demo;

import java.util.ArrayList;
import java.util.List;

public class Logger {
	List<String> logs = new ArrayList<>();
	
	public static Logger instance =null;
	private Logger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Logger getInstance() {
		if(instance==null) {
			instance = new Logger();
		}
		return instance;
	}
	public void addlog(String message) {
		logs.add(message);
	}
	public void printLogs() {
		for(String log : logs) {
			System.out.println(log);
		}
	}
	
}
