package inheritance;

class Animalland {
	
	Animalland(){
		
	}
	public void run() {
		System.out.println("�������ִ�.");
	}
	
	public void howl() {
		System.out.println("����ִ�.");
	}
}

class Monky extends Animalland {
	
	Monky() {
		super();
	}
	
	public void run() {
		System.out.println("���ó�� �������ִ�.");
	}
	public void howl() {
		System.out.println("���ó�� �ü��ִ�");
	}
}

class People extends Monky {
	
	People() {
		super();
	}
	
	public void run() {
		System.out.println("����̿��� �������ִ�.");
	}
}
public class Test {
	public static void main(String[] args) {
		// Animal�̶� �׸��� ��� ������ Human���� ������ s
		// peak()�� �����ϴ��� ���ϴ��� �� ����� ���� �����̴�.

		
		//-----------������ = new �Ʒ���������
		
		Animalland ani = new Animalland();
		ani.run(); // �������ִ�.
		ani.howl(); // ����ִ�.
		
		Animalland ani2 = new Monky();
		ani2.run(); // ���ó�� �������ִ�.
		ani2.howl(); // ���ó�� ����ִ�.
		
		People p = new People();
		p.run(); // ����̿��� �������ִ�.
		p.howl(); // ���ó�� ����ִ�.
		
		Animalland p2 = new Monky();
		p2.howl(); // ����ִ�. - Monky ���� �������̵��� �޼��尡 ȣ��ȴ�. 
		
		Animalland p3 = new People();
		p3.run(); // ����̿��� ������ �ִ�.
		
	}
}
