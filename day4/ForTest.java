package day04;

public class ForTest {
	public static void main(String[] args) {
		//10�� �̸� ���
		//10���� 1������ ���
		for(int i = 0; i < 10; i++) {
//			System.out.println(i + 1 + ".�ѵ���");
			System.out.println(10 - i + ".�ѵ���");
		}
		
				// 1~10���� �� 4������ ����ϱ�
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i + 1);
//			if (i == 3) {
//				break;
//			}
//		}

		// 1~10���� �� 4�����ϰ� ����ϱ�
		for (int i = 0; i < 10; i++) {
			if(i == 3) {
				continue;
			}
			System.out.println(i+1);
		}
	}
}
