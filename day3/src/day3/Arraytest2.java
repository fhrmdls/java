package day3;

public class Arraytest2 {

	public static void main(String[] args) {
		
		String[] names = new String[5];
		names[0] = "김아무개";
		names[1] = "김아무";
		names[2] = "김아";
		names[3] = "김";
		names[4] = "김무개";
		
		//배열은 반복문과 같이 사용 
		//length 갯수를 알고싶을때
		
		System.out.println(names.length);
		System.out.println(names[names.length-1]);
		
		//시력 3개 => double 
		//첫번째 시력과 마지막 시력 포린트 
		
		double[] eye = new double[3];
		eye[0] = 0.1;
		eye[1] = 1.1;
		eye[2] = 1.5;
		
		System.out.println(eye[0]);
		System.out.println(eye[2]);
		
		
		
	}

}
