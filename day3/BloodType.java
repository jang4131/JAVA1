package day03;

import java.util.Scanner;

public class BloodType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String q = "Q.����� ��������?";
		String choiceMsg = "1.A\n2.B\n3.O\n4.AB";
		int choice = 0;
		
		String a_msg = "�Ĳ��ϰ� �����ϴ�.";
		String b_msg = "�������� ���ϴ�.";
		String o_msg = "��� �������� ũ��.";
		String ab_msg = "���ϴ�.";
		String err_msg = "�ٽ� �õ��ϼ���.";
		
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













