package control;

public class IfTest {

	public static void main(String[] args) {
		// 코드 줄 자동정리 : ctrl + shift + f
		// 한줄 복사 : ctrl + alt + 위or아래 화살표

		// if(조건문)
		// if 입력하고, ctrl+space로 나오는 것 중 아래화살표로 ifelse선택하고
		// 엔터치면 더 입력하기 쉬움.

		// 나이 = 17세
		int age = 17;

		// 17세보다 크거나 같으면, 주류판매가능. 아니면, 주류판매불가 문구 출력
		if (age >= 17) {
			System.out.println("주류판매가능");
		} else {
			System.out.println("주류판매불가");
		}

	}

}
