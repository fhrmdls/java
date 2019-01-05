package control;

import java.util.Scanner;

public class IfTest4Scanner {

	public static void main(String[] args) {
		// 입력테스트 - 참고용, 알 필요 없음

		Scanner sc = new Scanner(System.in);

		System.out.print("이름은.. ");
		// 문자열(String) 입력
		String name = sc.next();

		System.out.print("나이는.. ");
		// 34 등 숫자(int) 입력
		int age = sc.nextInt();

		System.out.print("몸무게는.. ");
		// 88.8 등 실수(double) 입력 가능
		double weight = sc.nextDouble();
		System.out.println("=============================");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("몸무게 : " + weight);

		sc.close();

	}

}
