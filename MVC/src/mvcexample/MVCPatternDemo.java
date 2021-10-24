package mvcexample;

public class MVCPatternDemo {
	
	public static void main(String[] args) {
		
	// db���� �ҷ�����
	
	StudentVO model = retriveStudentFromDatabase();
	
	// �ֿܼ� ����ϱ� ���� �� ���
	StudentView view = new StudentView();
	// ������ ���� �� �� �並 �Ű������� �޾� ��Ʈ�ѷ� ��ü ����
	StudentController controller = new StudentController(model, view);
	
	// ��Ʈ�ѷ� �޼���� �� ���� ������Ʈ
	controller.updateView();
	// �� ������ ������Ʈ
	controller.setStudentName("John");
	controller.updateView();
	
   }
	
	private static StudentVO retriveStudentFromDatabase() {
		StudentVO student = new StudentVO();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
	
}
