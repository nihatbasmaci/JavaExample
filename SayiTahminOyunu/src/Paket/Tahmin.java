package Paket;

import java.util.Random;
import java.util.Scanner;

public class Tahmin {
	 private Scanner input;
	 private int tahmin;
	 private char basla;
	 private String isim1;
	 private Random rnd;
	 private int puan=100,hak=5;
	 private int ZarAt;
	 private int dur;
	public void İsimGir(){
		input=new Scanner(System.in);
		isim1=input.next();
		System.out.println("İsminiz = "+isim1);
	}
	public void play(){
		input=new Scanner(System.in);
		basla=input.findInLine(".").charAt(0);
		if(basla=='Y' || basla=='y'){
			RollDice();
			Devami();
		}
		else if(basla=='N' || basla=='n' ){
			System.out.println("Oyunu İptal Ettiniz !! ");
		}
		}
	
	public int tahminDeger(){
		System.out.print("\n\nDeger Giriniz(1-6) = ");
		input=new Scanner(System.in);
		tahmin=input.nextInt();
		return tahmin;
	}
	public void RollDice(){
		 rnd=new Random();
	     ZarAt=rnd.nextInt(6)+1;
	     
	}
	public void Devami(){
		if(ZarAt==tahminDeger()){
			dur=0;
			System.out.println("Tebrikler bildiniz ");
		}
		else{
			puan=puan-10;
			hak=hak-1;
			dur = 1;
		}		
		System.out.println("puan = "+puan+"\nhak = "+hak);
		if(hak>0 && dur ==1 ){
		   Devami();
		   
			}
		}

  }

