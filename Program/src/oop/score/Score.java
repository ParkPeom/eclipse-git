package oop.score;

public class Score {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Score(String name,int kor,int eng,int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
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
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	// 합계
	public int getSum() {
		return this.kor + this.eng + this.math;
	}
	
	public double getAvg() {
		return (this.kor + this.eng + this.math) / 3.0;
	}
	public String getGrade() {
		
		int average = (int)(getAvg());	
		switch(average / 10) {
		case 9 : case 8: return "A"; 
		case 7 : case 6: return "B";
		case 5 : case 4: return "C";
		default : return "F";
		}
	}
	@Override
	public String toString() {
		return "Score name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "합계 : "
				+ getSum() + " 평균 : "+ getAvg() + " 등급 : " + getGrade();
	}
	
	
}
