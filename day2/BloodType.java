package day03;

import java.util.Scanner;

public class BloodType {
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
		
		result_msg = choice == 1 ? a_msg :
				choice == 2 ? b_msg :
						choice == 3 ? o_msg :
								choice == 4 ? ab_msg :
									err_msg;
		
		System.out.println(result_msg);
		
	}
}













