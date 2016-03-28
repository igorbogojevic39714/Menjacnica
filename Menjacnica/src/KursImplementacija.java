import java.util.LinkedList;

import kurs.Valute;
import kurs.specifikacija.KursInterfejs;

public class KursImplementacija implements KursInterfejs {

	private LinkedList<Valute> kursevi = new LinkedList<Valute>();
	@Override
	public void dodavanjeKursa(Valute v) {
		if (v != null){
			kursevi.add(v);
		}
		else{
			System.out.println("Greska pri unosu objekta");
		}
	}

	@Override
	public void brisanjeKursa(Valute v) {
		if (kursevi.isEmpty()){
			return;
		}
		else {
			if(kursevi.contains(v)){
				kursevi.remove(v);
			}
			else{
				System.out.println("Objekat koji je unesen ne postoji.");
			}
		}
	}

	@Override
	public Valute pronadji(Valute v) {
		for (int i=0;i<kursevi.size();i++){
			if (kursevi.get(i).getDatum().equals(v.getDatum()) && 
					kursevi.get(i).getNaziv().equals(v.getNaziv())){
				return v;
			}
		}
		return null;
	}

}
