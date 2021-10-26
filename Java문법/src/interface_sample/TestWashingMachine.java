package interface_sample;


// 인터페이스 테스트
public class TestWashingMachine {
	
	public static void main(String[] args) {
		
		LGWashingMachine washineMachine = new LGWashingMachine();
		washineMachine.startButtonPressed();
		System.out.println("세탁기의 속도는 " + washineMachine.changeSpeed(3));
	
		System.out.println(washineMachine.stopButtionPressed());
		
	}
}
