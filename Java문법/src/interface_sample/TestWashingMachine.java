package interface_sample;


// �������̽� �׽�Ʈ
public class TestWashingMachine {
	
	public static void main(String[] args) {
		
		LGWashingMachine washineMachine = new LGWashingMachine();
		washineMachine.startButtonPressed();
		System.out.println("��Ź���� �ӵ��� " + washineMachine.changeSpeed(3));
	
		System.out.println(washineMachine.stopButtionPressed());
		
	}
}
