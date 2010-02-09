package oppgavesett4;

import java.text.DecimalFormat;

// Dette er oppgave 5
public class TekstBehandling {
	private String tekst;
	
	// Metode for å runde av double til 2 decimaler.
	double rundAv(double d) {
    	DecimalFormat dec = new DecimalFormat("#.##");
    	return Double.valueOf(dec.format(d));
	}
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
		return rundAv(lengde / antall.length);
	}
	public String perPeriode(){
		StringBuilder builder = new StringBuilder();
		String strengMedHashes = tekst .replaceAll("\\!","#")
						.replaceAll("\\?","#")
						.replaceAll("\\,","#")
						.replaceAll("\\.","#");
		String[] periodeArray = strengMedHashes.split("#");
		double lengde = 0;
		for (String i: periodeArray){
			if (i.startsWith(" ")){
				i = i.replaceFirst(" ", "");
			}
			String[] setningArray = i.split(" ");
			for (String j: setningArray){
				 lengde += j.length();
			}
			builder.append(i +": " + rundAv(lengde / setningArray.length)  + "\n");
			lengde = 0;
		}
		return builder.toString();
	}
}
