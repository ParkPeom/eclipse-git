package OOP_10_26_�ٽø����;

public class StudentApp {
	public static void main(String[] args) {
		
		Student[] students = new Student[] {
				new Student(1000,"ȫ�浿",50,60) ,
				new Student(2000,"��浿",70,80) , 
				new Student(3000,"�ڱ浿",50,80) ,
				new Student(4000,"ȣ�浿",53,90)
		};
		
		
		// �ϰ�ó�� 
		/*
		for(int i = 0; i < students.length; i++ ) {
			students[i].display();
		}
		*/
		
		// ��� �л����� ������ ���ϱ�
		
		/*
		 //total+=student.getTot();//�л��� ������ ��ȯ�޾� ���� �հ� ������ ����
			
			//���� �ʵ�� Ŭ������ �̿��Ͽ� ���� ���� 
			// => ���� �ʵ��� ���� �����ڰ� private�� ��� ���� �Ұ���
			//Student.total += student.getTot(); 
		  
		 */
		for(Student student : students) {
			student.display();
			Student.setTotal(Student.getTotal() + student.getTot());
//			System.out.println("�� �հ� " + total);
		}
		System.out.println("���հ� = " + Student.getTotal());
	}
}
