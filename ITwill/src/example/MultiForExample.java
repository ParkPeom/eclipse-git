package example;

public class MultiForExample {
	
	public static void main(String[] args) {
		//★★★★★     i=1  별=5      
		//★★★★      i=2  별=4     
		//★★★       i=3  별=3      
		//★★        i=4  별=2     
		//★         i=5  별=1      
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) { 
				System.out.print("★");
			}
		System.out.println();	
		}
		
		// 1 2 3 4 5 >> j 
		//★★★★★  i=1  흰별=0  검은별=5   
		//☆★★★★  i=2  흰별=1  검은별=4    
		//☆☆★★★  i=3  흰별=2  검은별=3
		//☆☆☆★★  i=4  흰별=3  검은별=2
		//☆☆☆☆★  i=5  흰별=4  검은별=1
		
		// 3 . 3 , 4 . 4 , 5 , 
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j >= i; j++) {
				System.out.print("☆");
			}
			for(int k = 5; k >= 0; k--) {
				System.out.print("★");
			}
		System.out.println("");	
		}
	}
}
