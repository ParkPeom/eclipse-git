
public class StaticTest {
	
	int num1 = 10; // 명시적 초기화 
	int num2 = 20;
	int num3 = 30;
	int num4; // 묵시적 초기화
	
	// static 정적 
	static int[] arr = new int[10];
	
	{
	// 인스턴스 초기화 블록은 명시적 초기화 
		num1 = 50;
	}
	// static 초기화 블럭 
	static {
		int total = 0;
		System.out.println("메모리에 로딩될때 실행");
		for(int i = 0; i < arr.length; i++) {
			arr[i] += 1;
			total += arr[i];
			System.out.println(total);
		}
	}
	// 인스턴스 초기화 블럭
	StaticTest() {
		
	}
	StaticTest(int num1) {
		this(3,5);
	}
	StaticTest(int num1,int num2){
		num2 = 5;
		num3 = num1 + num2;
	}
	
	public static void main(String[] args) {	
		StaticTest st = new StaticTest(4);
		System.out.println(st.num1);
	
	}
}
