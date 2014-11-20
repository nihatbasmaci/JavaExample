package icecekler;


public class TurkKahvesi extends Icecek {
	public TurkKahvesi() {
		isim = "Turk Kahvesi";
	}
 
        @Override
	public double fiyatHesapla() {
		return 3.00;
	}
}

