package fr.eni.tp.filmotheque.controller;

import java.util.List;

import org.springframework.stereotype.Component;

import fr.eni.tp.filmotheque.bll.mock.FilmServiceBouchon;
import fr.eni.tp.filmotheque.bo.Film;

@Component
public class FilmController {

	private FilmServiceBouchon filmServiceBouchon;
	
	public FilmController(FilmServiceBouchon filmServiceBouchon) {
		super();
		this.filmServiceBouchon = filmServiceBouchon;
	}

	public void afficherUnFilm(int i) {
		Film f=filmServiceBouchon.consulterFilmParId(i);	
		System.out.println(f);  
	}

	public void afficherFilms() {
		List<Film> lstfilm = filmServiceBouchon.consulterFilms();
        for(Film f:lstfilm)
        	System.out.println(f);  		
	}

}
