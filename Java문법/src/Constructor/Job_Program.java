package Constructor;

/*
 
 �̸�: -> �⺻
 ����: -> �⺻
 ����: -> �⺻ 
 ����: -> �л� 
 ����: -> ���ϴ»�� 
 */
class PersonInfo {
	String name;
	String job;
	int age;
	
	PersonInfo(String name,String job,int age) {
		this.name = name;
		this.job = job;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
class Student extends PersonInfo {
	int score;
	
	Student(String name,String job, int age, int score) {
		super(name,job,age);
		this.score = score;
	}
	
	public void print() {
		System.out.printf("�̸� : %s ���� : %s ���� : %d ���� : %d %n",name,job,age,score);
	}
}
class Reacher extends PersonInfo {
	int money;
	
	Reacher(String name,String job, int age, int money) {
		super(name,job,age);
		this.money = money;
	}
	public void print() {
		System.out.printf("�̸� : %s ���� : %s ���� : %d ���� : %d %n", name , job , age , money);
	}
}

public class Job_Program {
	public static void main(String[] args) {
		Student sone = new Student("����ö","�л�",17,97);
		Reacher reac = new Reacher("������","������",23,6500);
		
		sone.print();
		reac.print();
	}
}
