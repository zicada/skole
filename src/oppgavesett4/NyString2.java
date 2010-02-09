package oppgavesett4;

// Dette er oppgave 4
// Oppgaveteksten var noe uklar mtp "istedet", Valgte derfor å lage et _nytt_ objekt av typen StringBuilder
// og bruke dette til å returnere strengene samt appende ekstra info enklere en med String().
// Fint med tilbakemelding dersom jeg har misforstått oppgaven. Andre alternativer som kun å bruke StringBuilder som 
// class-variabel virket for ulogiske da StringBuilder mangler alternativer til elementære metoder 
// som split() og replaceALL() o.l.

public class NyString2 {
	private String tekst;
	StringBuilder builder = new StringBuilder();

	public NyString2(String o) {
		tekst = o;
	}

	public String fjerne(String bokstav) {
		builder.append("Resultat med " + bokstav + " fjernet: \n");
		builder.append(tekst.replaceAll(bokstav, ""));
		return builder.toString();
	}

	public String forkorte() {
		String[] ord = tekst.split(" ");
		builder.append("Forkortelse: ");
		for (String i : ord) {
			builder.append(i.substring(0, 1));
		}
		return builder.toString();
	}
}