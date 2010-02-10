package oppgavesett3;

public class Oppgave2 {
	public static void main(String[] args) {
		Flaske fourLitre = new Flaske(4);
		Flaske nineLitre = new Flaske(9);

		nineLitre.fyllFull();
		fourLitre.hellOver(nineLitre);
		fourLitre.tom();
		System.out.println("The four-litre bottle has a water level of: "
				+ fourLitre.hentVannmengde() + " litres");
		System.out.println("The nine-litre bottle has a water level of: "
				+ nineLitre.hentVannmengde() + " litres");
	}
}
