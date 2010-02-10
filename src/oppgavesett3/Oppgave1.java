package oppgavesett3;

public class Oppgave1 {
	public static void main(String[] args) {
		Konto acct1 = new Konto(0123, "Per", 5042);
		Konto acct2 = new Konto(3210, "Nils", 43800);
		Konto acct3 = new Konto(4567, "Bernt", 19240);

		System.out.println(acct1.finnNavn() + "'s current balance: "
				+ acct1.finnSaldo());
		acct1.innskudd(250);
		System.out.println("His new balance is: " + acct1.finnSaldo());
		System.out.println("The owner of account2 is: " + acct2.finnNavn());
		acct3.uttak(4298);
		System.out.println(acct3.finnNavn()
				+ "'s new balance, with account number: " + acct3.finnKontonr()
				+ " is: " + acct3.finnSaldo());
	}
}
