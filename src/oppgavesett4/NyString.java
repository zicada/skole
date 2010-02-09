package oppgavesett4;

// Dette er oppgave 3
public class NyString {
	private String tekst;
	
	public NyString(String o){
		tekst = o;
	}
	public String forkorte(){
		String[] ord = tekst.split(" ");
		String result = "";
		for (String i: ord){
			result += i.substring(0, 1);
		}
		return result;
	}
	public String fjerne(String bokstav){
		return tekst.replaceAll(bokstav, "");
	}
}
