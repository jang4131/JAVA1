package day03;

import java.util.Scanner;

public class Compare {
	public static void main(String[] args) {
		//두 정수를 입력받기
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		String result = null;
		
		String n1Msg = "첫번째 정수 : ";
		String n2Msg = "두번째 정수 : ";
		
		System.out.print(n1Msg);
		num1 = sc.nextInt();
		
		System.out.print(n2Msg);
		num2 = sc.nextInt();

		result = num1 > num2 ? "큰 값 : " + num1 :
			num1 == num2 ? "두 수가 같습니다." : "큰 값 : " + num2;
		
		System.out.println(result);
		
	}
}












