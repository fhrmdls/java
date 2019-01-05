package control;

import java.util.Date;

public class SwitchTest3 {

	public static void main(String[] args) {
		// switch문
		//일자를 가져와서 요일을 출력함

		// 일자와 같은 정보를 담고 있는 객체(부품), 외울 필요 없음
		Date date = new Date();

		// 시각을 가져옴(취소선 - 오래된 부품일 경우..사용해도 문제는 없음)
		int hour = date.getHours();
		// 분을 가져옴
		int min = date.getMinutes();
		// 초를 가져옴
		int sec = date.getSeconds();
		// 시:분:초 출력
		System.out.println(hour + ":" + min + ":" + sec);

		// 월을 가져옴(해당 객체의 월이 0~11로 표현되어있어 1을 더해줘야함)
		int month = date.getMonth() + 1;
		// 월 출력
		System.out.println(month+"月");

		// 요일을 가져옴
		int day = date.getDay();
		
		

		switch (day) {
		case 1:
			System.out.println("월");
			break;
		case 2:
			System.out.println("화");
			break;
		case 3:
			System.out.println("수");
			break;
		case 4:
			System.out.println("목");
			break;
		case 5:
			System.out.println("금");
			break;
		case 6:
			System.out.println("토");
			break;
		default:
			System.out.println("일");
			break;
		}

	}
}
