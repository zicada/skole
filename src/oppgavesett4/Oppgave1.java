package oppgavesett4;

import java.util.Scanner;

public class Oppgave1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv inn et tall: ");
		int tall = input.nextInt();
		TallKnuser resultat = new TallKnuser(tall);
		System.out
				.println("Valg:\n1: Doble \t 2: Triple\t3: kvadrat \t4: kube\n");
		int valg = input.nextInt();
		switch (valg) {
		case 1:
			resultat.doble();
			break;
		case 2:
			resultat.treDoble();
			break;
		case 3:
			resultat.kvadrat();
			break;
		case 4:
			resultat.kube();
			break;
		}
		System.out.println("Resultat: " + resultat.hentTall());
	}
}
