package day03;

import javax.swing.JOptionPane;

public class Quiz {
	public static void main(String[] args) {
		
		//���� ����(������)
		//����ڰ� �Է��� ���� ������ ���׿����ڷ� ���Ͽ�
		//�˸��� �޼��� ����ϱ�
		String q = "Q.���� �� ������ �ƴ� ����?";
		String choiceMsg = "1. ������\n2.��\n3.Ű����\n4.����";
		int choice = 0;
		int answer = 3;
		
		String resultMsg = null;
		
		choice = Integer.parseInt(JOptionPane.showInputDialog(q + "\n" + choiceMsg));
		
		resultMsg = choice == answer ? "����!" :
			choice > 0 && choice < 5 ? "����Ф�" : "?";

		JOptionPane.showMessageDialog(null, resultMsg);
	}
}














