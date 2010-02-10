package oppgavesett3;

public class Oppgave5 {
	public static void main(String[] args) {
		Student stud1 = new Student("Per", "Jensen", 24);
		Student stud2 = new Student("Jens", "Persen", 32);

		stud1.setAge(26);
		System.out.println(stud1.getAge());
		stud1.setSurName("Petter");
		System.out.println(stud1.getSurname());
		System.out.println(stud1.getLastName());

		System.out.println(stud2.getSurname());
		System.out.println(stud2.getLastName());
		System.out.println(stud2.getAge());
		System.out.println("\n" + stud1);
	}
}
