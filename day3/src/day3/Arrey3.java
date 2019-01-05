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

		// 친구세명 배열에 넣고 , 프린트
		// String = "" , char = ''

		String[] names = { "은혜", "미소", "윤선" };
		for (String f : names) {
			System.out.println(f);
		}

		// 데이터저장방법
		// 기초형 - 정수(int),실수(double),char,boolean => 값
		// 참조형-배열,클래스...=>주소

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

