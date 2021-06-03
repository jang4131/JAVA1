package day04;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		// 100~1까지 출력하기
//		for(int i=0; i<100; i++) {
//			System.out.println(100 - i);
//		}
		// 1~n까지의 합 구하기
//		Scanner sc = new Scanner(System.in);
//		String msg = "1~n까지의 합 구하기\nn : ";
//		int end = 0;
//		int result = 0;
//		String resultMsg = "";
//		
//		System.out.print(msg);
//		end = sc.nextInt();
//		
//		for(int i=0; i<end; i++) {
////			result = result + i+1;
//			result += i+1;
//			
//			//result = 0 + 0 + 1;
//			//result = (0+0+1) + 2
//			//result = (0+1+2) + 3
//			//result = (0+1+2+3) + 4
//		}
//		
//		resultMsg = result == 0 ? "0보다 큰 값을 입력해주세요" : result + "";
//		System.out.println(resultMsg);

		// 1~100까지 중 짝수만 출력하기( % : 나머지 연산자(모듈러스) 10 % 3 == 1)
//		for(int i=0; i<100; i++) {
//			System.out.print((i+1) % 2 == 0 ? i+1+"\n" : "");
//		}

		// A~F까지 출력하기
		// ctrl + shift + f : 자동 줄 맞춤
//		for (int i = 0; i < 6; i++) {
//			System.out.println((char)(65 + i));
//		}
		// A~F까지 C제외하고 출력하기
		// 0 : A
		// 1 : B
		// 2 : C -> D
		// 3 : D -> E
		// 4 : E -> F
//		int temp = 0;
//		for (int i = 0; i < 5; i++) {
//			temp = i;
//			if (i > 1) {
//				temp++;
//			}
//			System.out.println((char) (temp + 65));
//		}

		// 100~1까지 중 70까지만 출력하기
//		for (int i = 0; i < 100; i++) {
//			System.out.println(100 - i);
//			if(i == 30) {break;}
//		}
		// 1~100까지 중 3과 5의 공배수 출력하기(반드시 논리 연산자를 사용한다)(continue)
		//i % 3 ==0 && i % 5 == 0
		int data = 0;
		for(int i=0; i<100; i++) {
			data = i+1;
//			if(!(data % 3 ==0 && data % 5 == 0)) {
			if(data % 3 !=0 || data % 5 != 0) {
				continue;
			}
			System.out.println(data);
		}

	}
}











