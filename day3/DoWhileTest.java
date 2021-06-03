package day04;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		do{
			System.out.println("1.통신요금조회\n2.분실신고\n3.통신사이동\n0.상담원 연결");
			choice = sc.nextInt();
		}while(choice != 0);
		
//		while(choice != 0) {
//			System.out.println("1.통신요금조회\n2.분실신고\n3.통신사이동\n0.상담원 연결");
//			choice = sc.nextInt();
//		}
	}
}












