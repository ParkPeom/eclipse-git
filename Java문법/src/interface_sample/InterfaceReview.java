package interface_sample;

public interface InterfaceReview {
	public void sound();
}

class Dog implements InterfaceReview {
	@Override
	public void sound() {
		System.out.println("�۸�");
	}
}

class Baby implements InterfaceReview {
	
	public void sound() {
		System.out.println("����");
	}
}

class Tiger implements InterfaceReview {
	public void sound() {
		System.out.println("����!");
	}
}

class Robot implements InterfaceReview {
	
	public void sound() {
		System.out.println("�ߺ���");
	}
}

public class InterfaceReview {
	
	public static void main(String[] args) {
		
	}
}