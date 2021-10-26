package OOP_10_26;

import java.util.ArrayList;
import java.util.List;

public class MemberApp {
	
	public static void main(String[] args) {
		// new �����ڷ� �Ű������� ���� �⺻ �����ڸ� ȣ���Ͽ� �ν��Ͻ��� ����
		// => �ν��Ͻ��� �ʵ忡�� �⺻������ �ڵ� �ʱ�ȭ
		// => new�����ڷ� ȣ���� �����ڰ� ���� ��� ���� �߻� - �ν��Ͻ� ���� �Ұ� 
		
		// new�����ڴ� Ư���� �޼����̸� . �����ڷ� ȣ���� �� ����.
		MemberVO member1 = new MemberVO();
		List<MemberVO> arr = new ArrayList<MemberVO>();
		
		// Getter �޼��带 ȣ���Ͽ� �ν��Ͻ��� �ʵ尪�� ��ȯ�޾� ���
		System.out.println("���̵� = " + member1.getId());
		System.out.println("�̸� = " + member1.getName());
		System.out.println("�̸��� = " + member1.getEmail());
		System.out.println("===============================================================");
		
		// Setter �޼��带 ȣ���Ͽ� �Ű������� ���ް��� �̿��Ͽ� �ʵ尪 ����
		member1.setId("aaa");
		member1.setName("ȫ�浿");
		member1.setEmail("aaa@daum.net");
		
		System.out.println("���̵� = " + member1.getId());
		System.out.println("�̸� = " + member1.getName());
		System.out.println("�̸��� = " + member1.getEmail());
		System.out.println("===============================================================");
		member1.display(arr);
		System.out.println("===============================================================");
		
		
		member1 = null;
		member1 = new MemberVO("bbb","����","bbb@daum.net");
		arr.add(member1);
		
		member1 = null;
		member1 = new MemberVO("ccc","������","ccc@daum.net");
		arr.add(member1);
		member1.display(arr);
	
		System.out.println("==========================================");

		MemberVO member2 = new MemberVO("BBB");
		// ���� �ϳ��� ������ ������ ���� null ���� ���´�.
		member2.display();
		
		MemberVO member3 = new MemberVO("CCC","�Ӳ���");
		member3.display();
		System.out.println("==========================================");
		
	}	
}
