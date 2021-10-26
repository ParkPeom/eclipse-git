package interface_sample2;

public class DaoExample {
	
	// 인터페이스를 매개변수로 받아서
	// 상속한 자식들을 출력한다.
	
	public static void dbWork(DataAccessObject obj) {
		obj.search();
		obj.insert();
		obj.delete();
		obj.update();
		
	}
	
	public static void main(String[] args) {
		// 객체를 매개값으로 줌 
		// static 이면 바로 참조 가능 
		dbWork(new MySqlDao());
		dbWork(new OracleDao());
	
	}
}
