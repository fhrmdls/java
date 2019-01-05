package day4;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class My3 implements ActionListener {

	static JLabel l1, l2, result;
	static JTextField t1, t2;
	static JButton plus, minus, mul, div;


	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의계산기");
		f.setSize(250, 300);

		l1 = new JLabel("숫자1>>");
		l2 = new JLabel("숫자2>>");
		result = new JLabel("x");
		Font font = new Font("궁서", Font.BOLD, 100);
		result.setFont(font);
		
		t1 = new JTextField(15);
		t2 = new JTextField(15);
		t1.setForeground(Color.DARK_GRAY);
		t1.setBackground(Color.pink);
		t2.setForeground(Color.DARK_GRAY);
		t2.setBackground(Color.pink);
		
		plus = new JButton("+");
		minus = new JButton("-");
		mul = new JButton("*");
		div = new JButton("/");
		
		plus.setForeground(Color.blue);
		plus.setBackground(Color.gray);
		minus.setForeground(Color.blue);
		minus.setBackground(Color.gray);
		mul.setForeground(Color.blue);
		mul.setBackground(Color.gray);
		div.setForeground(Color.blue);
		div.setBackground(Color.gray);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		
		f.add(plus);
		f.add(minus);
		f.add(mul);
		f.add(div);

		f.add(result);
		
		
		My3 m = new My3();
		plus.addActionListener(m);
		minus.addActionListener(m);
		mul.addActionListener(m);
		div.addActionListener(m);

		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String n1 = t1.getText();
		String n2 = t2.getText();
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);

		if (e.getSource() == plus) {
			//System.out.println("두수의 합은 " + (num1 + num2));
			result.setText(num1 + num2 + "");
		
		}

		if (e.getSource() == minus) {
			//System.out.println("두수의 차는 " + (num1 - num2));
			result.setText(num1 - num2 + "");
		}

		if (e.getSource() == mul) {
			//System.out.println("두수의 곱은 " + (num1 * num2));
			result.setText(num1 * num2 + "");
		}

		if (e.getSource() == div) {
			//System.out.println("두수의 나눗셈은 " + (num1 / num2));
			result.setText(num1 / num2 + "");
		}

	}

}
