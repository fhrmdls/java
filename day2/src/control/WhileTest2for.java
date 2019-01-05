package control;

public class WhileTest2for {

	public static void main(String[] args) {
		// for문(반복문) : While문은 거의 사용하지 않고, for가 주로 사용됨.
		// WhileTest와 동일한 기능(num이 3일때, 4일때 *이 하나씩 출력되어, *이 총 2개 출력됨.)

		
		
		// While문의 값;조건;증감연산자를 한줄에 모두 표현
		// num = 3(처음 값) ; num이 5보다 작을때까지 ; num을 1씩 더함
		for (int num = 3; num < 5; num++) {
			System.out.println("*");

		}

	}
}
