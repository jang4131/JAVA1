package day05;

public class ArTest {
	public static void main(String[] args) {
		int[] arData = {3, 4, 2, 1, 6};
		System.out.println(arData);
		System.out.println(arData.length);
		
		System.out.println(arData[0]);
		System.out.println(arData[1]);
		System.out.println(arData[2]);
		System.out.println(arData[3]);
		System.out.println(arData[4]);
		System.out.println(arData[10]);	//����

		
		//������� �� 5, 4, 3, 2, 1 �� �������� ���� �����ϱ�
		for(int i=0; i<arData.length; i++) {
			arData[i] = 5 - i;
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(arData[i]);
		}
		
		//[�ʱ�]
		//1~100���� �迭�� �ְ� ����ϱ�
		int[] arData = new int[100];
		
		for (int i = 0; i < arData.length; i++) {
			arData[i] = i+1;
		}
		
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
		
		
		//100~1���� �� ¦���� �迭�� �ְ� ����ϱ�
		int[] arData = new int[50];
		
		for (int i = 0; i < arData.length; i++) {
			arData[i] = (50 - i) * 2;
		}
		
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
		//1~10���� �迭�� �ְ� �� �� ���ϱ�
		int[] arData = new int[10];
		
		int total = 0;
		
		for (int i = 0; i < arData.length; i++) {
			//���� �����ڴ� �׻� ������ ���� �Ϸ�� �� ����ȴ�.
			//arData[i]�� i+1�� ���� ���� �� ���� arData[i]�� ���� total�� �������� �ȴ�.
			total += arData[i] = i+1;
			//arData[i] = i+1;
			//total = total + arData[i]
			
			//1��° �ݺ�
			//total = 0 + 1
			
			//2��° �ݺ�
			//total = (0+1) + 2
			
			//3��° �ݺ�
			//total = (0+1+2) + 3
		}
		
		System.out.println(total);
		
		
		//[�߱�]
		//����ڰ� ������ ������ŭ �迭�� �Ҵ��ϰ� ���� �Է¹ް� �迭�� �ְ� ����ϱ�(���� �迭)
		Scanner sc = new Scanner(System.in);
		//�ּҰ��� �����̸� ���� �� �ִ� �ʱⰪ�� null�̴�.
		int[] arNum = null;
		String msg = "�� ���� ������ �Է��Ͻ� �ǰ���?";
		
		System.out.println(msg);
		//����ڰ� �Է��� ������ŭ �迭�� �Ҵ��ϰ�, ù��° �ּҰ��� arNum�� ����ش�.
		arNum = new int[sc.nextInt()];
		
		//����ڰ� ���� �迭�� ĭ����ŭ ������ �Է¹޴´�.
		for (int i = 0; i < arNum.length; i++) {
			System.out.print(i + 1 + "��° ���� : ");
			arNum[i] = sc.nextInt();
		}
		
		//�Է��� ������ ��� ����Ѵ�.
		for (int i = 0; i < arNum.length; i++) {
			System.out.println(arNum[i]);
		}
		
		//A~F���� �迭�� �ְ� ����ϱ�(�ƽ�Ű �ڵ�)
		char[] arData = new char[6];
//		'A' : 65
//		'B' : 66
//		'C' : 67
		for (int i = 0; i < arData.length; i++) {
			arData[i] = (char)(65+i);
		}
		
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
		
	}
}
















