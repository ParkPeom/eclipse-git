package inheritance;

class Animal2 {
	
}

// 사람은 동물이다.
class Human extends Animal2 {
	
}


public class 다형성이해 {
	
	public static void main(String[] args) {
		
		
		            // 사람은 동물이다 O
		Animal2 ani = new Human();
		
					// 동물은 사람이다 x 
//		Human hu = new Animal12();
		
		
		
		
	}
}
