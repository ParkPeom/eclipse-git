package OOP_10_25;

import java.util.ArrayList;

// Car Ŭ������ ����Ͽ� �ۼ��� ���α׷� 
public class CarApp { 
	
	public static void main(String[] args) {
		// Car Ŭ������ �ν��Ͻ��� �����Ͽ� ���������� ���� 
		// �ν��Ͻ��� �����ϸ� �ν��Ͻ� �ʵ忡�� �⺻���� �ڵ� ����ȴ�.
		
		// ������)�ν��Ͻ��� �ʵ忡 �������� ������ ����� ���
		// ���������� ���� �ʵ忡 ���� ����
		// => �ʵ忡 ���������� ���� ����� ��� ���������� ����� �߻� �� �� �ִ�.
		// �ذ�� ) �ν��Ͻ��� �ʵ忡 �������� ������ ������� �ʵ��� �ʵ带 ����ȭ(ĸ��ȭ) ó���Ѵ�.
		// => ����ȭ ����� �ʵ忡 �ν��Ͻ��� ���� ������ ��� 
		// => Getter �޼���� Setter �޼��带 ȣ���Ͽ� �ʵ忡 ���������� �����Ͽ� ���� 
		
			Car c1 =  new Car();
			ArrayList<Car> arr = new ArrayList<Car>();
	
			// �ν��Ͻ��� �ʵ尪 ���� 
			c1.setAliasName("���");
			c1.setEngineStatus(false);
			c1.setCurrentSpeed(0);
			c1.startEngine();
			c1.upSpeed(100);
			c1.downSpeed(60);
			c1.downSpeed(20);
			c1.downSpeed(10);
			c1.stopSpeed();
			c1.endEngine();
			
			arr.add(c1);
			c1 = null;
			System.out.println("=================================================");
			
			c1 = new Car();
			c1.setAliasName("���������");
			c1.setEngineStatus(false);
			c1.setCurrentSpeed(0);
			c1.startEngine();
			c1.upSpeed(80); // �⺻�� 0 �� 80�� �߰��Ȱ��� �˼� �ִ�. 
			c1.upSpeed(20);
			c1.upSpeed(30);
			c1.downSpeed(50);
			c1.endEngine(); // �߰��� �õ��� ���� ������ �� 
			c1.downSpeed(10);
			c1.downSpeed(10);
			c1.stopSpeed();
			c1.endEngine();

			arr.add(c1);
			c1 = null;
				
			System.out.println("===============================================");
			for(Car c : arr) {
				System.out.println("������ �ִ� ���� " + c.getAliasName());
			}	
			// ���������� �̿��Ͽ� ���������� ����� �ν��Ͻ�(��ü)�� ��ҿ� �����Ͽ� ���
			// => . �����ڸ� �̿��Ͽ� �ν��Ͻ�(��ü)�� ���(�ʵ� �Ǵ� �޼���) ����
		}		
	}
