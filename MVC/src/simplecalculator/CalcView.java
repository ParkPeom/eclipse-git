package simplecalculator;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.*;

public class CalcView extends JFrame {
	
	public JTextField tf_su1 , tf_su2;
	public JComboBox<String> cb_oper;
	public JButton bt_calc;
	public JLabel la_result;
	JPanel panel;
	
	public CalcView() {
		setTitle("Simple Calculator");
		// 컴포넌트 초기화 및 설정
		tf_su1 = new JTextField(5); // 5 = 너비지정
		tf_su2 = new JTextField(5);
		cb_oper = new JComboBox();
		cb_oper.addItem("+");
		cb_oper.addItem("-");
		cb_oper.addItem("*");
		cb_oper.addItem("/");
		bt_calc = new JButton("계산");
		la_result = new JLabel();
		
		// 레이아웃
		setLayout(new FlowLayout());
		
		// 패널 추가 
		panel = new JPanel();
		panel.add(tf_su1);
		panel.add(cb_oper);
		panel.add(tf_su2);
		panel.add(bt_calc);
		add(panel);
		add(la_result);
		
		setBounds(300,200,300,120);
		setVisible(true);
		setResizable(false); // 프레임 재설정 x
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public void reset() {
		tf_su1.setText("");
		tf_su2.setText("");
	}
}
