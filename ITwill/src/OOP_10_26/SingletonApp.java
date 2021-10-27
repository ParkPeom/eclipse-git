package OOP_10_26;

public class SingletonApp {
	
	public static void main(String[] args) {
		
		/*
		// new �����ڷ� Ŭ������ �����ڸ� ȣ���Ͽ� �ν��Ͻ��� ���� 
		// => ������ �ν��Ͻ��� ���������� �����Ͽ� ��� 
		// => ���������� �̿��Ͽ� �ν��Ͻ��� �޼��� ȣ�� 
		// => �ν��Ͻ��� �޼��带 ���������� ȣ���ϰ��� �Ұ�� ��� 
		
		Singleton singleton = new Singleton();
		sing.display();
		
		// new �����ڷ� Ŭ������ �����ڸ� ȣ���Ͽ� �ν��Ͻ� ���� �� �޼��� ���� ȣ�� ����
		// => �ν��Ͻ� ���� �� �޼��带 �ϳ��� ȣ���� ��� ���
		new Singleton().display();
		*/
		// new �����ڷ� �����ڸ� ȣ���Ͽ� �ν��Ͻ��� �����ϸ� ���� �ٸ� ���� ����� �ν��Ͻ��� 
		// => �Ϲ����� Ŭ������ �ν��Ͻ��� ������ �����Ҽ��ִ�.
		// => �Ȱ����� ��� �����ϴ� �����..
		/*
		Singleton singleton1 = new Singleton();
		Singleton singleton2 = new Singleton();
		
		System.out.println("singleton1 = " + singleton1);
		System.out.println("singleton2 = " + singleton2);

		singleton1.display();
		singleton2.display();
		*/
		
		//<------------------���ʿ��� ���������� �����Ǵ°� ��������� ? ---------------
		// �̱��������� ����غ��� > �ν��Ͻ��� ��ȯ�ϴ� �����޼��带 ȣ���Ͽ� �ν��Ͻ��� ��ȯ�޾� ����  
		// => Ŭ������ �޸𸮿� ����� �� �̸� ������ �ν��Ͻ� ��ȯ - ���� �ν��Ͻ� ��ȯ 
		
		Singleton singleton1 = Singleton.getInstance(); // �ν��Ͻ��� �Ѱ��ټ��ִ�.
		Singleton singleton2 = Singleton.getInstance(); // �ν��Ͻ��� �Ѱ��ټ��ִ�.
		
		System.out.println("singleton1 = " + singleton1);
		System.out.println("singleton2 = " + singleton2);
		System.out.println("===========================");
		singleton1.display();
		singleton2.display();
		System.out.println("===========================");
		
		if(singleton1 == singleton2) {
			System.out.println(true);
		}
		
		
		// �̱��� Ŭ������ �ν��Ͻ��� ��ȯ�޾� ���� �޼��带 ȣ���ϴ°��� �����Ѵ�. 
		singleton1.getInstance().display();
		// System.out.println();
		System.out.println();
	}
}
