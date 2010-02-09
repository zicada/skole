package oppgavesett4;

import java.awt.image.ReplicateScaleFilter;
import java.util.HashMap;

// Dette er oppgave 5
public class TekstBehandling {
	private String tekst;
	
	public TekstBehandling(String t){
		tekst = t;
	}
	public String hentTekst(){
		return tekst;
	}
	public String hentUcase(){
		return tekst.toUpperCase();
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
	public String perPeriode(){
		StringBuilder builder = new StringBuilder();
		String strengMedHashes = "";
		strengMedHashes = tekst .replaceAll("\\!","#")
								.replaceAll("\\?","#")
								.replaceAll("\\,","#")
								.replaceAll("\\.","#");
		String[] periodeArray = strengMedHashes.split("# ");
		return "temp";
	}
}
