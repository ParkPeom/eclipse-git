package inheritance;

class Animalland {
	
	Animalland(){
		
	}
	public void run() {
		System.out.println("걸을수있다.");
	}
	
	public void howl() {
		System.out.println("울수있다.");
	}
}

class Monky extends Animalland {
	
	Monky() {
		super();
	}
	
	public void run() {
		System.out.println("사람처럼 걸을수있다.");
	}
	public void howl() {
		System.out.println("사람처럼 올수있다");
	}
}

class People extends Monky {
	
	People() {
		super();
	}
	
	public void run() {
		System.out.println("사람이여서 걸을수있다.");
	}
}
public class Test {
	public static void main(String[] args) {
		// Animal이란 그릇에 담아 놨으니 Human에서 생성한 s
		// peak()이 존재하는지 안하는지 알 방법이 없기 때문이다.

		
		//-----------위에층 = new 아래범위까지
		
		Animalland ani = new Animalland();
		ani.run(); // 걸을수있다.
		ani.howl(); // 울수있다.
		
		Animalland ani2 = new Monky();
		ani2.run(); // 사람처럼 걸을수있다.
		ani2.howl(); // 사람처럼 울수있다.
		
		People p = new People();
		p.run(); // 사람이여서 걸을수있다.
		p.howl(); // 사람처럼 울수있다.
		
		Animalland p2 = new Monky();
		p2.howl(); // 울수있다. - Monky 까지 오버라이딩된 메서드가 호출된다. 
		
		Animalland p3 = new People();
		p3.run(); // 사람이여서 걸을수 있다.
		
	}
}
