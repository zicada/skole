package oppgavesett4;

// Dette er oppgave 5
public class TekstBehandling {
	private String tekst;
	StringBuilder builder = new StringBuilder();

	public TekstBehandling(String t) {
		tekst = t;
	}

	public int antallOrd() {
		String[] antall = tekst.split(" ");
		return antall.length;
	}

	public String finnOgBytt(String orig, String ny) {
		builder.append(tekst.replace(orig, ny));
		return builder.toString();
	}

	public String hentTekst() {
		return tekst;
	}

	public String hentUcase() {
		return tekst.toUpperCase();
	}

	public double ordLengde() {
		String[] antall = tekst.split(" ");
		double lengde = 0;
		for (String i : antall) {
			lengde += i.length();
		}
		return (lengde / antall.length);
	}

	public String perPeriode() {
		String strengMedHashes = tekst.replaceAll("\\!", "#").replaceAll("\\?",
				"#").replaceAll("\\,", "#").replaceAll("\\.", "#");
		String[] periodeArray = strengMedHashes.split("#");
		double lengde = 0;
		for (String i : periodeArray) {
			if (i.startsWith(" ")) {
				i = i.replaceFirst(" ", "");
			}
			String[] setningArray = i.split(" ");
			for (String j : setningArray) {
				lengde += j.length();
			}
			builder.append(i + ": " + (lengde / setningArray.length) + "\n");
			lengde = 0;
		}
		return builder.toString();
	}

}
