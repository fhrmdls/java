package control;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// �����Լ� �׽�Ʈ, ���������� 10�ǿ� Ȱ�� ����
		Random r = new Random();
		
		int num = 0;
		for (int i = 0; i < 10; i++) {
			num = r.nextInt(3);
			System.out.println(num);
					
		}
		
	}

}
