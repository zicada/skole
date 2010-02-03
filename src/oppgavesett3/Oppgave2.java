package oppgavesett3;

public class Oppgave2 {
	public static void main(String [] args){
		Flaske fireliter = new Flaske(4);
		Flaske niliter = new Flaske(9);
		
		niliter.fyllFull();
		fireliter.hellOver(niliter);
		fireliter.tom();
		System.out.println("Fireliters flasken har vannmengde: "+fireliter.hentVannmengde()+" liter");
		System.out.println("Niliters flasken har vannmengde: "+niliter.hentVannmengde()+" liter");
	}
}
