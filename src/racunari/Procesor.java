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
public class Procesor extends Komponenta {

	protected int BrJezgara;
	protected int RadniTakt;
	
	
	/**
	 * @param sifra
	 * @param naziv
	 * @param cena
	 * @param kategorija
	 */
	public Procesor(String sifra, String naziv, double cena, String kategorija, int BrJezgara, int RadniTakt) {
		super(sifra, naziv, cena, kategorija);
		this.BrJezgara = BrJezgara;
		this.RadniTakt = RadniTakt;
	}
	
	@Override
	public String toString() {
		return super.toString() + " , " + BrJezgara + " , " + RadniTakt;
	}

}
