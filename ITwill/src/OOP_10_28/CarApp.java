package OOP_10_28;

public class CarApp {
				// JVM�� public class CarApp �о�� static ���� �޼��带 ȣ�� 
	public static void main(String[] args) {
		
		Car car = new Car("ȫ�浿","��Ÿ��");
		
		System.out.println("������ : " + car.getUserName());
		System.out.println("�𵨸� : " + car.getModelName());
		
		
		// Object �޼�����  toString() - ��ü�� ���ڿ��� �����Ͽ� ��ȯ �Ѵ�.
		/*
		System.out.println(" car.toString() = " + car.toString());
		
		// getClass().getname() + '@' + Integer.toHesString(hashCode())
						// �ν��Ͻ��� ������ִ� �޼��忡  16���� �ؽ��ڵ� �� �������
		
		// Car Ŭ������ Object Ŭ������ ��� �ޱ� ������ Object Ŭ������ �޼��� ȣ�� ����
		// Object.toString() : �ν��Ͻ��� ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼��� 
		
		
		// ���������� ����� �ν��Ͻ��� ����� ��� �ڵ����� Object Ŭ������ tostring() �޼��带 �� ȣ���Ѵ�.
		// �Ͽ� ���������� ����� �ν��Ͻ��� ���ڿ��� ��ȯ�Ͽ� ��� 
		
		// �θ�Ŭ������ �޼��尡 ���� �ȵ�� �������̵� 
		System.out.println("car = " + car); 
		System.out.println("=========================================");
		*/
		
		// Object Ŭ������ toString() �޼��带 ȣ���Ͽ� Object Ŭ������ �޼��� ��� �ڽ� Ŭ������
		// toString() �޼��尡 ȣ��ȴ�. 
		System.out.println(car); // �ν��Ͻ��� �ʵ尪�� ��ȯ�޾� ��� (�ڽĿ��� �������̵�)
		System.out.println("==========================================");

		
		// Object Ŭ������ toString() �޼��� ��� StringŬ������ toString() ȣ�� 
		String name = "ȫ�浿";
		System.out.println("name.toString " + name.toString());
		System.out.println(name); // �ڵ����� StringŬ�������� toStrng �������ؼ� ȣ��
	
	}
	
}
