package day3;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		// ���忹��ý���
		Scanner sc = new Scanner(System.in);
		int[] seat = new int[10];

		while (true) {
			System.out.println(" ");
			System.out.println("------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + 1 + "  ");

			}
			System.out.println();
			System.out.println("------------------------------");

			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + "  ");
			}
			System.out.println(" ");
			System.out.println("�����ϰ� ���� �¼���ȣ�� �Է��ϼ���.");
			System.out.println("����� 0�� �Է��ϼ���.");
			System.out.print("�¼���ȣ >> ");
			int number = sc.nextInt();
			if (number == 0) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			}
			if (seat[number - 1] == 0) {
				System.out.println("���� ������ �ڸ��Դϴ�.");
				System.out.println("���Ÿ� �����ϰڽ��ϴ�.");
				seat[number - 1] = 1;
				System.out.println("���� �Ϸ�Ǿ����ϴ�.");
			} else {
				System.out.println("���� �Ұ����� �ڸ��Դϴ�");
				System.out.println("�ٸ� �¼��� �Է����ּ���.");
			}
		}

	}

}
