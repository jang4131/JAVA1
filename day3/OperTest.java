package day03;

public class OperTest {
	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 11;

		System.out.println("결과 : " + Integer.toBinaryString(a|b));
		System.out.println("결과 : " + Integer.toBinaryString(a));
		System.out.println("결과 : " + Integer.toBinaryString(~a));


		System.out.println("결과 : " + Integer.toBinaryString(a));
		System.out.println("결과 : " + Integer.toBinaryString(a<<2));
		System.out.println("결과 : " + (a<<1));
		System.out.println("결과 : " + Integer.toBinaryString(a>>2));
		
		
	
		
		System.out.println(10 > 1);
		System.out.println(10 > 1 && 10 == 11);
		System.out.println(10 > 1 || 10 == 11);
		System.out.println(!(10==1));
	}
}
