package 타입캐스팅;

class People {
	
	int num(int num) {
		return num * 5;
	}
}

class Parent extends People {

	int num(int num) {
		return num * 3;
	}
	
	public void Parenting() {
		
	}
}

class Child extends Parent {
	
	int num(int num) {
		return num * 10;
	}
	
	public void Childing() {
		
	}
}
public class InheritTest {
	
	public static void main(String[] args) {
		People p = new People();
		System.out.println(p.num(5)); // 25
		
		People p2 = new Parent();
		System.out.println(p2.num(5)); // 15 (오버라이딩)
//		System.out.println(p2.Parenting()); 접근못함 
		
		Parent pr = (Parent)p2;
		System.out.println(pr.num(5)); //15 
		pr.Parenting();  // 이제야 접근이 가능함 
		
		Parent p3 = new Child();
		System.out.println(p3.num(5)); // 50 (오버라이딩) 
//		p3.childing() // 접근못함 
		Child c3 = (Child)p3;
		System.out.println(c3.num(5)); // 50 
		c3.Childing();
		
		People p4 = new Child();
		System.out.println(p4.num(5)); // 50
	}
}