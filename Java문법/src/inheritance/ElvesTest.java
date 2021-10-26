package inheritance;

public class ElvesTest {
	
	public static void main(String[] args) {
		// 객체 생성
		Elf elf = new Elf("티란데",100);
		
	}
}


class Elf {
	protected String name;
	protected int hp;
	
	
	public Elf(String name,int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public String toString() {
		return String.format("[엘프] name : %s , HP : %d", name , hp);
	}
}

class HightElf extends Elf {

	// ★ 부모의 생성자도 호출 ★ 해줘야한다. 
	protected int mp;
	HightElf(String name, int hp , int mp) {
		super(name,hp);
		this.mp = mp;
	}
	
	public String toString() {
		return String.format("[엘프] name : %s , HP : %d , MP : %d", name , hp , mp);
	}
}

class ElfLord extends HightElf {
	protected int shield;
	
	ElfLord(String name, int hp , int mp , int shield) {
		super(name,hp,mp); // 부모의 생성자는 호출해줘야 한다.
		this.mp = mp;
		this.shield = shield;
	}
	public String toString() {
		return String.format("[엘프] name : %s , HP : %d , MP : %d , shield : %d", name , hp , mp , shield);
		}
	}
