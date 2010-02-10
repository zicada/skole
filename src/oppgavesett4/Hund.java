package oppgavesett4;

public class Hund {

	private String name;
	private String race;
	private int age;

	public Hund(String n, String r, int a) {
		name = n;
		race = r;
		age = a;
	}

	public int getAge() {
		return age;
	}

	public int getHumanYrs() {
		return age * 7;
	}

	public String getName() {
		return name;
	}

	public String getRace() {
		return race;
	}

	@Override
	public String toString() {
		String s = "Name: " + name + "\nRace: " + race + "\nAge: " + age;
		return s;
	}
}