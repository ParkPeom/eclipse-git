package OOP;

/*
  2021-10-25 
  
 */

public class Method {

	// 매개변수로 전달받은 정수값을 홀수와 짝수로 구분하여 결과값 반환
	// 홀수(false) 짝수(true)
	
	boolean isOddEven(int num) {
		if(num%2==0) return false;
		else return true;
	}
	
	// 변수에 저장된 값을 메서드 종료시 반환
	// => 메서드의 반환형과 같은 자료형의 값을 반환

	// return은 값을 하나만 반환할수있는데
	// 배열을 이용하면 값을 여러개 반환 할수있다.
	// 배열을 반환하는 메서드 - 배열의 해시코드가 반환됨
	int[] returnArray() {
		int[] array = {10,20,30,40,50};
		return array; // 참조변수에 저장된 배열의 해쉬코드 반환 - 배열반환 
		// return new int[]{10,20,30,40,50};
		// return {10,20,30,40,50} <- 에러 발생 
	
	}
	
	// 3개의 매개변수에 값을 전달받아 합계를 계산하여 반환하는 메서드
	int sumOne(int num1,int num2,int num3) {
		return num1 + num2 + num3;
	}
	
	// 매개변수로 배열을 전달받아 배열 요소 값의 합계를 계산하여 반환하는 메서드
	// 배열의 해시코드값을 전달받음 
	int sumTwo(int[] num) {
		int tot = 0;
		for(int temp : num) {
			tot += temp;
		}
		return tot;
	}
	
	// 매개변수 생략 기호(...)를 사용한 매개변수를 선언한 경우 값을 0개 이상 전달받아 배열형식으로 사용이 가능
	// 처리할때는 같은 데이터타입이므로 배열형식으로 처리할수 있다.
	int sumThree(int...num) {
		int tot = 0;
		for(int temp : num) {
			tot += temp;
		}
		return tot;
	}
	
	public static void main(String[] args) {
		Method method = new Method();
		boolean result = new Method().isOddEven(10);
		System.out.println(result);
		// if구문에 조건식 대신 논리값을 반환하는 메서드를 호출할수있다.
		// (이 방법을 가장 많이 쓴다.)
		if(method.isOddEven(11)) {
			System.out.println("매개변수는 짝수입니다.");
		} else {
			System.out.println("매개변수는 홀수입니다.");
		}
		System.out.println("======================");
		// 참조변수에 메서드의 반환값(배열의 해쉬코드) 저장
		int[] num = method.returnArray();
		System.out.println("반환된 요소값 >> " );
		
		for(int temp : num) {
			System.out.print(temp + " ");
		}
		
		System.out.println("======================");
		
		// 메서드의 매개변수가 값이 정상적으로 전달되지 않을 경우 에러가 발생
//		System.out.println("합계 = " + method.sumOne(10, 20, 30 , 40 , 50));
		System.out.println("합계 = " + method.sumOne(10, 20, 30));
		int[] numarray = {10,20,30};
		System.out.println("합계는 : " + method.sumTwo(numarray));
		System.out.println("합계는 : " + method.sumTwo(new int[] {10,20,30}));
		
		System.out.println("합계 = " + method.sumThree(numarray)); // 값을 전달하지 않아도 에러 X
		System.out.println("합계 = " + method.sumThree(10,20,30)); 
		System.out.println("합계 = " + method.sumThree(10)); 
		System.out.println("합계 = " + method.sumThree(10,20,30,40,50)); 
	}
}
