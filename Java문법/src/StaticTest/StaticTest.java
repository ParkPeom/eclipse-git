
public class StaticTest {
	
	int num1 = 10; // ����� �ʱ�ȭ 
	int num2 = 20;
	int num3 = 30;
	int num4; // ������ �ʱ�ȭ
	
	// static ���� 
	static int[] arr = new int[10];
	
	{
	// �ν��Ͻ� �ʱ�ȭ ����� ����� �ʱ�ȭ 
		num1 = 50;
	}
	// static �ʱ�ȭ �� 
	static {
		int total = 0;
		System.out.println("�޸𸮿� �ε��ɶ� ����");
		for(int i = 0; i < arr.length; i++) {
			arr[i] += 1;
			total += arr[i];
			System.out.println(total);
		}
	}
	// �ν��Ͻ� �ʱ�ȭ ��
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
