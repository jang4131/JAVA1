package day03;

import java.util.Scanner;

public class BloodType_switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String q = "Q.당신의 혈액형은?";
		String choiceMsg = "1.A\n2.B\n3.O\n4.AB";
		int choice = 0;
		
		String a_msg = "꼼꼼하고 세심하다.";
		String b_msg = "추진력이 강하다.";
		String o_msg = "밝고 스케일이 크다.";
		String ab_msg = "착하다.";
		String err_msg = "다시 시도하세요.";
		
		String result_msg = null;
		
		System.out.println(q + "\n" + choiceMsg);
		choice = sc.nextInt();
		
		//하나의 변수에 다양한 값이 담길 때 값을 비교하면
		//if문에서는 굉장히 불편하다.
		//같은 변수명이 여러번 반복되기 때문이다.
//		if(choice == 1) {
//
//		}else if(choice == 2) {
//			
//		}else if(choice == 3) {
//			
//		}else if(choice == 4) {
//			
//		}else {
//			
//		}
		switch(choice) {
		case 1:
			result_msg = a_msg;
			break;
		case 2:
			result_msg = b_msg;
			break;
		case 3:
			result_msg = o_msg;
			break;
		case 4:
			result_msg = ab_msg;
			break;
		default:
			result_msg = err_msg;
		}
		
		System.out.println(result_msg);
		
	}
}













