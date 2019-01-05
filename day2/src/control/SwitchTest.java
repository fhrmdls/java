package control;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// switch문 (IfTest6과 기능 동일)
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

		switch (menu) {
		case 1:
			System.out.println("소주를 고르셨군요.");
			// case별로 break를 입력해야, 아래의 값들이 같이 출력되지 않음.
			break;
		case 2:
			System.out.println("맥주를 고르셨군요.");
			break;
		case 3:
			System.out.println("와인을 고르셨군요.");
			break;
			// case 1,2,3을 제외한 default 값일 경우(else와 같은 역할)
		default:
			System.out.println("술을 고르셔야죠");
			break;
		}

		sc.close();
	}
}
