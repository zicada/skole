package oppgavesett4;

// Dette er oppgave 3
public class NyString {
	private String text;

	public NyString(String o) {
		text = o;
	}

	public String remChar(String bokstav) {
		return text.replaceAll(bokstav, "");
	}

	public String abbreviate() {
		String[] word = text.split(" ");
		String result = "";
		for (String i : word) {
			result += i.substring(0, 1);
		}
		return result;
	}
}
