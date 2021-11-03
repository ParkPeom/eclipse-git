package 메서드체이닝;

public class Test {
	
	int i;
	
	public Test() {
		
	}		
	
	Test(int i) {
		this.i = i;
	}
	
	
	public void print() {
		System.out.println(i);
	}
	

	public static void main(String[] args) {
		int i= 0;
		
		Test t = new Test(10);
		System.out.println(t.i);
		System.out.println(i);
	}
	
}
