package controller;

import java.util.List;
import java.util.Scanner;

import com.dto.DTO;

import dao.DAO;

// 요청이 들어오면 해당하는 페이지를 응답한다.
// 여기서는 view를 따로 작성하지 않고 컨트롤러 에서 Consol 출력

public class Controller {
	
	private static Scanner sc = new Scanner(System.in);
	private static DAO dao = new DAO();
	
	public static int getMenu() {	
		StringBuffer sb = new StringBuffer();
		int select = 0;
		
		sb.append("1. 전체 출력 \n");
		sb.append("2. 선택 출력 \n");
		sb.append("3. 추	가 \n");
		sb.append("4. 수 정 \n");
		sb.append("5. 삭	제 \n");
		sb.append("6. 종 료 \n");
		
		System.out.println(sb);
		System.out.println("번호 선택 : ");
		select = sc.nextInt();
		
		return select;
	}
	
	public static void main(String[] args) {
		
		int no = 0;
		
		do {
			no = getMenu();
			switch(no) {
			
			case 1:
				System.out.println("전체 출력");
				selectList();
				break;
			case 2:
				System.out.println("선택 출력");
				selectOne();
			}
		} while(no != 6);
	}
	
	// 컨트롤러 ?  dao클래스 와 연결시킴 
	private static void selectList() {
		List<DTO> list = dao.selectList();
		
		for(DTO dto : list) {
			System.out.println(dto);
		}
	}
	
	public static void selectOne() {
		System.out.println("출력할 넘버 입력 : ");
		int num = sc.nextInt();
		
		DTO dto = dao.selectOne(num);
		System.out.println(dto);
	}
	
	public static void insert() {
		System.out.println("추가할 데이터 입력(숫자,입력,별명)");
		int num = sc.nextInt();
		String name = sc.next();
		String nickname = sc.next();
		
		DTO dto = new DTO(num,name,nickname);
		
		if(dao.insert(dto) >0) {
			System.out.println("insert 성공!");
		} else {
			System.out.println("insert 실패!");
		}
	}
	
	public static void update() {
		System.out.println("몇번 데이터를 수정 ? : ");
		int num = sc.nextInt();
		
		System.out.println("수정할 ~ (이름,별명) : ");
		String name = sc.next();
		String nickname = sc.next();
		
		DTO dto = new DTO(num,name,nickname);
		if(dao.update(dto) > 0) {
			System.out.println("update 성공");
		} else {
			System.out.println("update 실패");
		}
	}
	
	public static void delete() {
		System.out.println("몇번 데이터를 삭제 ? ");
		int num = sc.nextInt();
		
		if(dao.delete(num) > 0) {
			System.out.println("delete 성공!");
		} else {
			System.out.println("delete 실패!");
		}
	}
}
