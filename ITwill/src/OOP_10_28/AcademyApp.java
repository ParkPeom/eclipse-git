package OOP_10_28;

/*
    Person <-  Instructor  ,  Student  ,  Staff   	
 	�θ� �ϳ� �ڽ� ������ 
  	����� �Ӽ��� ��� - Person Ŭ���� 
  	���ο� Ŭ������ ������ ������ְ� �ߺ��� �ڵ� �ּ�ȭ - �������� ��
 */

public class AcademyApp {
	public static void main(String[] args) {
		
		// �л� ������ �����ϱ� ���� ��ҵ��� �����ϴ� �迭 ���� 
		/*
		AcademyStudent[] student = new AcademyStudent[300];
		
		// ���� ������ �����ϱ� ���� ��ҵ��� �����ϴ� �迭 ����
		AcademyInstructor[] instructors = new AcademyInstructor[50]; 
	
		// ���� ������ �����ϱ� ���� ��ҵ��� �����ϴ� �迭 ���� 
		AcademyStaff[] staffs = new AcademyStaff[100];
		*/
		
		// �п� �����ڿ�����(�л�,����,����)�� �����ϱ� ���� ��ҵ��� �����ϴ� �迭 ���� 
		
		AcademyPerson[] persons = new AcademyPerson[5];
		
		// �θ�� ���������� �����ϸ� ��� �ڽ��� �����ų���ִ�.
		
		// �θ� Ŭ������ ������ �迭�� ��ҿ� �ڽ� Ŭ������ �����ڷ� �ν��Ͻ��� �����Ͽ� ����
		// => �ڽ� Ŭ������ �����ڸ� �̿��ϸ� ��Ӱ����� �θ� �ν��Ͻ��� �ڽ��ν��Ͱ� �����ȴ�.
		// => �迭�� ��ҿ��� �θ� �ν��Ͻ��� ����Ǿ� ����
		// => ��ü ����ȯ�� �̿��ϸ� �ڽ� �ν��Ͻ� ���� ���� 
		
		persons[0] = new AcademyStudent("1000", "�ڹ�", "����");
		persons[1] = new AcademyInstructor("2000","�ѹ̳�","�� ������ ����");
		persons[2] = new AcademyStaff("3000","�豺","����������");
		persons[3] = new AcademyStudent("4000", "ȫ�浿", "�� ������ ����");
		persons[4] = new AcademyStaff("5000","����","�濵ȸ����");
		
		for(AcademyPerson person : persons) {
			// �ڽ��� ������ ������ 
			// �������̵� ������� ���� �޼���� ������ ��ü ����ȯ �� �ڽ� �ν��Ͻ��� �޼��� ȣ��
			// => ��� ���谡 �ƴ� Ŭ������ ������ ��ü ����ȯ�� �� ��� ClassCastException �߻�
			// => �θ� ���������� ����� �θ� �ν��Ͻ��� ��Ӱ����� �ڽ� Ŭ������ Ȯ���Ͽ� ����ȯ
			// instanceof : Ŭ������ ��Ӱ��踦 �����ϱ� ���� ������ 
			// ���� ) 		�θ��������� instanceof �ڽ�Ŭ���� 
			// => ���������� ���� ������ �ڽ� Ŭ������ ��� true�� �����Ѵ�. 
			if(person instanceof AcademyStudent) {
				System.out.print(person.getName());
				System.out.print(person.getNum());
				System.out.println(((AcademyStudent) person).getCourse());
			} else if(person instanceof AcademyInstructor) {
				System.out.print(person.getName());
				System.out.print(person.getNum());
				System.out.println(((AcademyInstructor) person).getSubject());
			} else if(person instanceof AcademyStaff) {
				System.out.print(person.getName());
				System.out.print(person.getNum());
				System.out.println(((AcademyStaff) person).getDepart());
			}
		}
	}
}