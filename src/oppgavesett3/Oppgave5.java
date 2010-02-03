package oppgavesett3;

public class Oppgave5 {
	public static void main(String [] args){
		Student stud1 = new Student("Per","Jensen",24);
		Student stud2 = new Student("Jens","Persen",32);
		
		stud1.settAlder(28);
		System.out.println(stud1.hentAlder());
		stud1.settFornavn("mongo");
		System.out.println(stud1.hentFornavn());
		System.out.println(stud1.hentEtternavn());
		
		System.out.println(stud2.hentFornavn());
		System.out.println(stud2.hentEtternavn());
		System.out.println(stud2.hentAlder());
		
	}
}
