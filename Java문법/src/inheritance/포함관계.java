package inheritance;

class Point {
	int x;
	int y;
}

// ���԰��� - Ŭ�����ȿ� �Ǵٸ� Ŭ������ �����ϴ� �� 
class triangle {
	Point p = new Point();
	int r;
	triangle() {
		p.x = 20;
		p.y = 10;
		this.r = 20;
		System.out.println("x : " + p.x +" y : "+ p.y +" r : "+ this.r);
	}
}

class Square {
	Point p = new Point();
	int z;
	int y;
	
	Square() {
		p.x = 20;
		p.y = 20;
		this.z = 20;
		this.y = 20;
	}

	@Override
	public String toString() {
		return " p=" + p + ", z=" + z + ", y=" + y + "]";
	}
}
public class ���԰��� {
	public static void main(String[] args) {
		triangle tri = new triangle();
		System.out.println(tri.toString());
		
		Square squ = new Square();
		System.out.println(squ);
	}
}
