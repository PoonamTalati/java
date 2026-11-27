package fr.eni.tp.filmotheque.bll.FilmService;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.tp.filmotheque.bo.Film;
import fr.eni.tp.filmotheque.bo.Genre;
import fr.eni.tp.filmotheque.bo.Participant;
@Service
public interface FilmService {
		public List<Film> consulterFilms();
		public Film consulterFilmParId(long id);
		public List<Genre> consulterGenres();
		public List<Participant> consulterParticipants();
		public Genre consulterGenreParId(long id);
		public Participant consulterParticipantParId(long id);
		public void creerFilm(Film film);
		
}
