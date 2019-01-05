package control;

import java.util.Date;

public class SwitchTest5 {

	public static void main(String[] args) {
		// switch문
		// 월을 가져와서 마지막이 몇일인지 구함(case를 묶어써서 한번에 break 연습)

		// 일자와 같은 정보를 담고 있는 객체(부품), 외울 필요 없음
		Date date = new Date();

		// 현재 월을 가져옴(해당 객체의 월이 0~11로 표현되어있어 1을 더해줘야함)
		int month = date.getMonth() + 1;
		// 월 출력
		System.out.println(month+"月");

		switch (month) {
		case 2:
			System.out.println("28일로 끝나는 달");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일로 끝나는 달");
			break;
		default:
			System.out.println("31일로 끝나는 달");
			break;
		}

	}
}
