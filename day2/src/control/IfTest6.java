package control;

import java.util.Scanner;

public class IfTest6 {

	public static void main(String[] args) {
		// if else 문
		// 입력받은 번호로 메뉴판단

		// 키보드를 입력하는 Scanner라는 객체(부품)을 새로 생성함(외울 필요 없음)
		Scanner sc = new Scanner(System.in);

		System.out.println("메뉴를고르세요. ");
		System.out.println("1소주 2맥주 3와인");
		System.out.println("===============");
		System.out.print("당신의 주종은 : ");
		// 메뉴를 숫자로 입력하도록 함.
		int menu = sc.nextInt();
		System.out.println("===============");
		// 1입력하면 소주, 2입력하면 맥주, 3입력하면 와인, 나머지는 fail
		if (menu == 1) {
			System.out.println("소주를 고르셨군요.");
		} else if (menu == 2) {
			System.out.println("맥주를 고르셨군요.");
		} else if (menu == 3) {
			System.out.println("와인을 고르셨군요.");
		// 1,2,3 외의 모든 숫자를 입력했을 때 else
		} else {
			System.out.println("술을 고르셔야죠");
		}

		sc.close();
	}
}
