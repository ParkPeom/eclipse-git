package String_StringBuffer_Cutter;

/*
  
  StringPool : �⺻Ÿ������ ��������� heap ������ �ִ� StringPool��
  literal �� ������ ���� �յ� ���ٴѴ�.
  
  immutable : String �� ������ �� �� ��ü�� ����Ǵ� ���� �ƴ϶�
  ���ο� ���� �����ǰ� �� ������ ������ �ٲ�
  
  String Concatenation : ��� Ÿ�Ե� ���ڿ��� ������ ���ڿ� Ÿ������ �ٲ۴�.
  �ڵ带 ���� String Ÿ���� ������ ���캸�� 
  
 */

public class MTest {
	
	public static void main(String[] args) {
		
		String s = "Hello";
		// ���� + ���ڿ� 
		System.out.println(1 + 2 + s); // 3Hello
		System.out.println(s); // Hello
		
		// ���ڿ� + ����
		s = s +  1 + 2; // "Hello12"
		System.out.println(s);
		// String concatenation
		
		// 1. str�� ��ü ���� (���)
		System.out.println(s.length()); // 7
		System.out.println("---------");
		
		// 2. str ��ü �빮�ڷ� �ٲ㼭
		System.out.println(s.toUpperCase()); // HELLO12
		
		// 3. str ��ü �ҹ��ڷ� �ٲ㼭
		System.out.println(s.toLowerCase()); // hello12
		
		// 4. str���� ù��°�� ������ c�� �ε���
		
		System.out.println(s.indexOf('c')); // ������ -1
		
		// 5. class -> java�� �ٲ㼭
	
		System.out.println(s.replace("Hello12", "java"));
		
		String str2 = s.replace("Hello12", "javacharacter");
		System.out.println(str2);
		
		// 6. character ã�Ƽ� �빮�ڷ� ��ȯ �� ��ȯ�� �������� ��ü ���
		
//		str2.replace("character", str2.substring(str2.indexOf("character"), str2.indexOf("character") + 9).toUpperCase());
		
		
		String target = "character";
		System.out.println(str2.indexOf(target));
		int start = str2.indexOf(target);
		int end = start + target.length();
		
		String upper = str2.substring(start,end).toUpperCase();
		System.out.println(str2.replace(target, upper));
		
		// 7. str�� char[] �� ����ϵ� 'c'�� ��� �׸��� c�� ���� ���ϱ�
		
		char[] c = str2.toCharArray();
		int count = 0;
		for(int i = 0; i < c.length; i++) {
			if(c[i] == 'c' || c[i] == 'C') {
				System.out.println(c[i]);
				count += 1;
			}
		}
		System.out.println("c�� ������ " + count);
		
		// 8 str�� char[]�� ����ϵ� �빮�ڸ� �׸��� �빮���� ������
		target = "Ss2eoqOieQ";
		char[] c2 = target.toCharArray();
		count = 0;
		String s2 = "";
		for(int i = 0; i < c2.length; i++) {
			if('A' <= c2[i] && c2[i] <= 'Z') {
				s2 += c2[i];
				count += 1;
			}
		}
		System.out.println("�빮�ڴ� : " + s2 );
		System.out.println(String.format("%d ����", count));	
		
		// 9. str �ȿ� ��� ���� ���� �� ���
		
		str2 = "love lo hoho ";	
		System.out.println(str2.replace(" ", ""));
		
		// 10. ��ü �������� ���
		// ��ü���� - 1 ���� 0 ���� �ݴ������ i-- 
		// charAt(i) ��� 
		for(int i = str2.length() - 1; i >= 0; i--) {
			System.out.print(str2.charAt(i) + " ");
		}
		System.out.println();
	
	// String Buffer
	/*
	 mutable : ���� ���Ѵ� -> �����ص� heap ������ ���ο� ���� �����Ǵ� ���� �ƴ϶�
	 ���� ����ü�� ���� ����ȴ�. 
	 	
	 */
		StringBuffer sb = new StringBuffer("Hi ~");
		
		sb.append("�ȳ��ϼ���"); 
		System.out.println(sb); 
		System.out.println(":hashcode : " + sb.hashCode());
		// �ؽ��ڵ尡 ������ ���� �ּҰ��� ����Ų��.
		
		// �޼��� ü��
		// method chaining -> �޼���.�޼���.�޼��� �̷������� �����ϴ� �� ���Ѵ�.
		
		sb.append("����").append("�ڹ� �Դϴ�");
		System.out.println(sb);
		System.out.println(":hashCode -> " + sb.hashCode());
		
		// String = immutable : �Һ� ��ü
		// -> ������ ��Ʈ�� Ǯ�� literal�� ����
		// -> ���� �Ŀ� hashcode �ּҰ��� ����
		
		String ss = "�ȳ��ϼ���";
		System.out.println(ss);
		System.out.println(ss.hashCode());
		
		ss += "��";
		System.out.println(ss.hashCode());
		
		System.out.println(ss);
		
		ss = ss.replace("�ȳ��ϼ��䰡", "����!");
		System.out.println(ss);
		
	}
}
