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
public class Komponenta extends Artikal {

	protected String kategorija;
	
	public Komponenta (String sifra, String naziv, double cena, String kategorija) {
		super(sifra, naziv, cena);
		this.kategorija = kategorija;
	}
	
	@Override
	public String toString() {
		return kategorija + " " + super.toString();
	}
	
}
