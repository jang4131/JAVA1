package day07;

public class MethodTask2 {
	
	//5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�
	void getMaxAndMin(int[] arData, int[] arResult) {
		arResult[0] = arData[0];
		arResult[1] = arData[0];
		
		for (int i = 1; i < arData.length; i++) {
			if(arResult[0] < arData[i]) {arResult[0] = arData[i];}
			if(arResult[1] > arData[i]) {arResult[1] = arData[i];}
		}
	}
	
	
	//�������α׷��� ������ִ� �޼ҵ�
	//�ּҰ��� ����ϴ� ������ ���� ���� 2�� �̻��� �� �ذ��ϱ� �����̴�.
	public static void main(String[] args) {
		MethodTask2 m2 = new MethodTask2();
		int[] arResult = new int[2];
		int[] arData = {3, 1, 5, 2, 7};
		
		m2.getMaxAndMin(arData, arResult);
		
		System.out.println("�ִ밪 : " + arResult[0]);
		System.out.println("�ּҰ� : " + arResult[1]);
		
	}
}























