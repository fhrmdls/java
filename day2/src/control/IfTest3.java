package control;

import java.util.Scanner;


public class IfTest3 {

	public static void main(String[] args) {
		// ID/PW 입력여부 판단

		// 내 ID/PW는 lenassi15 // 15 임.
		String id = "lenassi15";
		int pw = 15;

		// 키보드를 입력하는 Scanner라는 객체(부품)을 새로 생성함(외울 필요 없음)
		Scanner sc = new Scanner(System.in);

		// ID를 입력하세요
		System.out.print("ID입력창 : ");

		// 키보드로 입력한 sc.next()라는 값을 input이라는 String(문자열)에 저장
		String idInput = sc.next();

		// 실행(ctrl+f11)한 후 console 창의 ID입력창에 입력한 ID를 출력
		System.out.println("당신의 아이디는 " + idInput + "입니다.");

		// PW를 입력하세요
		System.out.print("PW입력창 : ");
		// 키보드로 입력한 sc.nextInt()라는 값을 pwInput이라는 int(숫자)에 저장
		int pwInput = sc.nextInt();

		// pw입력창에 입력한 pw를 출력
		System.out.println("당신의 PW는 " + pwInput + "입니다.");

		// 키보드로 입력한 input들이 내 ID/PW랑 일치하는지 확인하는 조건문
		if (idInput.equals(id) && pwInput == pw) {
			System.out.println("정상적으로 로그인되었습니다.");
		} else {
			System.out.println("ID 또는 PW가 일치하지 않습니다.");
		}
		
		sc.close();
	}
}
