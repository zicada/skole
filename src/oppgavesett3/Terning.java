package oppgavesett3;

/*
 * Terning.java
 *
 */

import java.util.Random;

/**
 * Klassen Terning beskriver en terning som kan kastes.
 */

public class Terning {

	private Random generator;
	private int antallOyne;

	/** Konstruktør - brukes til å opprette et nytt Terning-objekt: */
	public Terning() {
		generator = new Random();
		antallOyne = kast();
	}

	/**
	 * Kaster terningen.
	 * 
	 * @return Resultatet av kastet, det vil si antall øyne på den siden av
	 *         terningen som ligger opp.
	 */
	public int kast() {

		antallOyne = generator.nextInt(6) + 1;
		return antallOyne;

	}

}
