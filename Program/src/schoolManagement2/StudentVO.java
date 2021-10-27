package schoolManagement2;

public class StudentVO extends Teacher {
	
	private String stuName;
	private int stuNum;
	
	public StudentVO() {}
	public StudentVO(String stuName, int stuNum) {
		super();
		this.stuName = stuName;
		this.stuNum = stuNum;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getStuNum() {
		return stuNum;
	}

	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
}
