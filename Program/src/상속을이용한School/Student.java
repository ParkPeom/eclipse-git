package ������̿���School;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* ���α׷� ����
 *�л� �ڽ��� �̸��� �Է��ϸ� �ڽ��� �ݰ� ���Ӽ����� �׸��� ���� ģ������� ��� Console
  ����̵ǰ� �ϴ� ���α׷�
 * 
 *�� Ȯ�� ���α׷�
 * ����� �̸��� ������ >> �ڹ�
 * ����� ���� :  1�ݴ��� �̸�
 * ����� �� :  1��  
 * ��ģ���� : {  1��ģ���� ���  } 
 * 
 �л��� �ǹ��ϴ� Ŭ����
 Teacher Ŭ������ ��ӹ��� �ڽ�Ŭ����
 ���θ޼��尡 �̰��� �����ϹǷ� ���α׷��� ������ Student Ŭ����
 �л��� �̸��� �Է¹޾� Console ȭ�鿡 ����� ��� 
  
 */
public class Student extends Teacher {
	
	private String name;
	public Student() throws IOException {
		super();
		start();
	}
	
	public void start() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("����� �̸��� ������ >> ");
		
		name = br.readLine();
		
		if(super.getBan(name) == null) {
			System.out.println("����� �츮 �б� �л��� �ƴմϴ�.");
			return; // ���� 
		}
		
		System.out.println("����� ���� : " + super.getTeacherName(name));
		System.out.println("����� �� : " + super.getBan(name));
		
		String[] friends = super.getFriends(name);
		System.out.print(" �� ģ���� : { ");
		for(int i = 0; i < friends.length; i++) {
			System.out.print(friends[i] + " ");
		}
		System.out.println("}");
	}
	
	public static void main(String[] args) throws IOException {
		new Student();
	}	
}
