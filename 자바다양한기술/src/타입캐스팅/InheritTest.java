package Ÿ��ĳ����;

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
		System.out.println(p2.num(5)); // 15 (�������̵�)
//		System.out.println(p2.Parenting()); ���ٸ��� 
		
		Parent pr = (Parent)p2;
		System.out.println(pr.num(5)); //15 
		pr.Parenting();  // ������ ������ ������ 
		
		Parent p3 = new Child();
		System.out.println(p3.num(5)); // 50 (�������̵�) 
//		p3.childing() // ���ٸ��� 
		Child c3 = (Child)p3;
		System.out.println(c3.num(5)); // 50 
		c3.Childing();
		
		People p4 = new Child();
		System.out.println(p4.num(5)); // 50
	}
}