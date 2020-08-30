/**
 * Copyright (c) 2020 by fluxmeister. All rights reserved. 
 * vektorwebsolutions.com/determinator
 * 
 */
package racunari;

import java.util.ArrayList;

/**
 * @author fluxmeister
 *
 */
public class Prodavnica {
	
	private ArrayList <Artikal> skladiste;
	
	

	public Prodavnica() {
		
		skladiste = new ArrayList<Artikal>();
		
	}

	public void prodaj (Artikal a) {
		skladiste.remove(a);
	}
	
	public void dodaj (Artikal a) {
		skladiste.add(a);
	}
	
	public int preostalo() {
		return skladiste.size();
	}
	
	public void ispis() {
		for(Artikal a:skladiste) {
			System.out.println(a);
		}
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Prodavnica p = new Prodavnica();
		
		Procesor p1 = new Procesor( "p123", "Intel", 200, "procesor", 4, 256 );
		Procesor p2 = new Procesor( "p124", "Intel", 400, "procesor", 8, 512 );
		
		Memorija m1 = new Memorija("m123", "AMD", 150.2, "memorija", 1024);
		Memorija m2 = new Memorija("m124", "AMD", 250.2, "memorija", 2048);
		
		p.dodaj(p1);
		p.dodaj(p2);
		p.dodaj(m1);
		p.dodaj(m2);
		
		System.out.println("Pre prodaje, prodavnica ima " + p.preostalo() + " artikala");
		p.ispis();
		
		p.prodaj(m2);
		p.prodaj(p1);
		
		System.out.println("Nakon prodaje, prodavnica ima " + p.preostalo() + " artikala");
		p.ispis();
	}


}
