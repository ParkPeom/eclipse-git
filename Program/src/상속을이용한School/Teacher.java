package ������̿���School;

/*
  �������� �ǹ��ϴ� Ŭ����
  School Ŭ������ ��ӹ��� �ڽ� Ŭ����
  ���ÿ� Student Ŭ������ ����ϴ� �θ� Ŭ���� 
 */

public class Teacher extends School {
	
	// ���� �л����� ��������
	
	public Teacher() {
		System.out.println("�� Ȯ�� ���α׷�");
	}
	
	public String getBan(String name) {
		return super.getBan(name) + "��";	
	}
}
