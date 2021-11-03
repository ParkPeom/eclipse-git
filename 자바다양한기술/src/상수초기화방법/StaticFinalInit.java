package 상수초기화방법;

// 초기화 블럭을 이용하여 초기화 함

public class StaticFinalInit {
	
	static final int GUGUDAN;
	
	static {
		GUGUDAN = (int)(Math.PI * 3.14 * 3.14);
	}
	
	public static void main(String[] args) {
		
		System.out.println(StaticFinalInit.GUGUDAN);
	}
}

