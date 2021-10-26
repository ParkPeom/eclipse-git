package interface_sample;

public class Interface_exG implements interface_ex {
	
	public void ex() {
		System.out.println("ex");
	}
	
	public static void main(String[] args) {
		Interface_exG ex = new Interface_exG();
		interface_ex ex2 = new Interface_exG();
		ex2.num();
	}
}
