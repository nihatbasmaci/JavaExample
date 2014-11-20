package ZarAtmaPaket;

import java.util.Random;

public class ZarAtFonksiyonu {
	private int sayi;
	
	public int getGenNumber(){
		return sayi;
	}
	public void ZarAt(){
		Random rnd=new Random();
		this.sayi=rnd.nextInt(6)+1;
	}

}
