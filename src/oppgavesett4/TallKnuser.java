package oppgavesett4;

public class TallKnuser {

	private int num;

	public TallKnuser(int t) {
		num = t;
	}

	public void doubleNum() {
		num *= 2;
	}

	public int getNum() {
		return num;
	}

	public void cube() {
		num = (int) Math.pow(num, 3);
	}

	public void square() {
		num = (int) Math.pow(num, 2);
	}

	public void triple() {
		num *= 3;
	}
}
