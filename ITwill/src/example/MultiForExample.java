package example;

public class MultiForExample {
	
	public static void main(String[] args) {
		//�ڡڡڡڡ�     i=1  ��=5      
		//�ڡڡڡ�      i=2  ��=4     
		//�ڡڡ�       i=3  ��=3      
		//�ڡ�        i=4  ��=2     
		//��         i=5  ��=1      
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) { 
				System.out.print("��");
			}
		System.out.println();	
		}
		
		// 1 2 3 4 5 >> j 
		//�ڡڡڡڡ�  i=1  ��=0  ������=5   
		//�١ڡڡڡ�  i=2  ��=1  ������=4    
		//�١١ڡڡ�  i=3  ��=2  ������=3
		//�١١١ڡ�  i=4  ��=3  ������=2
		//�١١١١�  i=5  ��=4  ������=1
		
		// 3 . 3 , 4 . 4 , 5 , 
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j >= i; j++) {
				System.out.print("��");
			}
			for(int k = 5; k >= 0; k--) {
				System.out.print("��");
			}
		System.out.println("");	
		}
	}
}
