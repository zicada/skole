package oppgavesett3;

public class Oppgave3 {
	public static void main(String [] args){
		Flaske treliter = new Flaske(3);
		Flaske femliter = new Flaske(5);
		
		treliter.fyllFull();
		femliter.hellOver(treliter);
		treliter.fyllFull();
		femliter.hellOver(treliter);
		// treliteren har nå 1 liter igjen i seg
		femliter.tom();
		femliter.hellOver(treliter);
		treliter.fyllFull();
		femliter.hellOver(treliter);
		System.out.println("Femliters-flasken inneholder nå: "+femliter.hentVannmengde()+" liter");
	}
}
