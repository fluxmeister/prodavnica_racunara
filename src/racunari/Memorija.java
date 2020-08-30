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
public class Memorija extends Komponenta {

	protected int kapacitet;

	public Memorija(String sifra, String naziv, double cena, String kategorija, int kapacitet) {
		super(sifra, naziv, cena, kategorija);
		this.kapacitet = kapacitet;
	}

	@Override
	public String toString() {
//		return "Memorija [sifra=" + sifra + ", naziv=" + naziv + ", cena=" + cena + ", kapacitet=" + kapacitet + "]";
		return super.toString() + ", kapacitet=" + kapacitet;
	}
	
	
	
}
