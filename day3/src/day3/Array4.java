package day3;

import java.util.Scanner;
import java.util.concurrent.ForkJoinWorkerThread;

public class Array4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			
			System.out.print("���� �Է�... ");
			num[i] = sc.nextInt();
		}
		
		for (int n : num) {
			System.out.println(n);
		}
		
		System.out.print("ã�� ���� �� �Է� >> ");
		int find = sc.nextInt();
		
		for (int i = 0; i < num.length; i++) {
			if(num[i] == find) {
			System.out.println("��ġ��" + i);
			}
		}
		
		int mini = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] < mini) {
				mini = num[i];
		}
	}
		System.out.println("�ּҰ��� " + mini);

		
		int mum = num[0];
		for (int i = 0; i < num.length; i++) {
			if(num[i]> mum) {
				mum = num[i];
			}
		}
		System.out.println("�ִ밪��" + mum);
		
		
		//���忹��ý���
		
		

	
}
}
