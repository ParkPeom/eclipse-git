package ������̿���School;

/*
 �б��̸� , �б��� ��� , �л����� �̸��� �����Ե��� �̸��� ����ʵ�� ������ �ִ�.
 
  �л��� �̸����� �л��� ���� ���� return �ϴ� ����� ���� �޼��尡 �ִ�.
  �л��� �̸����� �л��� ����ϴ� �������� �̸��� �����ϴ� ����� ���� �޼��尡 �ִ�.
  
  
 */

public class School {
	
	public String schoolName = "Commin";
	public String schoolClass = "Middle school";
	
	// �� �л��� �̸� ������ �迭 
	private String[][] class_student_name = {
			{"commin1","commin2"}, // 1��
			{"commin3","commin4"}, // 2��
			{"commin4","commin5"} // 3��
		};
	// �� �� ���� - 1�����迭
	private String[] teacher_name = {
			"Micle Cherick" , // 1��
			"Brown Shole" , // 2��
			"Geary Gohy" , // 3��
			
		};
	
	public School() {
		System.out.println(schoolName + " " + schoolClass);
	}
	
	// �� ���� �л� - ������ �迭 
	public String getBan(String name) {
		for (int i = 0; i < class_student_name.length; i++) {
			for (int j = 0; j < class_student_name[i].length; j++) {
				
				if(class_student_name[i][j].equals(name)) {
					return (i + 1) + ""; // ��� 
				}
			}
		}
		return null; // ������ 
	}
	
	// ������ �̸� - ������ �迭  
	public String getTeacherName(String student_name) {
		for (int i = 0; i < class_student_name.length; i++) {
			for (int j = 0; j < class_student_name[i].length; j++) {
				
				if(class_student_name[i][j].equals(student_name)) {
					
					return teacher_name[i]; // ������ �̸� ȣ�� 
				}
			}
		}
		return null; // ������ 
	}
	
	// �� �� ģ���� �ҷ�����
	
	public String[] getFriends(String student_name) {
		for (int i = 0; i < class_student_name.length; i++) {
			for (int j = 0; j < class_student_name[i].length; j++) {
				
				if(class_student_name[i][j].equals(student_name)) {
					return class_student_name[j]; // ���� ģ���� ȣ��
				}
			}
		}
		return null;
	}
}

