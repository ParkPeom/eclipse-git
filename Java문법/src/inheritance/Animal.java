package inheritance;

public class Animal {
	
	public void action() {
		System.out.println("움직일수있다.");
	}
	
	public void howl() {
		System.out.println("울부짖을수있다.");
	}
	
	public static void line() {
		System.out.println("----------------");
	}

	public static void main(String[] args) {
//		Animal ani = new Animal();
//		ani.action();
//		ani.speak(); 접근 불가 
		
		// 반드시 조상타입의 객체로 자손인스턴스를 가리켜야함
		// 왜 ? 자식것을 먼저 참조해야 나중 캐스팅할때
		// 자식껄 참조할수 있으니까 !!!!!!!!!!!!!!!
		// 그래야 캐스팅 후에도 참조할수있다.
		Animal ani = new Mammal(); 
		Mammal mam = (Mammal)ani;
		mam.speak();

		Animal.line();
		Animal animal = new Animal();
		Mammal mammal = new Mammal();
		Human3 human3 = new Human3();
		
		animal.action(); // 움직일수있다.
		animal.howl(); // 울부짖을수있다.
		Animal.line();
		mammal.action();
		mammal.howl();
		Animal.line();
		human3.action();
		human3.speak();
		Animal.line();
		
		
		// 2. 다른 형에 메모리를 할당 시켜보기
		System.out.println("2. 다른 형에 메모리를 할당 시켜보기");
		Animal mamman2 = new Mammal();
		Mammal human2 = new Human3();
		
		mamman2.action(); // 동물답게 움직일수있다.
		mamman2.howl(); // 울부짖을수있다.
		
		human2.action(); // 두발로 움직일수있다.
		human2.howl(); // 울부짖을수있다.
		human2.speak(); // 말을 할수있다.
		
	}
}
class Mammal extends Animal {
	
	public void action() {
		System.out.println("동물답게 움직일수있다.");
	}
	
	public void speak() {
		System.out.println("정교하게 움직일 수 있다.");
	}
}

class Human3 extends Mammal {
	
	public void action() {
		System.out.println("두발로 움직일수 있다.");
	}
	
	public void speak() {
		System.out.println("말을 할수있다.");
	}
}
	
	

