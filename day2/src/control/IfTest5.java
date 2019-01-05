package control;

import java.util.Scanner;

public class IfTest5 {

	public static void main(String[] args) {
		// 나이 계산
		// ctrl+f11로 태어난 년도 입력하면, 주류판매여부 판단

		// 키보드를 입력하는 Scanner라는 객체(부품)을 새로 생성함(외울 필요 없음)
		Scanner sc = new Scanner(System.in);

		System.out.print("태어난 연도 : ");
		int year = sc.nextInt();

		// 나이 = 2018 - 태어난년도 - 1
		int age = 2018 - year - 1;


		if (age >= 17) {
			System.out.println("주류판매가능");
		} else {
			System.out.println("주류판매불가");
		}

		sc.close();
	}
}
