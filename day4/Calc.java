package test;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String menuMsg = "1.����ϱ�\n2.������";
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
					System.out.println("0���� ���� �� �����ϴ�.");
				break;
			default :
				System.out.println("��Ģ���� ���� �����ڴ� ����� �� �����ϴ�.");
			}
			
			
		}

	}

}
