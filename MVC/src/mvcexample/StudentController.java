package mvcexample;


// 3단계 컨트롤러

public class StudentController {
	
	private StudentVO model;// 모델
	private StudentView view;// 뷰

	// 생성자
	
	public StudentController() {}
	
	public StudentController(StudentVO model , StudentView view) {
		this.model = model;
		this.view = view;
	}
	
	// getter , setter : 모델의 데이터를 get , set
	
	// 모델 - 컨트롤러 연결 
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
	
	// 뷰 와 컨트롤러 연결 
	public void updateView() { // 뷰를 업데이트
		view.printStudentDetails(model.getName(), model.getRollNo());
	}
}
