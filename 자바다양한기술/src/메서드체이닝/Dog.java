package �޼���ü�̴�;

public class Dog {
	// ����ȭ : �ٸ�Ŭ�����κ��� ���� ������ ���ϰ� �� 
	private String name;
	private int age;
	private int leg;
	
	public Dog() {
	}
	
	public String getName() {
		return name;
	}
	
	// ��ȯ�� �ڱ� Ÿ������ ������ 
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
		// �ڱ��ڽ����� ����Ÿ������ �޼��� ü�̴��� �Ҽ��ִ�. 
		d.setName("��ġ").setAge(18).setLeg(4);
		
		System.out.println(d.toString());
		
		new Dog().setName("��ġ").setAge(18).setLeg(4);
		
	}
}
