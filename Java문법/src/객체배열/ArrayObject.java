package 객체배열;

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
		return " 이름 : " + this.name +" 나이 : " + this.age;
	}
	
	
}
public class ArrayObject {
	
	public static void main(String[] args) {
		
		List<Employee> employee = new ArrayList<Employee>();
		
		employee.add(new Employee("박범",28));
		employee.add(new Employee("김지영",31));
		employee.add(new Employee("김철중",32));
	
		for(Employee e : employee) {
			System.out.println(e);
		}
		
		// 스트림으로 출력 foreach(람다식)
		Stream<Employee> stream = employee.stream();
		stream.forEach(s -> System.out.println("이름 : " + s.getName() 
		+ "나이 : " + s.getAge()));
	
		
		
	
	
	
	
	
	}
}
