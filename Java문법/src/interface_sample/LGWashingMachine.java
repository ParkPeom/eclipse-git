package interface_sample;

/*
 LG��Ź�� �⺻������ �����ϴ� ����� �����Ѵ�.
 �׿� ���ǵ�� ���� ������ �Ѵ�.  
 �������̽��� ���߻���� �����ϴ�.
 �������̽��� (���� ������Ʈ) �� ��ƿ ���߿� ���� ȿ�����̴�.
 */
public class LGWashingMachine implements WashingMachine , dryCouse {

	boolean check = false;
	int rtnSpeed;
	
	@Override
	public boolean startButtonPressed() {
		check = true;
		if(check) {
			System.out.println("��Ź�� Ŵ");
		} 
		return check;
	}
	@Override
	public void pauseButtonPressed() {
		rtnSpeed =- 100;
	}

	@Override
	public boolean stopButtionPressed() {
		check = false;
		if(check) {
		} else {
			System.out.println("��Ź�� ��");
		}
		return check;
	}
	
	// ���߻�� 
	public void dry() {
		System.out.println("��Ź�Ⱑ �Ϸ�Ǿ� �����ϱ� �����Ͽ����ϴ�.");
	}
	
	@Override
	public int changeSpeed(int speed) {
		int rtnSpeed = 0;
		switch(speed) {
		case 1: 
			rtnSpeed = 20;
			break;
		case 2:
			rtnSpeed = 50;
			break;
		case 3: 
			rtnSpeed = 100;
			break;
		}
		return rtnSpeed;
	}
}
