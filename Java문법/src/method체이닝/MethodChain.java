package methodÃ¼ÀÌ´×;

public class MethodChain {
	
	public static void main(String[] args) {
		
		Innerc1 aa = new Innerc1();
		aa.m1().m2().m3().m4();		
	}
}
class Innerc1 {
	public int a;
	public int b;
	
	public Innerc1 m1() {
		this.a = 1;
		this.b = 2;
		return this;
	}
	public Innerc1 m2() {
		this.a = 2;
		this.b = 3;
		return this;
	}
	public Innerc1 m3() {
		this.a = 3;
		this.b = 4;
		return this;
	}
	public Innerc1 m4() {
		this.a = 4;
		this.b = 5;
		return this;
	}
}


