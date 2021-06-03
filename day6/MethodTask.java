package day07;

public class MethodTask {
	//두 정수의 덧셈 메소드 만들기
//	void 더하기(int num1, int num2){
//		int result = num1 + num2;
//		System.out.println(result);
//	}
	int add(int num1, int num2){
		int result = num1 + num2;
		return result;
	}
	
		//f(x) = 2x+1
	//단, x는 정수이다.
	
	int f(int x){
		int result = 2 * x + 1;
		return result;
	}
	
	//주소 값을 넘길 때
	void change(int[] data) {
		data[0] = 20;
	}
	
	//static 설명	
	public static void main(String[] args) {
		MethodTask m = new MethodTask();
		int result = m.add(10, 5);
		
		System.out.println(result);
		
		MethodTask m = new MethodTask();
		System.out.println(m.f(1) + 9);
		
	}
}







