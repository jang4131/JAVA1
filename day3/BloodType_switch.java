package day03;

import java.util.Scanner;

public class BloodType_switch {
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
		
		//�ϳ��� ������ �پ��� ���� ��� �� ���� ���ϸ�
		//if�������� ������ �����ϴ�.
		//���� �������� ������ �ݺ��Ǳ� �����̴�.
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













