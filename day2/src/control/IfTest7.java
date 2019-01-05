package control;

import java.util.Scanner;

public class IfTest7 {

	public static void main(String[] args) {
		// 두 수를 입력받아 누가 더 큰지 판별

		// 키보드를 입력하는 Scanner라는 객체(부품)을 새로 생성함(외울 필요 없음)
		Scanner sc = new Scanner(System.in);

		
		//숫자 a 입력하도록 함.
		System.out.print("숫자 a : ");
		int a = sc.nextInt();
		
		
		//숫자 b 입력하도록 함.
		System.out.print("숫자 b : ");
		int b = sc.nextInt();

		System.out.println("===============");

		if (a > b) {
			System.out.println("a가 더 큽니다.");
		} else if (a < b) {
			System.out.println("b가 더 큽니다.");
		} else {
			System.out.println("두 수가 같습니다.");
		}

		sc.close();
	}
}
