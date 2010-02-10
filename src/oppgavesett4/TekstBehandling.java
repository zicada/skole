package oppgavesett4;

// Dette er oppgave 5
public class TekstBehandling {
	private String text;
	StringBuilder builder = new StringBuilder();

	public TekstBehandling(String t) {
		text = t;
	}

	public int numWords() {
		String[] amt = text.split(" ");
		return amt.length;
	}

	public String findAndReplace(String origStr, String newStr) {
		builder.append(text.replace(origStr, newStr));
		return builder.toString();
	}

	public String getText() {
		return text;
	}

	public String getUcase() {
		return text.toUpperCase();
	}

	public double avgWordLen() {
		String[] amt = text.split(" ");
		double length = 0;
		for (String i : amt) {
			length += i.length();
		}
		return (length / amt.length);
	}

	public String avgPerSentence() {
		String strReplace = text.replaceAll("\\!", "#").replaceAll("\\?",
				"#").replaceAll("\\,", "#").replaceAll("\\.", "#");
		String[] sentenceArray = strReplace.split("#");
		double length = 0;
		for (String i : sentenceArray) {
			if (i.startsWith(" ")) {
				i = i.replaceFirst(" ", "");
			}
			String[] wordArray = i.split(" ");
			for (String j : wordArray) {
				length += j.length();
			}
			builder.append(i + ": " + (length / wordArray.length) + "\n");
			length = 0;
		}
		return builder.toString();
	}

}
