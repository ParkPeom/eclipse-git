package OOP_10_29_reallization;

// Ŭ���� ����� ���� Ŭ������ ��ӹޱ� ���� extends Ű���带 ��� - ���� ��Ӹ� ����
// Ŭ���� ����� ���� �������̽��� ��ӹޱ� ���� implements Ű���� ��� - ���� ��� ����

// => �������̽��� ��ӹ��� �ڽ�Ŭ������ �������̽��� ��� �߻�޼��带 �ݵ�� �������̵� ��������� �Ѵ�.
public class WolfHuman extends Human implements Wolf {

	@Override
	public void cryLoudly() {
		System.out.println("[����] ū�Ҹ��� ��������� �ִ� �ɷ�");
	}

	@Override
	public void fastWlak() {
		System.out.println("[����] ���߷� ������ �޸� �� �ִ� �ɷ�");
		// TODO Auto-generated method stub
	}
	
	public void change() {
		System.out.println("[�����ΰ�] ������ �� �ִ� �ɷ�");
	}
	
	
}
