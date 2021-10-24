package simplecalculator;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/*
	�� : ���� ��
	�� : ���ϱ� , ���� , ���ϱ� ,������ ���
	��Ʈ�ѷ� : ��ü ���α׷� ����(main() �޼��� ����)
*/

public class CalcController implements ActionListener {
	CalcView view; // View �� 

public CalcController() {
	
	view = new CalcView(); 

	view.bt_calc.addActionListener(this);
	
	}	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == view.bt_calc) { // ��� ��û �ϸ�
			String su1Str = view.tf_su1.getText();
			String su2Str = view.tf_su2.getText();
			String oper = view.cb_oper.getSelectedItem().toString();
		
			
		// ��ȿ�� �˻�
			if(!su1Str.matches("[0-9]+") || !su2Str.matches("[\\d]+")) {
				view.la_result.setText("���ڸ� �Է� �ϼ���");
				return;
			} else if(oper.equals("/")&&su2Str.equals("0")) {
				view.la_result.setText("0���� ������ �����ϴ�");
				return;
			}
			
		// �� ��ü ���� 
		Calculator calc = new
			Calculator(Integer.parseInt(su1Str),Integer.parseInt(su2Str),oper);
			
			String result = calc.getResultstr();
			
		
			view.la_result.setText(result);
			view.reset(); // �Է� ���� �ʱ�ȭ �޼���
		}
	}
	public static void main(String[] args) {
		new CalcController();
	}
}
