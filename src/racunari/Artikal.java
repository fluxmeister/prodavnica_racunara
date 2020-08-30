/**
 * Copyright (c) 2020 by fluxmeister. All rights reserved. 
 * vektorwebsolutions.com/determinator
 * 
 */
package racunari;

/**
 * @author fluxmeister
 *
 */
public abstract class Artikal {

	protected String sifra;
	protected String naziv;
	protected double cena;
	
	public Artikal (String sifra, String naziv, double cena) {
		this.sifra = sifra;
		this.naziv = naziv;
		this.cena = cena;
	}
	
	@Override
	public String toString() {
		
		return sifra + " , " + naziv + " , " + cena;
	}
	
}
