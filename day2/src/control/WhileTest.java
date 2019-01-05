package control;

public class WhileTest {

	public static void main(String[] args) {
		//while문(반복문)
		//num이 3일때, 4일때 *이 하나씩 출력되어, *이 총 2개 출력됨.
		
		//1. 값
		int num = 3;
		
		//2. 조건 : num이 5가 될 때까지 반복함.
		while(num < 5) {
			System.out.println("*");

			//3. 증감연산자(반복할때마다 num에 +1을 더함)
			num++;
		
		}

	}

}
