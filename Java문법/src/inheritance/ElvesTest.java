package inheritance;

public class ElvesTest {
	
	public static void main(String[] args) {
		// ��ü ����
		Elf elf = new Elf("Ƽ����",100);
		
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
		return String.format("[����] name : %s , HP : %d", name , hp);
	}
}

class HightElf extends Elf {

	// �� �θ��� �����ڵ� ȣ�� �� ������Ѵ�. 
	protected int mp;
	HightElf(String name, int hp , int mp) {
		super(name,hp);
		this.mp = mp;
	}
	
	public String toString() {
		return String.format("[����] name : %s , HP : %d , MP : %d", name , hp , mp);
	}
}

class ElfLord extends HightElf {
	protected int shield;
	
	ElfLord(String name, int hp , int mp , int shield) {
		super(name,hp,mp); // �θ��� �����ڴ� ȣ������� �Ѵ�.
		this.mp = mp;
		this.shield = shield;
	}
	public String toString() {
		return String.format("[����] name : %s , HP : %d , MP : %d , shield : %d", name , hp , mp , shield);
		}
	}
