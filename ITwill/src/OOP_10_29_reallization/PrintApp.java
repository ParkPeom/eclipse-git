package OOP_10_29_reallization;

public class PrintApp {
	
	public static void main(String[] args) {
	// �⺻�޼��带 ȣ���ϱ� ���ؼ��� ���������� �ݵ�� �������̽��� ����
		
		Printable printOne = new PrintSingle();
		
		printOne.print();
		printOne.scan(); // �θ� �������̽��� �⺻ �޼��� ȣ��
		
		System.out.println("==============");
		Printable printTwo = new PrintMultiple();
		
		printTwo.print();
		printTwo.scan(); // �ڽ� �ν��Ͻ��� �������̵� �޼��� ȣ��
		
	}
}
