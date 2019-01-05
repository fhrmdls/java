package control;

import javax.swing.JOptionPane;
//dialog 프로그램

public class MyWindow {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("당신의 이름을 입력해주세요");

//		System.out.println("입력한 이름은 : " + name);
		JOptionPane.showMessageDialog(null, name);

	}

}
