import java.util.LinkedList;

import kurs.Valute;
import kurs.specifikacija.KursInterfejs;

public class KursImplementacija implements KursInterfejs {

	private LinkedList<Valute> kursevi = new LinkedList<Valute>();
	@Override
	public void dodavanjeKursa(Valute v) {
		if (kursevi.contains(v)){
			System.out.println("Vec postoji takav objekat");
			return;
		}
		else{
			kursevi.addLast(v);
		}
		if(kursevi.isEmpty()){
			System.out.println("Lista je prazna");
			kursevi.addLast(v);
		}
		
	}

	@Override
	public void brisanjeKursa(Valute v) {
		
	}

	@Override
	public Valute pronadji(Valute v) {
		
		return null;
	}

}
