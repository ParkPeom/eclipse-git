package interface_sample;

public interface WashingMachine {
	// �������̽� - �ڵ� ������ ���� �޼��� ���� �ִ�.
	public boolean startButtonPressed();
	public void pauseButtonPressed();
	public boolean stopButtionPressed();
	public int changeSpeed(int speed);
	
}
