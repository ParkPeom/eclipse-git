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
		// ������Ʈ �ʱ�ȭ �� ����
		tf_su1 = new JTextField(5); // 5 = �ʺ�����
		tf_su2 = new JTextField(5);
		cb_oper = new JComboBox();
		cb_oper.addItem("+");
		cb_oper.addItem("-");
		cb_oper.addItem("*");
		cb_oper.addItem("/");
		bt_calc = new JButton("���");
		la_result = new JLabel();
		
		// ���̾ƿ�
		setLayout(new FlowLayout());
		
		// �г� �߰� 
		panel = new JPanel();
		panel.add(tf_su1);
		panel.add(cb_oper);
		panel.add(tf_su2);
		panel.add(bt_calc);
		add(panel);
		add(la_result);
		
		setBounds(300,200,300,120);
		setVisible(true);
		setResizable(false); // ������ �缳�� x
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public void reset() {
		tf_su1.setText("");
		tf_su2.setText("");
	}
}
