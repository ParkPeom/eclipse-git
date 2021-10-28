package Person;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		Student student1 = new Student("���缺",32,163,55,"1111048",3,4.1);
		Student student2 = new Student("������",35,173,57,"1312068",3,3.8);
		
		student1.show();
		student2.show();
		
		Teacher teacher = new Teacher("�̼���",38,171,55,"0000000",400,5);
		teacher.show();
		
		// �迭�� �̿��Ͽ� ��ü�� Ȯ���غ��� 
		
		Student[] students = new Student[100];
		
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student("ȫ�浿" +i+"����",20,175,80,i+"",1,4.5);
			students[i].show();
		}
		
		// Scanner �� ���� �Է��� �޾Ƽ� ��ü�� �ʱ�ȭ �Ͽ� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ����� �л��� �����մϱ�?(�迭��) : ");
		int number = sc.nextInt(); 
		
		
		for(int i = 0; i < number; i++) {
			String name; 
			int age;
			int height;
			int weight; 
			String studentID;
			int grade; 
			double gPA;
			
			System.out.print("�л��� �̸��� �Է��ϼ��� : ");
			name = sc.next();
			System.out.print("�л��� ���̸� �Է��ϼ��� : ");
			age = sc.nextInt();
			System.out.print("�л��� Ű�� �Է��ϼ��� : ");
			height = sc.nextInt();
			System.out.print("�л��� �����Ը� �Է��ϼ��� : ");
			weight = sc.nextInt();
			sc.nextLine();
			System.out.print("�л��� �й��� �Է��ϼ��� : ");
			studentID = sc.nextLine();
			System.out.print("�л��� �г��� �Է��ϼ��� : ");
			grade = sc.nextInt();
			System.out.print("�л��� ������ �Է��ϼ��� : ");
			gPA = sc.nextDouble();
			
			students[i] = new Student(name,age,height,weight,studentID,grade,gPA);
		}
		
		for(Student s : students) {
				s.show();
		}
		
	}
}
