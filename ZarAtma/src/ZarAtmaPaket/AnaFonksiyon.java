package ZarAtmaPaket;
import java.util.*;
public class AnaFonksiyon {
   public static void main(String[] Args){
 
		ZarAtFonksiyonu z1=new ZarAtFonksiyonu();
		z1.ZarAt();
		int x,y,z;
		x=z1.getGenNumber();
		System.out.println(x);
		z1.ZarAt();
		y=z1.getGenNumber();
		System.out.println(y);
		if((x+y)>8)
		{
			z1.ZarAt();
			z=z1.getGenNumber();
			System.out.println(z);
		}
		
	  
	}

}
