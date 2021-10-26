package inheritance;

import java.util.ArrayList;

public class Test5 {
	String name;
	String job;
	int age;

	public Test5() {
		this("���","������",28); // ����Ŭ���� �� ������ ȣ��
	}
	
	public Test5(String name, String job, int age) {
		super();
		this.name = name;
		this.job = job;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Test5 [name=" + name + ", job=" + job + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Test5 p1 = new Test5();
		System.out.println(p1);
		
	}
}	
class Student extends Test5 {
	String no;
	
	// ���ۻ����ڿ����� ����� �����ڸ� �����ؾ��Ѵ�
	Student(String name,String no, String job, int age) {
		super(name,job,age);
		this.no = no;
	}
	Student() {
		this("����","19212","�л�",17);
	}
	@Override
	public String toString() {
		return "Student [no=" + no + "]";
	}
	class Researcher extends Student {
		Researcher(String name, String job, int age) {
			
		}
	}
}



