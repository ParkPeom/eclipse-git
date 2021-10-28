package ��ü�迭;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Employee {
	
	private String name;
	private int age;
	
	public Employee(){}
	
	public Employee(String name, int age) {
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return " �̸� : " + this.name +" ���� : " + this.age;
	}
	
	
}
public class ArrayObject {
	
	public static void main(String[] args) {
		
		List<Employee> employee = new ArrayList<Employee>();
		
		employee.add(new Employee("�ڹ�",28));
		employee.add(new Employee("������",31));
		employee.add(new Employee("��ö��",32));
	
		for(Employee e : employee) {
			System.out.println(e);
		}
		
		// ��Ʈ������ ��� foreach(���ٽ�)
		Stream<Employee> stream = employee.stream();
		stream.forEach(s -> System.out.println("�̸� : " + s.getName() 
		+ "���� : " + s.getAge()));
	
		
		
	
	
	
	
	
	}
}
