package OOP_10_26;

/*
  Runtime : Java ���α׷��� �����ϴ� JVM ���� ������ �����ϴ� Ŭ����  
  => �����ڰ� ����ȭ ����Ǿ� �־� NEW �����ڷ� �ν��Ͻ� ���� �Ұ���
  => getRuntime() �̶�� ���� �޼��� ȣ���Ͽ� Runtime�ν��Ͻ��� ��ȯ�޾� ���
  => ���α׷��� �ν��Ͻ��� �ϳ��� �����ϴ� Ŭ���� - �̱��� Ŭ����(Singleton class)
 */
public class RunTimeApp {
	
	public static void main(String[] args) {
		
// Runtime runtime = new Runtime(); �����ڰ� ����ȭ�Ǿ� �ν��Ͻ�ȭ �Ҽ� ����.
		
		// Ŭ�����κ��� static �� getRuntime() ���� ��ȯ�޾ƿü��ִ�.
		
		// Runtime.getRuntime() : Runtime �ν��Ͻ��� ��ȯ�ϴ� �޼���
		Runtime runtime1 = Runtime.getRuntime();
		Runtime runtime2 = Runtime.getRuntime();
		
		// �ΰ��� ���� �ν��Ͻ�
		System.out.println("runtime1 = " + runtime1);
		System.out.println("runtime2 = " + runtime2);
	
		// .getRuntime() �޼��带 ������ ȣ���ص� ��ȯ�Ǵ� �ν��Ͻ��� ����
		// �̱��� Ŭ������ �ν��Ͻ��� ��ȯ�޾� ���������� �������� �ʰ� ���� �޼��带 ȣ��
		// Runtime.totalMemory() : JVM�� ����� �� �ִ� ��ü �޸��� ũ�⸦ ��ȯ�ϴ� �޼���
		// Runtime.freeMemory() : JVM�� ����� �� �ִ� ���� �޸��� ũ�⸦ ��ȯ�ϴ� �޼���
		System.out.println("û�� �� JVM ��� �޸� ũ�� = " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) + "Byte");

		// Runtime.gc() : garbage collector �� �����ϴ� �޼���
		// => System.gc() �޼��� ȣ�� �� ������ ��� ���� 
		// Runtime.getRuntime().gc();
		System.gc(); // �����޼���� ȣ�� 
		
		System.out.println("û�� �� JVM ��� �޸� ũ�� = " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) + "Byte");
	}
}
