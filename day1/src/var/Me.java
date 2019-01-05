package var;

public class Me {

	public static void main(String[] args) {
		/*
		 * 기본 4 TYPE 정수 : byte < short < int < long 
		 * 실수 : float < double 
		 * 문자 : char 논리 :
		 * true, false
		 * 문자열 : String
		 */
//		변수명은 소문자 시작, 공백없음. 

		int age = 100;
		double eye = 0.9;
		char gender = '남';
		boolean time = true;

		String name = "조근형";
		int shoes;
		shoes = 270;

		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("시력 : " + eye);
		System.out.println("성별 : " + gender);
		System.out.println("신발사이즈 : " + shoes);
		System.out.println("");
		System.out.println("마지막시간 여부 : " + time);
		
		

	}
	
}
