package OOP_10_26_다시만들기;

import OOP_10_26.Singleton;

public class SingleTonApp {
	
	public static void main(String[] args) {
		
		
		Singleton single1 = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		
		System.out.println(single1);
		System.out.println(single2);
		
		single1.display();
		single2.display();
		
	}
}
