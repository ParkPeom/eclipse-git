package String_StringBuffer_Cutter;


class Parent {
	
	public void o1() {
		System.out.println("1");
	}
}

class Child extends Parent {
	
	public void o2() {
		System.out.println("2");
	}
}
public class StringBuilderTest {
	public static void main(String[] args) {
		
		// ������ ��üŸ������ �ڼ��� �ν��Ͻ��� ����Ű�°� 
		Parent p = new Child();
//		Child c = new Parent();

		Child c = new Child();
		Parent p2 = c;
		Child c2 = (Child)p2;
	}
}
