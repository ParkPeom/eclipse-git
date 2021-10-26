package interface_sample;

import java.util.ArrayList;

public class Interface {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		Robot robot = new Robot();
		Baby baby = new Baby();
		Tiger tiger = new Tiger();
		
		ArrayList<InterfaceReview> arr = new ArrayList<InterfaceReview>();
		
		arr.add(dog);
		arr.add(robot);
		arr.add(baby);
		arr.add(tiger);
		
		for(int i = 0; i < arr.size(); i++ ) {
			arr.get(i).sound();
		}
	}
}
