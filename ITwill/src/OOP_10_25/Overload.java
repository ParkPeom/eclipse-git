package OOP_10_25;

public class Overload {
	
	public void displayInt(int param) {
		System.out.println("������ = " + param);
	}
	
	public void displayBoolean(boolean param) {
		System.out.println("���� = " + param); 
	}
	
	public void displayString(String param) {
		System.out.println("���ڿ� = " + param);
	}
	
	//*************�޼��� �����ε�*****************
	// �����ε� - ��ȯŸ���� ������� �̸��� �Ȱ��� ������µ� 
	// �Ű����� Ÿ���� �ٸ��ų� ������ �޶�� �Ѵ�.
	// �޼��� �̸��� ���Ƶ� �Ű������� ���� �ٸ��� ó���Ѵ�.
	// �ϳ��� Ŭ������ ������ ����� �����ϴ� �޼��尡 �Ű������� ���� ������ �����ؾߵ� ��� �޼��� ���� ���� �����ϴ� ����̴�.
	// => �Ű������� �ڷ��� �Ǵ� ������ ���� �ʵ��� ���� �ؾ� �Ѵ�.
	// => ���������� �� ��ȯ���� �����ε�� �����ϴ�.
	//*************�޼��� �����ε�*****************
	public void display(int param) {
		System.out.println("������ = " + param);
	}
	
	public void display(boolean param) {
		System.out.println("�Ҹ��� �� = " + param);
	}
	
	public void display(String param) {
		System.out.println("���ڿ� �� = " + param);
		
	}
	
}
