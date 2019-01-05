package control;

public class WhileTest3for {

	public static void main(String[] args) {
		// for문(반복문)

		// 1부터 100까지 더함

		// 더한 값을 저장할 값
		int sum = 0;

		// i = 1(처음 값) ; i이 101보다 작을때까지 ; i을 1씩 더함
		for (int i = 1; i < 100; i++) {
			// sum에 1을 더하고, 반복해서 2를 더하고 .... 100까지 더함
			sum = sum + i;
		}
		
		// 더한결과 출력
		System.out.println(sum);

		
		
		
		
		// 1부터 20까지 곱하기

		// 곱한 값을 저장할 값
		long mul = 1;

		// j = 1(처음 값) ; j이 21보다 작을때까지 ; j을 1씩 더함
		for (int j = 1; j < 21; j++) {
			// sum에 1을 곱하고, 반복해서 2를 곱하고 .... 20까지 곱함
			mul = mul * j;
		}
		
		// 곱한결과 출력
		System.out.println(mul);

	}
}
