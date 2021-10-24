package oop.score;

/*
 이름 : 국어 : 영어 : 수학 : 총점 :  평균 :  등급 :  
  
 */
public class MTest {
	
	MTest() {
	
	}
	public static void main(String[] args) {
		Score score = new Score("박범",100,23,75);
		
//		score.setName("박범");
//		score.setKor(58);
//		score.setEng(90);
//		score.setMath(17);
		score.getSum();
		score.getAvg();
		System.out.println(score);
	}
}
