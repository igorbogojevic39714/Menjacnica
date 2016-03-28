import java.util.LinkedList;

import kurs.Valute;
import kurs.specifikacija.KursInterfejs;

public class KursImplementacija implements KursInterfejs {

	private LinkedList<Valute> kursevi = new LinkedList<Valute>();
	@Override
	public void dodavanjeKursa(Valute v) {
		
	}

	@Override
	public void brisanjeKursa(Valute v) {
		
	}

	@Override
	public Valute pronadji(Valute v) {
		
		return null;
	}

}
