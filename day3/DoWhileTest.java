package day04;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		do{
			System.out.println("1.��ſ����ȸ\n2.�нǽŰ�\n3.��Ż��̵�\n0.���� ����");
			choice = sc.nextInt();
		}while(choice != 0);
		
//		while(choice != 0) {
//			System.out.println("1.��ſ����ȸ\n2.�нǽŰ�\n3.��Ż��̵�\n0.���� ����");
//			choice = sc.nextInt();
//		}
	}
}












