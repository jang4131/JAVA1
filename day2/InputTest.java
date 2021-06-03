package day02;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요.");
		System.out.println(sc.nextLine() + "님");
//		System.out.print(sc.next());
//		System.out.println(sc.next() + "님");
	}
}
