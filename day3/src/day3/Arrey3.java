package day3;

public class Arrey3 {

	public static void main(String[] args) {
		int[] n = { 100, 200, 300 };
		System.out.println(n[0]);
		System.out.println(n.length);

		double[] eye = { 0.9, 0.5, 1.5 };
		for (int i = 0; i < eye.length; i++) {
			System.out.println(eye[i]);
		}

		for (double d : eye) {
			System.out.println(d);
		}

		// ģ������ �迭�� �ְ� , ����Ʈ
		// String = "" , char = ''

		String[] names = { "����", "�̼�", "����" };
		for (String f : names) {
			System.out.println(f);
		}

		// ������������
		// ������ - ����(int),�Ǽ�(double),char,boolean => ��
		// ������-�迭,Ŭ����...=>�ּ�

		int[] g = new int[100];
		g[0] = 100;
		g[1] = 200;
		g[2] = 300;
		System.out.println(g[0]);
		System.out.println(g[1]);
		System.out.println(g[2]);

		System.out.println(g.length);

		String[] ss = new String[100];
		ss[0] = "hello";
		ss[1] = "java";
		ss[99] = "spring";
		System.out.println(ss[0]);
		System.out.println(ss[1]);
		System.out.println(ss[99]);

		
		
		
		
		
	}

}

