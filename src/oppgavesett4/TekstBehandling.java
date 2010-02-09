package oppgavesett4;

// Dette er oppgave 5
public class TekstBehandling {
	private String tekst;
	
	public TekstBehandling(String t){
		tekst = t;
	}
	public String hentTekst(){
		return tekst;
	}
	public int antallOrd(){
		String[] antall = tekst.split(" ");
		return antall.length; 
	}
	public double ordLengde(){
		String[] antall = tekst.split(" ");
		double lengde = 0;
		for(String i: antall){
			lengde += i.length();
		}
		return (lengde / antall.length);
	}
}
