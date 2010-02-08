package oppgavesett4;

public class TallKnuser {

	private int tall;
	
	public TallKnuser(int t){
		tall = t;
	}
	public int hentTall(){
		return tall;
	}
	public void doble(){
		tall *=2;
	}
	public void treDoble(){
		tall *=3;
	}
	public void kvadrat(){
		tall = (int) Math.pow(tall,2);
	}
	public void kube(){
		tall = (int) Math.pow(tall,3);
	}
}
