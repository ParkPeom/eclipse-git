package simplecalculator;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/*
	뷰 : 계산기 폼
	모델 : 더하기 , 빼기 , 곱하기 ,나누기 기능
	컨트롤러 : 전체 프로그램 제어(main() 메서드 포함)
*/

public class CalcController implements ActionListener {
	CalcView view; // View 뷰 

public CalcController() {
	
	view = new CalcView(); 

	view.bt_calc.addActionListener(this);
	
	}	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == view.bt_calc) { // 계산 요청 하면
			String su1Str = view.tf_su1.getText();
			String su2Str = view.tf_su2.getText();
			String oper = view.cb_oper.getSelectedItem().toString();
		
			
		// 유효성 검사
			if(!su1Str.matches("[0-9]+") || !su2Str.matches("[\\d]+")) {
				view.la_result.setText("숫자만 입력 하세요");
				return;
			} else if(oper.equals("/")&&su2Str.equals("0")) {
				view.la_result.setText("0으로 나눌수 없습니다");
				return;
			}
			
		// 모델 객체 생성 
		Calculator calc = new
			Calculator(Integer.parseInt(su1Str),Integer.parseInt(su2Str),oper);
			
			String result = calc.getResultstr();
			
		
			view.la_result.setText(result);
			view.reset(); // 입력 숫자 초기화 메서드
		}
	}
	public static void main(String[] args) {
		new CalcController();
	}
}
