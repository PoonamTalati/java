package fr.eni.turtlerace.bo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CourseDeTortues {

	public static void main(String[] args) {
		
		List<Player> players = new ArrayList<>();
		players.add(new Player("Tortue1", 1, 10));
		players.add(new Player("Tortue2", 2, 5));
		players.add(new Player("Tortue3", 3, 15));
		
		System.out.println("List of Players Before sorting are:\n"+players.toString());
		
		System.out.println("List of Players Before sorting are:\n");
		Collections.sort(players);
		int counter = 1;
		for(Player player : players) {
			System.out.println(counter+" - "+player.toString());
			counter++;
			
		}
		
		

	}

}
