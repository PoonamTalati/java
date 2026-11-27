package fr.eni.tp.escaperooms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.eni.tp.escaperooms.bll.TreasureService;

@Component
public class TreasureRoomController {
	private TreasureService tresorService;

	public String fin() {
		return tresorService.ouvrir();
	}
	
	@Autowired
	public void setTresorService(TreasureService tresorService) {
		this.tresorService = tresorService;
	}

}
