package oop.score;

/*
 �̸� : ���� : ���� : ���� : ���� :  ��� :  ��� :  
  
 */
public class MTest {
	
	MTest() {
	
	}
	public static void main(String[] args) {
		Score score = new Score("�ڹ�",100,23,75);
		
//		score.setName("�ڹ�");
//		score.setKor(58);
//		score.setEng(90);
//		score.setMath(17);
		score.getSum();
		score.getAvg();
		System.out.println(score);
	}
}
