package day02;

public class Casting {
	public static void main(String[] args) {
		//�ڵ� ����ȯ
		System.out.println(11 / 9);
		System.out.println(11.0 / 9);
		
		//���� ����ȯ
		System.out.println((double)11 / 9);
		System.out.println((int)8.43 + 2.59);
		System.out.println((int)(8.43 + 2.59));
		//8.43 + 2.59 == 10
		System.out.println((int)8.43 + (int)2.59);
		
		
		
		//casting 2
		char data = 67;
		System.out.println(data + 5);
		
		
		//casting 3 ���ڿ�
		String data1 = "1";
		String data2 = "2";
		
		//�� ������ ������ ����Ѵ�.
		System.out.println(Integer.parseInt(data1) + Integer.parseInt(data2));
		System.out.println(1 + "" + 3);
		System.out.println("" + (2 + 4));
	}
}
