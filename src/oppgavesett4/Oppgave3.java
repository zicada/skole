package oppgavesett4;

public class Oppgave3 {
	public static void main(String[] args){
		TekstBehandling tekst = new TekstBehandling("Dette er en test lol, med forskjellige tegn. Og bokstaver! Og spørsmål?");

		System.out.println(tekst.perPeriode());
	}
}
