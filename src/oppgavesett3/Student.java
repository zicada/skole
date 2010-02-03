package oppgavesett3;

public class Student {
	private String forNavn;
	private String etterNavn;
	private int alder;
	
	public Student(String forNavn, String etterNavn, int alder){
		this.forNavn = forNavn;
		this.etterNavn = etterNavn;
		this.alder = alder;
	}
	public void settAlder(int nyAlder){
		alder = nyAlder;
	}
	public int hentAlder(){
		return alder;
	}
	public void settFornavn(String nyttFornavn){
		forNavn = nyttFornavn;
	}
	public String hentFornavn(){
		return forNavn;
	}
	public void settEtternavn(String nyttEtternavn){
		forNavn = nyttEtternavn;
	}
	public String hentEtternavn(){
		return etterNavn;
	}
	
}