package day04;

public class ForTest {
	public static void main(String[] args) {
		//10번 이름 출력
		//10부터 1까지로 출력
		for(int i = 0; i < 10; i++) {
//			System.out.println(i + 1 + ".한동석");
			System.out.println(10 - i + ".한동석");
		}
		
				// 1~10까지 중 4까지만 출력하기
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i + 1);
//			if (i == 3) {
//				break;
//			}
//		}

		// 1~10까지 중 4제외하고 출력하기
		for (int i = 0; i < 10; i++) {
			if(i == 3) {
				continue;
			}
			System.out.println(i+1);
		}
	}
}
