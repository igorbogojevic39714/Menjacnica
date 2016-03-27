package kurs.specifikacija;

import kurs.Valute;

public interface KursInterfejs {
	public void dodavanjeKursa(Valute v);
	public void brisanjeKursa(Valute v);
	public Valute pronadji(Valute v);
}
