package day02;

public class Variable3 {
	public static void main(String[] args) {
		int data = 65;
		int num1 = 10;
		int num2 = 100;
		double d = 10.783;
		
		System.out.printf("���� : %1$d, ���� : %1$d\n", data);
		System.out.printf("ù��° ���� : %2$d, �ι�° ���� : %1$d\n", num2, num1);
		System.out.printf("�Ǽ� : %.2f\n", d);
		//d�� �� ���� ����ؼ� �Ҽ��� ��° �ڸ��� ù° �ڸ��� ���ÿ� ����Ѵ�.
		//��, $�� ����Ѵ�.
		System.out.printf("�Ҽ��� ��° �ڸ� : %1$.2f, �Ҽ��� ù° �ڸ� : %1$.1f\n", d);
	}
}











