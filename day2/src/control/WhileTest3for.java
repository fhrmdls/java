package control;

public class WhileTest3for {

	public static void main(String[] args) {
		// for��(�ݺ���)

		// 1���� 100���� ����

		// ���� ���� ������ ��
		int sum = 0;

		// i = 1(ó�� ��) ; i�� 101���� ���������� ; i�� 1�� ����
		for (int i = 1; i < 100; i++) {
			// sum�� 1�� ���ϰ�, �ݺ��ؼ� 2�� ���ϰ� .... 100���� ����
			sum = sum + i;
		}
		
		// ���Ѱ�� ���
		System.out.println(sum);

		
		
		
		
		// 1���� 20���� ���ϱ�

		// ���� ���� ������ ��
		long mul = 1;

		// j = 1(ó�� ��) ; j�� 21���� ���������� ; j�� 1�� ����
		for (int j = 1; j < 21; j++) {
			// sum�� 1�� ���ϰ�, �ݺ��ؼ� 2�� ���ϰ� .... 20���� ����
			mul = mul * j;
		}
		
		// ���Ѱ�� ���
		System.out.println(mul);

	}
}
