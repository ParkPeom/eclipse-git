package 메서드체이닝;

public class Dog {
	// 은닉화 : 다른클래스로부터 값에 접근을 못하게 함 
	private String name;
	private int age;
	private int leg;
	
	public Dog() {
	}
	
	public String getName() {
		return name;
	}
	
	// 반환을 자기 타입으로 받으면 
	public Dog setName(String name) {
		this.name = name;
		return this;
	}
	
	public int getAge() {
		return age;
	}
	
	public Dog setAge(int age) {
		this.age = age;
		return this;
	}
	
	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", leg=" + leg + "]";
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		// 자기자신으로 받은타입으로 메서드 체이닝을 할수있다. 
		d.setName("망치").setAge(18).setLeg(4);
		
		System.out.println(d.toString());
		
		new Dog().setName("망치").setAge(18).setLeg(4);
		
	}
}
