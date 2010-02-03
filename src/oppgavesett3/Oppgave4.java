package oppgavesett3;

public class Oppgave4 {
	
	public static void main(String [] args){
			
		Terning terning1 = new Terning();
		Terning terning2 = new Terning();
		Terning terning3 = new Terning();
		Terning terning4 = new Terning();
		Terning terning5 = new Terning();
		Terning terning6 = new Terning();
			
		for (int i = 0; i<3; i++){
			int resultat1 = terning1.kast();
			int resultat2 = terning2.kast();
			int sum = resultat1 + resultat2;
			System.out.println(i+1 +". kast:"+" Første terning: "+resultat1 +" Andre terning: "+resultat2+" Sum: "+sum);
		}
			
		int teller = 1;
		while(terning1.kast() != 6){
			teller++;
		}
		System.out.println("Det tok "+teller+" kast for å få 6");
		
		teller = 1;
		while(terning1.kast()!=terning2.kast()){
			teller++;
		}
		System.out.println("Det tok "+teller+" kast for å få to like");
		
		teller = 1;
		while(terning1.kast()!=terning2.kast()){
			while(terning3.kast()!=terning4.kast()){
				while(terning5.kast()!=terning6.kast()){
					teller++;
				}
			}
		}
		System.out.println("Det tok "+teller+" kast for å få yatzy");
	}	
}
