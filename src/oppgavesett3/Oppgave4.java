package oppgavesett3;

public class Oppgave4 {

	public static void main(String[] args) {

		Terning d1 = new Terning();
		Terning d2 = new Terning();
		Terning d3 = new Terning();
		Terning d4 = new Terning();
		Terning d5 = new Terning();
		Terning d6 = new Terning();

		for (int i = 0; i < 3; i++) {
			int result1 = d1.kast();
			int result2 = d2.kast();
			int sum = result1 + result2;
			System.out.println(i + 1 + ". throw:" + " First die: " + result1
					+ " Second die: " + result2 + " Sum: " + sum);
		}

		int counter = 1;
		while (d1.kast() != 6) {
			counter++;
		}
		System.out.println("It took " + counter + " attempts to get 6");

		counter = 1;
		while (d1.kast() != d2.kast()) {
			counter++;
		}
		System.out.println("It took " + counter
				+ " attempts to get two of a kind");

		boolean yatzy = false;
		counter = 1;
		while (!yatzy) {
			if (d1.kast() == d2.kast() && d1.kast() == d3.kast()
					&& d1.kast() == d4.kast() && d1.kast() == d5.kast()
					&& d1.kast() == d6.kast()) {
				yatzy = true;
			} else {
				counter++;
			}
		}
		System.out.println("It took " + counter + " attempts to get yatzy");

	}
}
