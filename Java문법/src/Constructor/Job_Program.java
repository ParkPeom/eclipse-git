package Constructor;

/*
 
 이름: -> 기본
 직업: -> 기본
 나이: -> 기본 
 점수: -> 학생 
 연봉: -> 일하는사람 
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
		System.out.printf("이름 : %s 직업 : %s 나이 : %d 점수 : %d %n",name,job,age,score);
	}
}
class Reacher extends PersonInfo {
	int money;
	
	Reacher(String name,String job, int age, int money) {
		super(name,job,age);
		this.money = money;
	}
	public void print() {
		System.out.printf("이름 : %s 직업 : %s 나이 : %d 연봉 : %d %n", name , job , age , money);
	}
}

public class Job_Program {
	public static void main(String[] args) {
		Student sone = new Student("김종철","학생",17,97);
		Reacher reac = new Reacher("김지영","연구원",23,6500);
		
		sone.print();
		reac.print();
	}
}
