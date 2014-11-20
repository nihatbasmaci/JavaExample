package dekoratorler;

import icecekler.Icecek;

public class Cikolata extends IcindekilerDecorator {
	
	
	Icecek icecek;
    public Cikolata() {
		// TODO Auto-generated constructor stub
	}
	
	public Cikolata(Icecek beverage) {
		this.icecek = beverage;
	}
 
        @Override
	public String getIsim() {
		return icecek.getIsim() + ", Cikolata";
	}
 
        @Override
	public double fiyatHesapla() {
		return 1.00 + icecek.fiyatHesapla();
	}
}
