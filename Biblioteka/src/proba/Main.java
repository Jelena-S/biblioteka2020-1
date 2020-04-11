package proba;

import java.util.LinkedList;
import java.util.List;

import biblioteka.Autor;
import biblioteka.Biblioteka;
import biblioteka.Knjiga;

public class Main {

	public static void main(String[] args) {

		LinkedList<Autor> autori = new LinkedList<>();
		Autor a1 = new Autor("Ime autor 1", "Prezime autor 1");
		Autor a2 = new Autor("Ime autor 2", "Prezime autor 2");
		autori.add(a1);
		autori.add(a2);
		Knjiga k1 = new Knjiga("Knjiga 1", "100", autori, "Izdavac 1", 1);

		LinkedList<Autor> autor = new LinkedList<>();
		Autor a21 = new Autor("Ime autor 21", "Prezime autor 21");
		autor.add(a21);
		Knjiga k2 = new Knjiga("Knjiga 2", "101", autor, "Izdavac 2", 2);

		Biblioteka biblioteka = new Biblioteka();
		biblioteka.dodajKnjigu(k1);
		biblioteka.dodajKnjigu(k2);

		biblioteka.sacuvajKnjige("biblioteka.json");

		Biblioteka bib = new Biblioteka();
		bib.ucitajKnjige("biblioteka.json");

	}

}
