package schoolManagement;


/*
 
 �б��̸� , �б��� ��� , �л����� �̸��� �����Ե��� �̸��� ����ʵ�� ������ �ִ�.
 �л��� �̸����� �л��� ���� ���� return �ϴ� ����� ���� �޼��尡 �ִ�.
 �л��� �̸����� �л��� ����ϴ� �������� �̸��� �����ϴ� ����� ���� �޼��尡 �ִ�.
 
 	i 1�� 2�� 3�� 
 	
*/
public class School {
	
	private String school_name1 = "Happy Scool";
	private String[][] school_name = {{"1��","����","������","����"},
									  {"2��","�Կ��","������"},
									  {"3��","������","�豺"}};
	private String[] teacher = {"Michlen" , "lose" , "Geary Gohy"};
	
	public School() {
		System.out.print(school_name1 + " ");
	}
	
	// ��
	public String getBan(String name) {
		
		for(int i = 0; i < school_name.length; i++) {
			for(int j = 0; j < school_name[i].length; j++) {
				if(school_name[i][j].equals(name)) {
					return  (i + 1) + "�� �Դϴ�.";
				}
			}
		}
		return "�׷� �л��� �����ϴ�"; // ������
	}
	
	// ������	
	public String getTeacher(String student_name) {
		for (int i = 0; i < school_name.length; i++) {
			for (int j = 0; j < school_name[i].length; j++) {
				
				if(school_name[i][j].equals(student_name)) {
					return "������ : " + teacher[i];
				}
			}
		}
		return null; // ������ 
	}
	
	// �л���
	public String[] getStudents(String student_name) {
		for (int i = 0; i < school_name.length; i++) {
			for (int j = 0; j < school_name[i].length; j++) {
				if(school_name[i][j].equals(student_name)) {
				     return school_name[i];
				}
			}
		}
		return null;
	}
}
