package OOP_10_26_다시만들기;

public class Student {
	
	private int num;
	private String name;
	private int kor,eng,tot;
	
	
	private static int total;

	public Student() {}

	public Student(int num, String name, int kor, int eng) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	
	
		//총점을 계산하여 필드에 저장하는 명령 작성 - 메소드 호출
		// => 코드의 중복을 최소화 하여 유지보수의 효율성 증가
		//tot=kor+eng;
		calcTot(); // 객체가 하나씩 생성될떄마다 이 메서드가 실행되면서
				   // 총합이 구해짐 
	
	}
	//인스턴스 메소드(Instance Method) : this 매개변수가 존재하는 메소드
	// => this를 이용하여 인스턴스 필드에 접근하여 사용 가능
	// => 정적 필드에 접근하여 사용 가능
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	// 각 점수 반환 
	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot; // 2
	}
	
	// 총점을 계산하여 필드에 저장하는 메서드
	// 인스턴스 생성시 더해짐  
	/*
	public void calcTot() {
		tot = kor + eng;
	}
	 */
	
	//은닉화 처리된 메서드  : 클래스 내부에서만 호출하여 사용하는 메서드 - 시스템 메서드
	private void calcTot() {
		tot = kor + eng; // 1
	}
	
	// 필드값을 출력하는 메서드
	public void display() {
		System.out.println(name +"[" + num + "]의 성적 >> ");
		System.out.println("국어 = " + kor + " 영어 = " + eng + " 총점 " + tot);
	}
	
	//정적 메소드(Static Method) : this 매개변수가 존재하지 않는 메소드
	// => this 매개변수가 없으므로 인스턴스 필드 접근 불가능
	// => 정적 필드는 접근하여 사용 가능
	// => 인스턴스와 상관없이 클래스를 이용하여 메소드 호출 가능
	
	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Student.total = total; // 정적변수에 값을 대입 
	}

}