package ½ºÆ®¸²;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student {
	private String name;
	private int score;
	
	Student(){}
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public String getName() { return name; }
	 
    public void setName(String name) { this.name = name; }
		 
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
public class FromCollectionExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
			new Student("±èÃ¶Á¾",89),
			new Student("¹Ú¹ü",28),
			new Student("ÀÓ²©Á¤",84));		
		Stream<Student> stream = studentList.stream();
		stream.forEach(s -> System.out.println("ÀÌ¸§"));
	}
}
