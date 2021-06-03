package day02;

public class Variable3 {
	public static void main(String[] args) {
		int data = 65;
		int num1 = 10;
		int num2 = 100;
		double d = 10.783;
		
		System.out.printf("정수 : %1$d, 정수 : %1$d\n", data);
		System.out.printf("첫번째 정수 : %2$d, 두번째 정수 : %1$d\n", num2, num1);
		System.out.printf("실수 : %.2f\n", d);
		//d를 한 번만 사용해서 소수점 둘째 자리와 첫째 자리를 동시에 출력한다.
		//단, $를 사용한다.
		System.out.printf("소수점 둘째 자리 : %1$.2f, 소수점 첫째 자리 : %1$.1f\n", d);
	}
}











