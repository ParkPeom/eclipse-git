package ����.furitsBasket;

public class MTest {
	
	public static void main(String[] args) {
		
		FruitBasket bananaBasket = new FruitBasket();
		bananaBasket.setting("�ٳ���", 20);
		
		bananaBasket.size = 100; // static ����
		System.out.println(bananaBasket.size); // 100
		
		// fruitCount�� non-static �̱� ������ ��ü �ϳ����� ������ ��ħ
		
		bananaBasket.fruitCount = 100;
		System.out.println(bananaBasket.fruitCount); // 100
		
		FruitBasket appleBasket = new FruitBasket();
		
		appleBasket.setting("���", 30);
		System.out.println(appleBasket.size); // 130
		System.out.println(appleBasket.fruitCount); // 0
		
	
	}
}
