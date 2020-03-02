package biblioteka;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {
	
	private List<Knjiga> knjige = new ArrayList<Knjiga>();

	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		knjige.add(knjiga);
	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		knjige.remove(knjiga);
	}

	@Override
	public List<Knjiga> vratiSveKnjige() {
		return knjige;
	}

	@Override
	public List<Knjiga> pronadjiKnjigu(Autor autor, String isbn, String naslov, String izdavac) {
		List<Knjiga> rezultat = new LinkedList<Knjiga>();
		
		for(Knjiga k: knjige)
			if (k.getNaslov().contains(naslov))
				rezultat.add(k);
		
		return rezultat;
	}

}
