package ����.furitsBasket;
/*
 fruitCoint�� �ʱⰪ�� 5�̴�
 setting �޼���� ȣ���� �� size ������ 30�� �����Ѵ�
 setting �޼����� String �Ķ���ʹ� ������ �̸��� �޾Ƽ�
 fruitName ������ �����ϰ� , int ������ ������ ������ �޾Ƽ�
 fruitCount ������ ���ؼ� ��������(+=)
 
 basketPrn �޼���� size�� fruitCount�� ���� ���ؼ�
 size�� ũ�ų� ������ �����̸� + "�ǰ����� "+����+"�Դϴ�."
 , ������ �ٱ��ϰ� ��á���ϴ�.�� ����Ѵ�.
 */
public class FruitBasket {
	
	static int size;
	public int fruitCount = 5;
	private String fruitName;
	
	
	public void  setting(String fruitName , int size) {

		this.fruitName = fruitName;
		this.size += size; // ������ �޾Ƽ� �����Ѵ�.
		basketPrn();
	}
	
	public void basketPrn() {
		
		if(size >= fruitCount) {
			System.out.println(fruitName +"�� ������ " + 
				size +"�Դϴ�.");
		} else {
			System.out.println("�ٱ��ϰ� ��á���ϴ�.");
		}
	}
}
