package day04;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		// 100~1���� ����ϱ�
//		for(int i=0; i<100; i++) {
//			System.out.println(100 - i);
//		}
		// 1~n������ �� ���ϱ�
//		Scanner sc = new Scanner(System.in);
//		String msg = "1~n������ �� ���ϱ�\nn : ";
//		int end = 0;
//		int result = 0;
//		String resultMsg = "";
//		
//		System.out.print(msg);
//		end = sc.nextInt();
//		
//		for(int i=0; i<end; i++) {
////			result = result + i+1;
//			result += i+1;
//			
//			//result = 0 + 0 + 1;
//			//result = (0+0+1) + 2
//			//result = (0+1+2) + 3
//			//result = (0+1+2+3) + 4
//		}
//		
//		resultMsg = result == 0 ? "0���� ū ���� �Է����ּ���" : result + "";
//		System.out.println(resultMsg);

		// 1~100���� �� ¦���� ����ϱ�( % : ������ ������(��ⷯ��) 10 % 3 == 1)
//		for(int i=0; i<100; i++) {
//			System.out.print((i+1) % 2 == 0 ? i+1+"\n" : "");
//		}

		// A~F���� ����ϱ�
		// ctrl + shift + f : �ڵ� �� ����
//		for (int i = 0; i < 6; i++) {
//			System.out.println((char)(65 + i));
//		}
		// A~F���� C�����ϰ� ����ϱ�
		// 0 : A
		// 1 : B
		// 2 : C -> D
		// 3 : D -> E
		// 4 : E -> F
//		int temp = 0;
//		for (int i = 0; i < 5; i++) {
//			temp = i;
//			if (i > 1) {
//				temp++;
//			}
//			System.out.println((char) (temp + 65));
//		}

		// 100~1���� �� 70������ ����ϱ�
//		for (int i = 0; i < 100; i++) {
//			System.out.println(100 - i);
//			if(i == 30) {break;}
//		}
		// 1~100���� �� 3�� 5�� ����� ����ϱ�(�ݵ�� �� �����ڸ� ����Ѵ�)(continue)
		//i % 3 ==0 && i % 5 == 0
		int data = 0;
		for(int i=0; i<100; i++) {
			data = i+1;
//			if(!(data % 3 ==0 && data % 5 == 0)) {
			if(data % 3 !=0 || data % 5 != 0) {
				continue;
			}
			System.out.println(data);
		}

	}
}











