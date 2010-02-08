package oppgavesett4;

public class Hund {

	private String navn;
	private String rase;
	private int alder;
	
	public Hund(String n, String r, int a){
		navn = n;
		rase = r;
		alder = a;
	}
	public String hentNavn(){
		return navn;
	}
	public String hentRase(){
		return rase;
	}
	public int hentAlder(){
		return alder;
	}
	public int hentMenneskeaar(){
		return alder*7;
	}
	public String toString(){
		String s = "Navn: "+navn
		+ "\nRase: " + rase
		+ "\nAlder: " + alder;
		return s;
	}
}