package crud;

public class Person {
	
	private int num;
	private String name;
	private String age;
	
	public Person() {}
	
	public Person(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Person [num=" + this.getName() + ", name=" + this.getName() + ", age=" + this.getAge() + "]";
	}
	
}
