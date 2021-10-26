package inheritance;

public class Animal {
	
	public void action() {
		System.out.println("�����ϼ��ִ�.");
	}
	
	public void howl() {
		System.out.println("���¢�����ִ�.");
	}
	
	public static void line() {
		System.out.println("----------------");
	}

	public static void main(String[] args) {
//		Animal ani = new Animal();
//		ani.action();
//		ani.speak(); ���� �Ұ� 
		
		// �ݵ�� ����Ÿ���� ��ü�� �ڼ��ν��Ͻ��� �����Ѿ���
		// �� ? �ڽİ��� ���� �����ؾ� ���� ĳ�����Ҷ�
		// �ڽĲ� �����Ҽ� �����ϱ� !!!!!!!!!!!!!!!
		// �׷��� ĳ���� �Ŀ��� �����Ҽ��ִ�.
		Animal ani = new Mammal(); 
		Mammal mam = (Mammal)ani;
		mam.speak();

		Animal.line();
		Animal animal = new Animal();
		Mammal mammal = new Mammal();
		Human3 human3 = new Human3();
		
		animal.action(); // �����ϼ��ִ�.
		animal.howl(); // ���¢�����ִ�.
		Animal.line();
		mammal.action();
		mammal.howl();
		Animal.line();
		human3.action();
		human3.speak();
		Animal.line();
		
		
		// 2. �ٸ� ���� �޸𸮸� �Ҵ� ���Ѻ���
		System.out.println("2. �ٸ� ���� �޸𸮸� �Ҵ� ���Ѻ���");
		Animal mamman2 = new Mammal();
		Mammal human2 = new Human3();
		
		mamman2.action(); // ������� �����ϼ��ִ�.
		mamman2.howl(); // ���¢�����ִ�.
		
		human2.action(); // �ι߷� �����ϼ��ִ�.
		human2.howl(); // ���¢�����ִ�.
		human2.speak(); // ���� �Ҽ��ִ�.
		
	}
}
class Mammal extends Animal {
	
	public void action() {
		System.out.println("������� �����ϼ��ִ�.");
	}
	
	public void speak() {
		System.out.println("�����ϰ� ������ �� �ִ�.");
	}
}

class Human3 extends Mammal {
	
	public void action() {
		System.out.println("�ι߷� �����ϼ� �ִ�.");
	}
	
	public void speak() {
		System.out.println("���� �Ҽ��ִ�.");
	}
}
	
	

