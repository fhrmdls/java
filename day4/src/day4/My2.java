package day4;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class My2 implements ActionListener {

	static JButton b1;
	static JButton b2;
	static JLabel img; 

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("���� �׷��� ���α׷�");
		f.setSize(500, 600);

		JLabel l = new JLabel("���� ������");
		JLabel l2 = new JLabel("��������� ���� ������");
		img = new JLabel();
		ImageIcon icon = new ImageIcon("dog.jpg");
		
		b1 = new JButton("�ٸ���������");
		b2 = new JButton("������������");

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		img.setIcon(icon);
		f.add(l);
		f.add(img);
		f.add(l2);
		f.add(b1);
		f.add(b2);

		My2 m = new My2();
		b1.addActionListener(m);
		b2.addActionListener(m);

		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			ImageIcon icon2 = new ImageIcon("dog2.jpg");
			img.setIcon(icon2);
		}
		if (e.getSource() == b2) {
			ImageIcon icon = new ImageIcon("dog.jpg");
			img.setIcon(icon);		
		
		}
	}

}
