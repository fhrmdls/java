package day4;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class My implements ActionListener {

	static JButton b1;
	static JButton b2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 그래픽 프로그램2");
		f.setSize(500, 600);

		JLabel l = new JLabel("크리스마스트리");
		JLabel l2 = new JLabel("크리스마스 파티 계획이 있으신가요?");
		JLabel img = new JLabel();
		ImageIcon icon = new ImageIcon("tree.jpg");
		b1 = new JButton("YES");
		b2 = new JButton("NO");

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		img.setIcon(icon);
		f.add(l);
		f.add(img);
		f.add(l2);
		f.add(b1);
		f.add(b2);

		My m = new My();
		b1.addActionListener(m);
		b2.addActionListener(m);

		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			System.out.println("부럽군요");
		}
		if (e.getSource() == b2) {
			System.out.println("안타깝군요");
		}
	}

}
