package day07;

public class MethodTask2 {
	//[초급]
	//이름을 10번 출력하는 메소드
	void printNameFor10(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.println(name);
		}
	}
	//1~100까지 출력하는 메소드
	void printFrom1To100() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i+1);
		}
	}
	//1~100까지 총 합을 구하는 메소드
	int getTotalFrom1To100() {
		int total = 0;
		for (int i = 0; i < 100; i++) {
			total += i+1;
		}
		return total;
	}
	//1~n까지의 합을 구하는 메소드
	int getTotalFrom1(int end) {
		int total = 0;
		for (int i = 0; i < end; i++) {
			total += i+1;
		}
		return total;
	}
	//[중급]
	//정수를 입력받고 홀수를 짝수로 짝수를 홀수로 바꿔주는 메소드
	int change(int num) {
		return ++num;
	}
	//두 정수의 나눗셈을 출력하는 메소드
	void div(int num1, int num2) {
		String resultMsg = null;
		
		if(num2 != 0) {
			resultMsg = num1 / num2 + "";
		}else {
			resultMsg = "0으로 나눌 수 없습니다.";
		}
		System.out.println(resultMsg);
	}
	
	//로그인(아이디 : apple, 패스워드:1234) 메소드
	boolean login(String id, String pw) {
		if(id.equals("apple")) {
			if(pw.equals("1234")) {
				return true;
			}
		}
		return false;
	}
	
	//[고급]
	//한글을 정수로 바꿔주는 메소드
	int changeToHangle(String hangle) {
		String hangle_org = "공일이삼사오육칠팔구";
		String result = "";
		
		for (int i = 0; i < hangle.length(); i++) {
			result += hangle_org.indexOf(hangle.charAt(i));
		}
		return Integer.parseInt(result);
	}
	//문자열을 입력받고 대문자를 소문자로 구해주는 메소드
	String changeToLower(String str) {
		String result = "";
		boolean check = false;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if(c >= 65 && c <=90) {
				result += (char)(c + 32);
				check = true;
			}else {
				result += c;
			}
		}
		return check ? result : "대문자가 없습니다.";
	}
	//5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
	void getMaxAndMin(int[] arData, int[] arResult) {
		arResult[0] = arData[0];
		arResult[1] = arData[0];
		
		for (int i = 1; i < arData.length; i++) {
			if(arResult[0] < arData[i]) {arResult[0] = arData[i];}
			if(arResult[1] > arData[i]) {arResult[1] = arData[i];}
		}
	}
	
	
	//실행프로그램을 만들어주는 메소드
	//주소값을 사용하는 이유는 리턴 값이 2개 이상일 때 해결하기 위함이다.
	public static void main(String[] args) {
		MethodTask2 m2 = new MethodTask2();
		int[] arResult = new int[2];
		int[] arData = {3, 1, 5, 2, 7};
		
		m2.getMaxAndMin(arData, arResult);
		
		System.out.println("최대값 : " + arResult[0]);
		System.out.println("최소값 : " + arResult[1]);
		
//		System.out.println(m2.changeToLower("apPle1234!@#$"));
//		int result = m2.changeToHangle("일삼오육일구공구");
//		System.out.println(result + 1);
//		if(m2.login("apple", "1234")) {
//			System.out.println("로그인 성공");
//		}else {
//			System.out.println("로그인 실패");
//		}
	}
}























