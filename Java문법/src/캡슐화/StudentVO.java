package Ä¸½¶È­;

public class StudentVO {
	
	private String name;
	private String studNo;
	private String gender;
	
	public StudentVO(){}
	
	public StudentVO(String name, String studNo, String gender) {
		super();
		this.name = name;
		this.studNo = studNo;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudNo() {
		return studNo;
	}

	public void setStudNo(String studNo) {
		this.studNo = studNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", studNo=" + studNo + ", gender=" + gender + "]";
	}
}
