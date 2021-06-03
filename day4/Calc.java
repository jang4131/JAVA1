package test;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String menuMsg = "1.계산하기\n2.나가기";
		int num1, num2 = 0;
		String oper = "";
		
//		num1 = Integer.parseInt(sc.next());
//		oper = sc.next();
//		num2 = Integer.parseInt(sc.next());
//		
//		System.out.println(num1);
//		System.out.println(oper);
//		System.out.println(num2);
		
		
		int choice = 0;
		
		
		while(true) {
			
			System.out.println(menuMsg);
			choice = sc.nextInt();
			if(choice == 2) break;			
			if(choice != 1) continue;
			
			num1 = Integer.parseInt(sc.next());
			oper = sc.next();
			num2 = Integer.parseInt(sc.next());
			
			switch(oper) {
			case "+" :
				System.out.println(num1+num2);
				break;
			case "-" :
				System.out.println(num1-num2);
				break;
			case "*" :
				System.out.println(num1*num2);
				break;
			case "/" :
				if(num2 != 0)
					System.out.println(num1/num2);
				else
					System.out.println("0으로 나눌 수 없습니다.");
				break;
			default :
				System.out.println("사칙연산 외의 연산자는 사용할 수 없습니다.");
			}
			
			
		}

	}

}
