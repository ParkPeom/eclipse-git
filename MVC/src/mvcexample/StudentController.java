package mvcexample;


// 3´Ü°è ÄÁÆ®·Ñ·¯

public class StudentController {
	
	private StudentVO model;// ¸ðµ¨
	private StudentView view;// ºä

	// »ý¼ºÀÚ
	
	public StudentController() {}
	
	public StudentController(StudentVO model , StudentView view) {
		this.model = model;
		this.view = view;
	}
	
	// getter , setter : ¸ðµ¨ÀÇ µ¥ÀÌÅÍ¸¦ get , set
	
	// ¸ðµ¨ - ÄÁÆ®·Ñ·¯ ¿¬°á 
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
	
	// ºä ¿Í ÄÁÆ®·Ñ·¯ ¿¬°á 
	public void updateView() { // ºä¸¦ ¾÷µ¥ÀÌÆ®
		view.printStudentDetails(model.getName(), model.getRollNo());
	}
}
