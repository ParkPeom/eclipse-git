package OOP_10_26;

import java.util.ArrayList;
import java.util.List;

// this : �޼��忡 ������ �ִ� �Ű�����(Ű����) - 
// => this �Ű������� �ڷ����� �޼��尡 ����� Ŭ���� 
// => �޼��带 ȣ���� �ν��Ͻ��� ����(�ؽ��ڵ�)�� �����ϱ� ���� ��������
// => �ν��Ͻ��� �޼��带 ȣ���� ��� ȣ�� �ν��Ͻ��� ������ �ڵ����� ���޹޾� �����Ѵ�.
// => this�� �־�� �ϴ� ������ �޼��忡�� �ν��Ͻ��ʵ� �Ǵ� �޼��忡 �����ϱ� ���� this�� ����Ѵ�.
// => this�� ǥ������ �ʾƵ� �ڵ����� �ν��Ͻ� �ʵ� �Ǵ� �޼��忡 ���� �Ҽ� �ִ�.

// �޼��忡 this �Ű������� �����ϴ� ����
// => �ʵ�� �ν��Ͻ� ���� �޸�(Heap)�� ���� ���������� �޼���� �ν��Ͻ��� ������� 
// �޸�(Static)�� �ϳ��� �����ȴ� - ������Ÿ�� Ŭ���� 
// => �޼��忡�� �ʵ忡 ������ ��� this�� �̿��Ͽ� �ν��Ͻ��� �����Ͽ� �ʵ忡 ���� �����ϵ��� this�� �ʿ��ϴ�

// this �Ű������� ����ϴ� ���
// 1. �ʵ��� �̸��� �޼����� �Ű����� �̸��� ���� ��� this�� �̿��Ͽ� �ʵ带 ǥ���Ҽ��ִ�.
// �Ű������� ���޵Ǵ� ���� ��Ȯ�ϰ� �˷��ֱ� ���ؼ� �ʵ����̸��� �Ȱ��� �Ѵ�.
// => this�� ������� ������ �Ű������� ó��
// => �Ű������� ���޵Ǿ� ����� ���� ��Ȯ�ϰ� ǥ���ϱ� ���� �Ű������� �̸��� �ʵ��� ���� �̸����� ����

// 2. �����ڿ��� �ٸ� �����ڸ� ȣ���ϱ� ���� this ��� �ʱ�ȭ�۾�
// => this�� �̿��Ͽ� �����ڸ� ȣ���ϴ� ������� �ٸ� ����� �ۼ��� ��� ���� 
// this()�� ������ �������ٰ� �־���� (�ؿ��� ������ �ȵǹǷ�)

// 3. �̺�Ʈ ó�� ���α׷� �Ǵ� ���� ������ ���α׷��� �޼��忡�� �ν��Ͻ��� ǥ���Ұ��
//  this �� ����. 




// ȸ������(���̵�,�̸�,�̸���)�� �����ϱ� ���� Ŭ����
// ���� �����ϴ� Ŭ���� = VOŬ����(Value Object) Ŭ����

public class MemberVO {
	
	// �ʵ�(Filed) ����
	// => �ν��Ͻ� ������ �ʵ忡 �⺻���� �ʱⰪ���� �ڵ� ����ȴ�.
	// ������:0,����:false,������:null
	
	// => �ν��Ͻ� ������ �ʵ忡 ����� �⺻�� ���浵 �����ϴ�. - ����� �ʱ�ȭ 
	private String id = "NoId"; 
	private String name = "NoName"; 
	private String email = "NoEmail";
	List<MemberVO> arr;
	
	{ 
		// �ν��Ͻ� �ʱ�ȭ �� (Ŭ������ �о�帱�� �۾��� �ϴ� ����) 
		id = "NOId";
	}
	
	// ������(Constructor) ����
	// => �����ڸ� �������� ������ �⺻�����ڰ� �ڵ� ����
	// => ������ �ۼ� ��Ģ : ��ȯ���� ������ �޼������ (�ݵ�� Ŭ������� ����) �ϰ� �ۼ�
	// => �����ε� ���� ���� : �Ű������� �ٸ� �����ڸ� ������ ���𰡴�
	// => �ʱ�ȭ �۾� ���� : �����ڸ� �̿��Ͽ� �ν��Ͻ� ������ �ʵ忡 ���ϴ� �ʱⰪ�� ����ǰ� �Ѵ�.
	
	// �Ű������� ���� �⺻ ������ 
	// => �Ϲ������� �ʱ�ȭ �۾� �̱��� - �ν��Ͻ� ������ �ʵ忡 �⺻���� �ʱⰪ���� ����
	// => �������� ���� ��� ��� ���� ������ �߻��� �� �����Ƿ� �����ϴ� ���� ���� �Ѵ�.
	// �Ű������� ���� ������ �ڵ� �ϼ� : ctrl + space >> ������ ����
	
	public MemberVO(){
		// Member(String id,String name, String email) �����ڸ� ȣ���Ͽ� �ʱ�ȭ �۾�
		this("NoId","NoName","NoEmail"); // �� ù�� 
		// this�� �̿��Ͽ� �ٸ� �����ڸ� ȣ���ϴ� ��찡 �ſ� ���� 
		arr = new ArrayList<MemberVO>();
	}
	
	// => �����ڸ� �����ϸ� �⺻�����ڰ� �������� �ʴ´�.
	
	// �Ű������� �ִ� ������ 
	// => �Ű������� ���޵� ���� �̿��Ͽ� �ʵ��� �ʱⰪ���� �������ش�.
	// => �ν��Ͻ� ������ �ʵ忡 ���ϴ� ���� �ʱⰪ���� ����ǵ��� �����ڸ� �ۼ��Ѵ�.
	// �Ű������� �ִ� ������ �ڵ� �ϼ� : Alt + Shift + S >> �˾��޴� >> [O] >> �ʵ� ���� >> Generate �ϼ� 
	
	public MemberVO(String id) {
		this.id = id;
	}
	
	public MemberVO(String email, String name) {
		super();
		this.email = email;
		this.name = name;
	}

	public MemberVO(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	// �޼���(Method) ���� - setter , getter �� �����. 
	public String getId() {
		return id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	// �ʵ尪�� ����ϴ� �޼��� >> �ʵ尪�� Ȯ��
	// �ڵ��� �ߺ����� �ּ�ȭ �Ѵ�.
	public void display() {
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.email);
	}
	
	public void display(List<MemberVO> arr) { // �������� �Ƚᵵ �޼��忡 ���� ������ ����
		for(MemberVO s : arr) {
			System.out.println(s);
		}
	}
}
