package mvcexample;


// 3�ܰ� ��Ʈ�ѷ�

public class StudentController {
	
	private StudentVO model;// ��
	private StudentView view;// ��

	// ������
	
	public StudentController() {}
	
	public StudentController(StudentVO model , StudentView view) {
		this.model = model;
		this.view = view;
	}
	
	// getter , setter : ���� �����͸� get , set
	
	// �� - ��Ʈ�ѷ� ���� 
	public void setStudentName(String name) {
		model.setName(name);
	}
	
	public String getStudentName() {
		return model.getName();
	}
	
	public void setStduentRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}
	
	public String getStduentRollNo() {
		return model.getRollNo();
	}
	
	// �� �� ��Ʈ�ѷ� ���� 
	public void updateView() { // �並 ������Ʈ
		view.printStudentDetails(model.getName(), model.getRollNo());
	}
}
