package dekoratorler;

import icecekler.Icecek;

public class Sut extends IcindekilerDecorator {
	Icecek icecek;

	public Sut(Icecek beverage) {
		this.icecek = beverage;
	}

        @Override
	public String getIsim() {
		return icecek.getIsim() + ", Sutlu";
	}

        @Override
	public double fiyatHesapla() {
		return 2.00 + icecek.fiyatHesapla();
	}
}
