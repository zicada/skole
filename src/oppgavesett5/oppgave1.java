package oppgavesett5;

import java.util.Random;

public class oppgave1 {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] total = new int[10];
		int count = 0;
		for(int i = 0;i<1000;i++){
			int num = random.nextInt(10);
			total[num]++;
		}
		for(int x: total){
			System.out.println(count + ": " +x);
			count++;
		}
	}
}
