package day07;

public class MethodTask {
	//�� ������ ���� �޼ҵ� �����
//	void ���ϱ�(int num1, int num2){
//		int result = num1 + num2;
//		System.out.println(result);
//	}
	int add(int num1, int num2){
		int result = num1 + num2;
		return result;
	}
	
		//f(x) = 2x+1
	//��, x�� �����̴�.
	
	int f(int x){
		int result = 2 * x + 1;
		return result;
	}
	
	//�ּ� ���� �ѱ� ��
	void change(int[] data) {
		data[0] = 20;
	}
	
	//static ����	
	public static void main(String[] args) {
		MethodTask m = new MethodTask();
		int result = m.add(10, 5);
		
		System.out.println(result);
		
		MethodTask m = new MethodTask();
		System.out.println(m.f(1) + 9);
		
	}
}







