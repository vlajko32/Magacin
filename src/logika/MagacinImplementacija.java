package logika;

import java.util.LinkedList;

import domen.Artikal;

public class MagacinImplementacija implements MagazinInterface{

	private LinkedList<Artikal> artikli = new LinkedList<Artikal>();

	@Override
	public void dodajArtikal(Artikal artikal) {
		if(artikal == null)
			throw new NullPointerException("Artikal ne sme da bude null");
		for (Artikal a : artikli) {
			if(a.getSifra() == artikal.getSifra()) {
				a.setKolicina(a.getKolicina() + 1);
				return;
			}
		}
		
		artikli.add(artikal);
	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		
		if(artikal == null)
			throw new NullPointerException("Artikal je null");
		
		if(!artikli.contains(artikal))
			throw new RuntimeException("Artikal ne postoji u trenutnoj listi artikala");

		
		artikli.remove(artikal);
		
	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		
		Artikal rezultat = null;
		
		if(sifra <= 0)
			throw new RuntimeException("Neispravna vrednost!");
		
		for (int i = 0;i<artikli.size();i++) {
			if(artikli.get(i).getSifra() == sifra)
				rezultat = artikli.get(i);
		}
		
		if(rezultat == null)
			throw new RuntimeException("Artikal sa datom sifrom nije pronadjen");
		else
			return rezultat;

		
	}

}
