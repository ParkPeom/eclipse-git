package OOP_10_29_reallization;

public class BoatCarReal implements BoatCar {

	@Override
	public void run() {
		System.out.println("�� ���� �޸��� �ɷ�");
	}

	@Override
	public void navigate() {
		System.out.println("�� ���� �����ϴ� �ɷ�");
		
	}

	@Override
	public void floating() {
		System.out.println("���߿� �������� �ɷ�");
		
	}
	
}
