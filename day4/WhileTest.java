package day04;

public class WhileTest {
	public static void main(String[] args) {
		//�̸� 10�� ���
		int cnt = 0;
		while(cnt != 10) {
			cnt++;
			System.out.println(cnt + ".�ѵ���");
		}
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		do{
			System.out.println("1.��ſ����ȸ\n2.�нǽŰ�\n3.��Ż��̵�\n0.���� ����");
			choice = sc.nextInt();
		}while(choice != 0);
		
		while(choice != 0) {
			System.out.println("1.��ſ����ȸ\n2.�нǽŰ�\n3.��Ż��̵�\n0.���� ����");
			choice = sc.nextInt();
		}
	}
}
