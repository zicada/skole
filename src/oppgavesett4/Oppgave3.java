package oppgavesett4;

public class Oppgave3 {
	public static void main(String[] args){
		TekstBehandling tekst = new TekstBehandling("A mutable sequence of characters. " +
				"This class provides an API compatible with StringBuffer, " +
				"but with no guarantee of synchronization. " +
				"This class is designed for use as a drop-in replacement for StringBuffer " +
				"in places where the string buffer was being used by a single thread " +
				"(as is generally the case). " +
				"Where possible, it is recommended that this class be used in preference to StringBuffer " +
				"as it will be faster under most implementations.");

		
		System.out.println(tekst.antallOrd());
		System.out.println(tekst.hentTekst());
		System.out.println(tekst.hentUcase());
		System.out.println(tekst.ordLengde());
		System.out.println(tekst.perPeriode());
	}
}
