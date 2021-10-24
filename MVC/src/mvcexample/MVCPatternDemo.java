package mvcexample;

public class MVCPatternDemo {
	
	public static void main(String[] args) {
		
	// db정보 불러오기
	
	StudentVO model = retriveStudentFromDatabase();
	
	// 콘솔에 출력하기 위해 뷰 출력
	StudentView view = new StudentView();
	// 위에서 만든 모델 과 뷰를 매개변수로 받아 컨트롤러 객체 생성
	StudentController controller = new StudentController(model, view);
	
	// 컨트롤러 메서드로 뷰 내용 업데이트
	controller.updateView();
	// 모델 데이터 업데이트
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
