package oppgavesett3;

public class Oppgave3 {
	public static void main(String[] args) {
		Flaske threeLitre = new Flaske(3);
		Flaske fiveLitre = new Flaske(5);

		threeLitre.fyllFull();
		fiveLitre.hellOver(threeLitre);
		threeLitre.fyllFull();
		fiveLitre.hellOver(threeLitre);
		fiveLitre.tom();
		fiveLitre.hellOver(threeLitre);
		threeLitre.fyllFull();
		fiveLitre.hellOver(threeLitre);
		System.out.println("The five-litre bottle now contains: "
				+ fiveLitre.hentVannmengde() + " litres");
	}
}
