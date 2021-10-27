package OOP_10_27_���;
// �̺�Ʈ ���� ȸ������(���̵�,�̸�,�̸���)�� �����ϱ� ���� Ŭ����
// => ȸ�������� �����ϴ� Member Ŭ������ ��ӹ޾� �ۼ��ϴ� ���� ����
// �ڽ� Ŭ���� ����� extends Ű����� ���� Ŭ����(�θ� Ŭ����) - Super Class�� ��ӹ޾� ���ο� Ŭ����(�ڽ�Ŭ����) �ۼ�
// (�ڽ� Ŭ���� - Sub Class)�� �ۼ�
// => �ڽ� Ŭ�������� �θ� Ŭ������ �ʵ� �Ǵ� �޼��忡 �����Ͽ� ��� ���� - ��Ӽ�(Inheritance)
// => ���� ��Ӹ� ���� - �θ� Ŭ������ �ϳ��� ���� 
// 

public class MemberEvent extends Member {
	
	// �θ� Ŭ����(Member)�� ��ӹ޾� ��� �����ϹǷ� �ʵ� �̼��� 
	/*
	private String id;
	private String name;
	*/
	private String email;
	
	public MemberEvent(String id, String name, String email) {
		super();
		// �ڽ�Ŭ�������� �ʵ� �Ǵ� �޼��� ���� ���� : �ڽ� Ŭ���� ���� >> �θ� Ŭ���� ����
		// => �θ� Ŭ������ ����ȭ ����� �ʵ� �Ǵ� �޼���� ������ �Ұ���
		// this.id = id;
		this.setId(id); // �ڽ��� ������ �θ���� �����Ѵ�.
//		this.name = name;
		setName(name);
//		this.email = email;
		this.email = email;
	}
	/*
	public MemberEvent() {
		
	}
	
	public String getId() {
		return super.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	*/
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display() {
		System.out.println("���̵� = " + getId());
		System.out.println("�̸� = " + super.getName());
		System.out.println("�̸��� = " + email);
	}
}
