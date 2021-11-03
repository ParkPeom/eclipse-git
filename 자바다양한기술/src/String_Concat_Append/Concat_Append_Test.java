package String_Concat_Append;

/*
 Concat - ���ڿ��� ��ġ�� ���
 Concat�� ��ģ ���ڿ��� String���� �������ش�
 
  + �����ڴ� StringBuilder�� ��ȯ��Ų �ڿ�
  Append�� ���ڿ��� ���ϰ� �ٽ� toString()�Լ��� ���ڿ��� ��ȯ
  
 */
public class Concat_Append_Test {
	
	public static void main(String[] args) {
		
		// concat()
		// ��ģ ���ڿ��� �� �ٸ� ���ڿ��� ����������Ѵٴ�....
		// �ΰ��� ���ڿ��� ���Ҷ��� Concat�� ����ϴ°��� ����.
		String str = "ABCDE";
		String str2 = str.concat(str);
		System.out.println(str2);
		
		// append() 
		// ���� ���ڿ��� ������ 
		StringBuilder sb = new StringBuilder();
		sb.append("�ι�° �ؽ�Ʈ �Դϴ�");
		sb.append("����° �ؽ�Ʈ �Դϴ�");
		System.out.println(sb.toString());
	}
}
