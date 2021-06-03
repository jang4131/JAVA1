package day02;

public class Casting {
	public static void main(String[] args) {
		//자동 형변환
		System.out.println(11 / 9);
		System.out.println(11.0 / 9);
		
		//강제 형변환
		System.out.println((double)11 / 9);
		System.out.println((int)8.43 + 2.59);
		System.out.println((int)(8.43 + 2.59));
		//8.43 + 2.59 == 10
		System.out.println((int)8.43 + (int)2.59);
		
		
		
		//casting 2
		char data = 67;
		System.out.println(data + 5);
		
		
		//casting 3 문자열
		String data1 = "1";
		String data2 = "2";
		
		//두 정수의 덧셈을 출력한다.
		System.out.println(Integer.parseInt(data1) + Integer.parseInt(data2));
		System.out.println(1 + "" + 3);
		System.out.println("" + (2 + 4));
	}
}
