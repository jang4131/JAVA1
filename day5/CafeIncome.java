package day06;

import java.util.Scanner;

public class CafeIncome {
	public static void main(String[] args) {
		//������, ȫ����, ������
		//ī��
		String[] arBranch = {"������", "ȫ����", "������"};
		Scanner sc = new Scanner(System.in);
		
		//flag
		boolean check = false;
		
		String resultMsg = "";
		
		int[] arIncome = new int[arBranch.length];
		
		int total = 0;
		double avg = 0.0;
		//�� ����� �Է½� ����ڿ��� � ������ ����������� �ݵ�� ���
		//��)ȫ���� ������� �Է��ϼ���.
		for (int i = 0; i < arBranch.length; i++) {
			System.out.println(arBranch[i] + " ������� �Է��ϼ���[���� : ����]");
			arIncome[i] = sc.nextInt();
			total += arIncome[i];
		}
		//�� ����װ� ��� ����� ���
		avg = Double.parseDouble( 
					String.format("%.2f", (double)total / arBranch.length));
		System.out.println("======================");
		System.out.println("����ī�� �� ����� : " + total + "����");
		System.out.println("����ī�� ��� ����� : " + avg + "����");
		System.out.println("======================");
		
		//��� ����׺��� ���� �� ������ �μ�Ƽ�� �������� ���
		//��)���μ�Ƽ�� �����
		//   ������
		//   ȫ����
		resultMsg += "���μ�Ƽ�� �����\n";
		for (int i = 0; i < arIncome.length; i++) {
			if(arIncome[i] > avg) {
				resultMsg += arBranch[i] + "\n";
				check = true;
			}
		}
		//�ظ��� �μ�Ƽ�� ������ ���ٸ� "�й��ϼ���"����ϱ�
		//��) �μ�Ƽ�� ������ �����ϴ�. �й��ϼ���.
		resultMsg = check ? resultMsg : "�μ�Ƽ�� ������ �����ϴ�. �й��ϼ���.";
		System.out.println(resultMsg);
	}
}





