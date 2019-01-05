package control;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		// switch문 
		// 입력받은 문자열(String)으로 메뉴판단

		// 키보드를 입력하는 Scanner라는 객체(부품)을 새로 생성함(외울 필요 없음)
		Scanner sc = new Scanner(System.in);

		System.out.println("스포츠를 고르세요");
		System.out.println("야구, 농구, e스포츠");
		System.out.println("===============");
		System.out.print("당신이 좋아하는 스포츠는 : ");
		
		// 스포츠를 문자로 입력하도록 함.
		String sports = sc.next();
		System.out.println("===============");
	
		switch (sports) {
		case "야구":
			System.out.println("야구장ㄱㄱ");
			break;
		case "농구":
			System.out.println("농구코트ㄱㄱ");
			break;
		case "e스포츠":
			System.out.println("PC방ㄱㄱ");
			break;
		default:
			System.out.println("이불 밖은 위험해");
			break;
		}

		sc.close();
	}
}
