package day03;

import java.util.Scanner;

public class Compare_if {
	public static void main(String[] args) {
		//�� ������ �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		String result = null;
		
		String n1Msg = "ù��° ���� : ";
		String n2Msg = "�ι�° ���� : ";
		
		System.out.print(n1Msg);
		num1 = sc.nextInt();
		
		System.out.print(n2Msg);
		num2 = sc.nextInt();

		if(num1 > num2) {
			result = "ū �� : " + num1;
			
		}else if(num2 != num1) {
			result = "ū �� : " + num2;
			
		}else {
			result = "�� ���� �����ϴ�.";
		}
		
		System.out.println(result);
	}
}












