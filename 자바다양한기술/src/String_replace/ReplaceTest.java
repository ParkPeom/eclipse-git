package String_replace;
/*
  Replace �Լ��� �ڽ��� �ٲٰ���� ���ڷ� ���ڿ��� ġȯ�����ִ� ���
   �ַ� ������ �����Ҷ� ���� ���δ�.
    " " -> ""
    
    Replace�� Ư�����ڷε� ġȯ�� �Ǵµ� ���Ͽ� 
    ReplaceAll�� Ư�����ڷ� ġȯ�� ��ƴ�
    
    
 */
public class ReplaceTest {
	
	public static void main(String[] args) {
		
		String str = " ���ڿ��� ������ �ֽ��ϴ�.";
		
		String str2 = str.replace(" ", "");
		System.out.println(str2);

		String a = "����ȭ . ��õ�� . ȭ������ . ���ѻ��";
		a = a.replace(".", "/");
		System.out.println(a);
		
		// replaceAll �� ���ڿ� ��ü�� ġȯ�Ǵ� ���� Ȯ����
		
		// ReplaceFirst �ڽ��� �ٲٰ���� 
		// ���ڿ��� ó������ �ش�
		// �Ҷ��� ġȯ�����ִ� ����� �մϴ�.
		
	}
}
