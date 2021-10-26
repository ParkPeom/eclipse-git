package interface_sample;

/*
 LG세탁기 기본적으로 동작하는 기능을 구현한다.
 그외 스피드는 따로 재정의 한다.  
 인터페이스는 다중상속이 가능하다.
 인터페이스는 (공용 컴포넌트) 나 유틸 개발에 아주 효과적이다.
 */
public class LGWashingMachine implements WashingMachine , dryCouse {

	boolean check = false;
	int rtnSpeed;
	
	@Override
	public boolean startButtonPressed() {
		check = true;
		if(check) {
			System.out.println("세탁기 킴");
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
			System.out.println("세탁기 끔");
		}
		return check;
	}
	
	// 다중상속 
	public void dry() {
		System.out.println("세탁기가 완료되어 건조하기 시작하였습니다.");
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
