package fr.livremoi.ui;

import fr.livremoi.bo.Author;
import fr.livremoi.bo.Book;

public class Application {
	public static void main(String[] args) {
		Book livre = new Book("1984", 1949);
		Author auteur = new Author("Georges Orwell", "Britanique", 1903);
		livre.addAuthor(auteur);
		System.out.println(livre.tracer());
	}
}
