package 문제.furitsBasket;
/*
 fruitCoint의 초기값은 5이다
 setting 메서드는 호출할 때 size 변수에 30을 대입한다
 setting 메서드의 String 파라미터는 과일의 이름을 받아서
 fruitName 변수에 대입하고 , int 변수의 과일의 갯수를 받아서
 fruitCount 변수에 더해서 대입하자(+=)
 
 basketPrn 메서드는 size와 fruitCount의 값을 비교해서
 size가 크거나 같으면 과일이름 + "의갯수는 "+갯수+"입니다."
 , 작으면 바구니가 꽉찼습니다.를 출력한다.
 */
public class FruitBasket {
	
	static int size;
	public int fruitCount = 5;
	private String fruitName;
	
	
	public void  setting(String fruitName , int size) {

		this.fruitName = fruitName;
		this.size += size; // 갯수를 받아서 대입한다.
		basketPrn();
	}
	
	public void basketPrn() {
		
		if(size >= fruitCount) {
			System.out.println(fruitName +"의 갯수는 " + 
				size +"입니다.");
		} else {
			System.out.println("바구니가 꽉찼습니다.");
		}
	}
}
