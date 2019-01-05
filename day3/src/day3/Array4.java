package day3;

import java.util.Scanner;
import java.util.concurrent.ForkJoinWorkerThread;

public class Array4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			
			System.out.print("점수 입력... ");
			num[i] = sc.nextInt();
		}
		
		for (int n : num) {
			System.out.println(n);
		}
		
		System.out.print("찾고 싶은 값 입력 >> ");
		int find = sc.nextInt();
		
		for (int i = 0; i < num.length; i++) {
			if(num[i] == find) {
			System.out.println("위치는" + i);
			}
		}
		
		int mini = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] < mini) {
				mini = num[i];
		}
	}
		System.out.println("최소값은 " + mini);

		
		int mum = num[0];
		for (int i = 0; i < num.length; i++) {
			if(num[i]> mum) {
				mum = num[i];
			}
		}
		System.out.println("최대값은" + mum);
		
		
		//극장예약시스템
		
		

	
}
}
