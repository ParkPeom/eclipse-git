package OOP_10_26;

public class StudentApp {
	public static void main(String[] args) {
		/*
		Student student1=new Student(1000, "ȫ�浿", 90, 90);
		Student student2=new Student(2000, "�Ӳ���", 94, 88);
		Student student3=new Student(3000, "����ġ", 92, 80);
		Student student4=new Student(4000, "������", 76, 82);
		Student student5=new Student(5000, "����", 84, 86);
		
		//student1.calcTot();
		//student2.calcTot();
		//student3.calcTot();
		//student4.calcTot();
		//student5.calcTot();
		
		student1.display();
		student2.display();
		student3.display();
		student4.display();
		student5.display();
		System.out.println("=============================================================");
		student1.setKor(100);
		//student1.calcTot();
		student1.display();
		System.out.println("=============================================================");
		*/
		
		/*
		//�ν��Ͻ��� ������ �� �ִ� ������Ұ� 5���� �迭 ����
		// => �迭�� ��ҿ��� �⺻������ null ����
		Student[] students=new Student[5];
		
		//�迭 ��ҿ� �ν��Ͻ��� �����Ͽ� ���� - �ν��Ͻ� �迭 
		students[0]=new Student(1000, "ȫ�浿", 90, 90);
		students[1]=new Student(2000, "�Ӳ���", 94, 88);
		students[2]=new Student(3000, "����ġ", 92, 80);
		students[3]=new Student(4000, "������", 76, 82);
		students[4]=new Student(5000, "����", 84, 86);
		*/
		
		Student[] students=new Student[] {new Student(1000, "ȫ�浿", 90, 90)
				,new Student(2000, "�Ӳ���", 94, 88),new Student(3000, "����ġ", 92, 80)
				,new Student(4000, "������", 76, 82),new Student(5000, "����", 84, 86)};
		
		//�ϰ�ó���� �̿��Ͽ� �޼ҵ� ȣ��
		//for(int i=0;i<students.length;i++) {
		//	students[i].display();
		//}
		
		//int total=0;//��� �л����� ���� �հ踦 �����ϱ� ���� ����
		
		for(Student student:students) {
			student.display();
			//total+=student.getTot();//�л��� ������ ��ȯ�޾� ���� �հ� ������ ����
			
			//���� �ʵ�� Ŭ������ �̿��Ͽ� ���� ���� 
			// => ���� �ʵ��� ���� �����ڰ� private�� ��� ���� �Ұ���
			//Student.total+=student.getTot();
			
			//���� �޼ҵ�� Ŭ������ �̿��Ͽ� ȣ�� ����
			Student.setTotal(Student.getTotal()+student.getTot());
		}
		System.out.println("==============================================================");
		//System.out.println("���հ� = "+total);//��� �л����� ���� �հ� ���
		//System.out.println("���հ� = "+Student.total);
		System.out.println("���հ� = "+Student.getTotal());
		System.out.println("==============================================================");
	}
}












