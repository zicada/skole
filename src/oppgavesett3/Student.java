package oppgavesett3;

public class Student {
	private String surName;
	private String lastName;
	private int age;

	public Student(String s, String l, int a) {
		surName = s;
		lastName = l;
		age = a;
	}

	public int getAge() {
		return age;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSurname() {
		return surName;
	}

	public int setAge(int newAge) {
		age = newAge;
		return age;
	}

	public String setLastName(String newLastName) {
		surName = newLastName;
		return surName;
	}

	public String setSurName(String newSurName) {
		surName = newSurName;
		return surName;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", lastName=" + lastName + ", surName="
				+ surName + "]";
	}

}