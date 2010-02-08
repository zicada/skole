package oppgavesett4;

public class Kennel {
	public static void main(String[] args){
		Hund hund1 = new Hund("Lassie", "Border Collie", 6);
		Hund hund2 = new Hund("Colin", "Pitbill", 10);
		Hund hund3 = new Hund("Bernt", "Pincher", 4);
		
		System.out.println(hund1 +"\n");
		System.out.println(hund2 +"\n");
		System.out.println(hund3 +"\n");
	}
}