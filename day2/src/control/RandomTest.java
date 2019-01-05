package control;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// 랜덤함수 테스트, 가위바위보 10판에 활용 가능
		Random r = new Random();
		
		int num = 0;
		for (int i = 0; i < 10; i++) {
			num = r.nextInt(3);
			System.out.println(num);
					
		}
		
	}

}
