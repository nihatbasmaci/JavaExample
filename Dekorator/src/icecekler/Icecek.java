package icecekler;

public abstract class Icecek {
	String isim = "Icecek";
  
	public String getIsim() {
		return isim;
	}
 
	public abstract double fiyatHesapla();
}
