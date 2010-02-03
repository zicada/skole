package oppgavesett2;

public class oppgave1 {
	public static double calcBmi(double height,double weight) {
		return weight/(height*height);
	}
	public static String getReply(int bmi){
		String reply = null;
		if(bmi>25){
			reply = "Du er for tung";
		} else {
			reply = "Du er ikke for tung";
		}
		return reply;
	}
    public static void main(String[] args){
    	int bmi = (int)calcBmi(1.89, 150);
        System.out.println(getReply(bmi));
    }
}
