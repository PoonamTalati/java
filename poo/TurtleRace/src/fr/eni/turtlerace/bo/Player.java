package fr.eni.turtlerace.bo;

public class Player implements Comparable<Player> {
	private String name;
	private int raceNumber;
	private int raceTime;
	public Player(String name, int raceNumber, int raceTime) {
		super();
		this.name = name;
		this.raceNumber = raceNumber;
		this.raceTime = raceTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRaceNumber() {
		return raceNumber;
	}
	public void setRaceNumber(int raceNumber) {
		this.raceNumber = raceNumber;
	}
	public int getRaceTime() {
		return raceTime;
	}
	public void setRaceTime(int raceTime) {
		this.raceTime = raceTime;
	}
	@Override
	public String toString() {
		return  name + "  -  Time:=" +raceTime + "seconds";
	}
	@Override
	public int compareTo(Player o) {
			if(this.raceTime < o.getRaceTime()) {
				return -1;
			}
			if(this.raceTime > o.getRaceTime()) {
				return 1;
			}
		return 0;
	}
	
}
