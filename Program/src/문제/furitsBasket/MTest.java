package 문제.furitsBasket;

public class MTest {
	
	public static void main(String[] args) {
		
		FruitBasket bananaBasket = new FruitBasket();
		bananaBasket.setting("바나나", 20);
		
		bananaBasket.size = 100; // static 접근
		System.out.println(bananaBasket.size); // 100
		
		// fruitCount는 non-static 이기 떄문에 객체 하나에만 영향을 미침
		
		bananaBasket.fruitCount = 100;
		System.out.println(bananaBasket.fruitCount); // 100
		
		FruitBasket appleBasket = new FruitBasket();
		
		appleBasket.setting("사과", 30);
		System.out.println(appleBasket.size); // 130
		System.out.println(appleBasket.fruitCount); // 0
		
	
	}
}
