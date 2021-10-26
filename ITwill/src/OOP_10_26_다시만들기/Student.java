package OOP_10_26_다시만들기;

public class Student {
	
	private int num;
	private String name;
	private int kor;
	private int eng;
	private int total;
	
	Student(){}
	
	public Student(int num, String name, int kor, int eng) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		total = kor + eng;
	}

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
		calcTot();
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		calcTot();
	}
	
	public void calcTot() {
		total = kor + eng;
	}
	
	// 출력
	public void print() {
		System.out.println(num +"[" + name +"]" +"의 성적 >>" 
		+ " 국어 " + kor +" 영어" + eng +" 총점 :" + total);
	}
}
