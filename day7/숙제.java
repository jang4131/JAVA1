package day07;

public class MethodTask2 {
	
	//5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
	void getMaxAndMin(int[] arData, int[] arResult) {
		arResult[0] = arData[0];
		arResult[1] = arData[0];
		
		for (int i = 1; i < arData.length; i++) {
			if(arResult[0] < arData[i]) {arResult[0] = arData[i];}
			if(arResult[1] > arData[i]) {arResult[1] = arData[i];}
		}
	}
	
	
	//실행프로그램을 만들어주는 메소드
	//주소값을 사용하는 이유는 리턴 값이 2개 이상일 때 해결하기 위함이다.
	public static void main(String[] args) {
		MethodTask2 m2 = new MethodTask2();
		int[] arResult = new int[2];
		int[] arData = {3, 1, 5, 2, 7};
		
		m2.getMaxAndMin(arData, arResult);
		
		System.out.println("최대값 : " + arResult[0]);
		System.out.println("최소값 : " + arResult[1]);
		
	}
}























