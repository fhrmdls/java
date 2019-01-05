package control;

public class IfTest2 {

	public static void main(String[] args) {

		String id = "lenassi15";
		int pw = 2000;

// 다른 경우 테스트방법 : 아래 2줄 주석 풀기 
// id = "kbinsure";
// pw = 1000;

		// id와 pw가 일치하면 정상로그인, 다르면 일치하지 않는다는 문구 출력
		
		//equals : String 일치 , && : and , == : 같음
		if (id.equals("lenassi15") && pw == 2000) {
			System.out.println("정상적으로 로그인되었습니다.");
		} else {
			System.out.println("ID 또는 패스워드가 일치하지 않습니다.");
		}

	}

}
