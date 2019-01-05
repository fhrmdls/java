package day4;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class My5 implements ActionListener {

	static JButton s, r, p;
	static JFrame f;

	public static void main(String[] args) {
		f = new JFrame();
		f.setTitle("∞°¿ßπŸ¿ß∫∏");
		f.setSize(500, 500);

		s = new JButton();
		r = new JButton();
		p = new JButton();

		ImageIcon icon1 = new ImageIcon("a11.PNG");
		ImageIcon icon2 = new ImageIcon("a12.PNG");
		ImageIcon icon3 = new ImageIcon("a13.PNG");

		p.setIcon(icon1);
		r.setIcon(icon2);
		s.setIcon(icon3);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		f.add(s);
		f.add(r);
		f.add(p);

		My5 game = new My5();
		s.addActionListener(game);
		r.addActionListener(game);
		p.addActionListener(game);

		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Random random = new Random();
		int computer = random.nextInt(3);

		{
			if (e.getSource() == p);
			
			if (computer == 0);
			f.setTitle("∫Ò∞Â¿Ω");
			if (computer == 1);
			f.setTitle("¡≥¥Ÿ..");
			if (computer == 2);
			f.setTitle("¿Ã∞Â¥Ÿ");			
		}
		
		{
			if (e.getSource() == r);
		
			if (computer == 0);
			f.setTitle("∫Ò∞Â¿Ω");
			if (computer == 1);
			f.setTitle("¡≥¥Ÿ..");
			if (computer == 2);
			f.setTitle("¿Ã∞Â¥Ÿ");
		}
		
		{
			if (e.getSource() == s);
			if (computer == 0);
			f.setTitle("∫Ò∞Â¿Ω");
			if (computer == 1);
			f.setTitle("¡≥¥Ÿ..");
			if (computer == 2);
			f.setTitle("¿Ã∞Â¥Ÿ");
		}

	}
}