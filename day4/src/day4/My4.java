package day4;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class My4 implements ActionListener {

	static JLabel me;
	static JButton b1, b2, b3, b4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 메인 프로그램");
		f.setSize(100, 300);
		f.setLocation(800, 400);

		me = new JLabel("4일차");

		b1 = new JButton("나의계산기");
		b1.setForeground(Color.DARK_GRAY);
		b1.setBackground(Color.pink);

		b2 = new JButton("나의이미지");
		b2.setForeground(Color.DARK_GRAY);
		b2.setBackground(Color.pink);

		b3 = new JButton("이미지 변신");
		b3.setForeground(Color.DARK_GRAY);
		b3.setBackground(Color.pink);

		b4 = new JButton("가위바위보 게임");
		b4.setForeground(Color.DARK_GRAY);
		b4.setBackground(Color.pink);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		f.add(me);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		My4 main = new My4();
		b1.addActionListener(main);
		b2.addActionListener(main);
		b3.addActionListener(main);
		b4.addActionListener(main);

		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {
			My3 m = new My3();
		}
		if (e.getSource() == b2) {
			My2 pic = new My2();
		}
		if (e.getSource() == b3) {
			My img = new My();
		}

		if (e.getSource() == b3) {
			// MY5 game = new MY5();
		}

	}

}
