package oppgavesett4;

import java.util.Scanner;

public class Oppgave1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any integer: ");
		int num = input.nextInt();
		TallKnuser resultat = new TallKnuser(num);
		System.out
				.println("Otions:\n1: double \t 2: triple\t3: square \t4: cube\n");
		int opt = input.nextInt();
		switch (opt) {
		case 1:
			resultat.doubleNum();
			break;
		case 2:
			resultat.triple();
			break;
		case 3:
			resultat.square();
			break;
		case 4:
			resultat.cube();
			break;
		}
		System.out.println("Result: " + resultat.getNum());
	}
}
