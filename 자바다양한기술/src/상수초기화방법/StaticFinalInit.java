package ����ʱ�ȭ���;

// �ʱ�ȭ ���� �̿��Ͽ� �ʱ�ȭ ��

public class StaticFinalInit {
	
	static final int GUGUDAN;
	
	static {
		GUGUDAN = (int)(Math.PI * 3.14 * 3.14);
	}
	
	public static void main(String[] args) {
		
		System.out.println(StaticFinalInit.GUGUDAN);
	}
}

