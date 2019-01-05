package day4;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Game2 implements ActionListener{

    JButton s, r, p;
    JFrame f;
    
    public Game2() {
        f = new JFrame();
        f.setTitle("���� ���� ���� �� ����.");
        f.setSize(500, 1200);
        
        s = new JButton();
        r = new JButton();
        p = new JButton();
        
        ImageIcon icon1 = new ImageIcon("a13.png");
        ImageIcon icon2 = new ImageIcon("a12.png");
        ImageIcon icon3 = new ImageIcon("a11.png");
        
        s.setIcon(icon1);
        r.setIcon(icon2);
        p.setIcon(icon3);
        
        FlowLayout flow = new FlowLayout();
        f.setLayout(flow);
        
        f.add(s);
        f.add(r);
        f.add(p);
        
        //Game2 game = new Game2();
        s.addActionListener(this);
        
        r.addActionListener(this);
        
        p.addActionListener(this);
        
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        Game2 game = new Game2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random random = new Random();
        int computer = random.nextInt(3);
        
        if(e.getSource() == s) {//���� ����
            if(computer == 0) { //���ǻ�Ͱ� ����
                f.setTitle("�����.");
            }
            if(computer == 1) { // ��ǻ�Ͱ� ����
                f.setTitle("��ǻ�Ͱ� �¸�");
            }
            if(computer == 2) { //���ǻ�Ͱ� ��
                f.setTitle("���� �¸�");
            }
        }
        if(e.getSource() == r) {//���� ����
        	if(computer == 0) { //���ǻ�Ͱ� ����
        		f.setTitle("�����.");
        	}
        	if(computer == 1) { // ��ǻ�Ͱ� ����
        		f.setTitle("��ǻ�Ͱ� �¸�");
        	}
        	if(computer == 2) { //���ǻ�Ͱ� ��
        		f.setTitle("���� �¸�");
        	}
        }
        if(e.getSource() == p) {//���� ����
        	if(computer == 0) { //���ǻ�Ͱ� ����
        		f.setTitle("�����.");
        	}
        	if(computer == 1) { // ��ǻ�Ͱ� ����
        		f.setTitle("��ǻ�Ͱ� �¸�");
        	}
        	if(computer == 2) { //���ǻ�Ͱ� ��
        		f.setTitle("���� �¸�");
        	}
        }
        

        
    }

}