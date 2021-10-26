package interface_sample;

public interface InterfaceReview {
	public void sound();
}

class Dog implements InterfaceReview {
	@Override
	public void sound() {
		System.out.println("∏€∏€");
	}
}

class Baby implements InterfaceReview {
	
	public void sound() {
		System.out.println("¿¿æ÷");
	}
}

class Tiger implements InterfaceReview {
	public void sound() {
		System.out.println("æÓ»Ô!");
	}
}

class Robot implements InterfaceReview {
	
	public void sound() {
		System.out.println("ªﬂ∫Ò∫Ò∫Ú");
	}
}

public class InterfaceReview {
	
	public static void main(String[] args) {
		
	}
}