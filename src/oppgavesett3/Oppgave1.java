package oppgavesett3;

public class Oppgave1 {
	public static void main(String [] args){
		Konto konto1 = new Konto(0123,"Per",5042);
		Konto konto2 = new Konto(3210,"Nils",43800);
		Konto konto3 = new Konto(4567,"Bernt",19240);
		
		System.out.println(konto1.finnNavn()+"'s saldo er: " +konto1.finnSaldo());
		konto1.innskudd(250);
		System.out.println("Hans nye saldo er: "+konto1.finnSaldo());
		System.out.println("Brukeren av konto2 heter: " +konto2.finnNavn());
		konto3.uttak(4298);
		System.out.println(konto3.finnNavn()+"'s nye saldo med kontonummer: "+konto3.finnKontonr() +" er: "  +konto3.finnSaldo());
	}
}
