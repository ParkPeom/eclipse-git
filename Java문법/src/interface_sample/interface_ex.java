package interface_sample;

public interface interface_ex {
	
	final static int num = 5;

	public void ex();
	
	default void num() {
		System.out.println("default Interface");
	}
}
