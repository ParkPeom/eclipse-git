package OOP_10_25;

public class OverloadApp {
	
	public static void main(String[] args) {
		
		Overload overload = new Overload();
		overload.displayInt(100);
		// �޼��� ȣ��� �Ű������� ���������� ���� ���޵� ��� ���� �߻� 
		// overload.displayInt(false);
		overload.displayBoolean(false);
		overload.displayString("ȫ�浿");
		
		System.out.println("========================================================");
		// �����ε� ����� �޼���� �Ű������� ���޵Ǵ� ���� ���� �޼��带 ���� ȣ��
		// => �޼��� �����ε��� ���� ������ 
		// ������ : �ν��Ͻ��� �ٸ��� �Ȱ��� �޼��带 ȣ���ص� ����� �ٸ��� �����Ѵ�.
		// ������(polymorphism) : ���⼭�� �������� �����̸��� �޼��带 ȣ���ص� ���¿� ���� �޼��尡 ����ȣ��Ǵ� ����̴�. 
		// => �������� �޼��� �����ε� , �޼��� �������� �� ���ؼ� ����� ���� �ִ�.
		// �����ε� = ���� ���ؼ� ���� ȣ�� , ����� ����� �������̵忡 ���� �������� �����̴�. 
		overload.display(200);
		overload.display(true);
		overload.display("�Ӳ���");
		// ���޹��� ���� ���� �ڷ����� �Ű������� ���� ��� ���� �߻� 
		System.out.println("========================================================");
	}
}
