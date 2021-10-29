package OOP_10_29_reallization;

public class WolfHumanApp {
	
	public static void main(String[] args) {
		WolfHuman wolfHuman = new WolfHuman();
		
		wolfHuman.speak();
		wolfHuman.walk();
		wolfHuman.smile();
		wolfHuman.change();
		wolfHuman.cryLoudly();
		wolfHuman.fastWlak();
		
		System.out.println("===============================");
		// �θ�Ŭ������ ���������� �����Ͽ� �ڽ� �ν��Ͻ� ����
		// => ���������� �θ� �ν��Ͻ��� �޼��常 ȣ�Ⱑ��
		// => ��ü ����ȯ�� �̿��ϸ� �ڽ� �ν��Ͻ��� �޼��� ȣ�� ����
		
		Human human = new WolfHuman();
		human.speak();
		human.walk();
		human.smile();
		
		System.out.println("===============================");
		
		// ����� ��ü ����ȯ�� �̿��Ͽ� �ڽ� �޼��带 ȣ���� �� �ִ�. 
		((WolfHuman)human).change();
		System.out.println("===============================");
//		Wolf wolf = new Wolf();
		// �������̽��� ���������� �����Ͽ� �ڽ� �ν��Ͻ� ���� ����
//		Wolf wolf = new WolfHuman();
		
		// �ڽ� Ŭ������ ���� �θ� Ŭ���� �Ǵ� �θ� �������̽��� ���� ����� ��ü ����ȯ�� 
		// �̿��Ͽ� �ڽ� �ν��Ͻ� ���� ���� 
		// �θ�� �ڽ��� ���� ����Ҽ��ִ�.
		
		// ������ ��ü ����ȯ�� ���� �ڽ� �ν��Ͻ��� �޼��� ȣ�� 
		// �������̽��� ������ �ڽ� �ν��Ͻ��� ȣ��ȴ�. 
		Wolf wolf = (Wolf)human;
		wolf.cryLoudly();
		wolf.fastWlak();
	}
}
