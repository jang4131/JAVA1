package day04;

import javax.swing.JOptionPane;

public class Quiz {
	public static void main(String[] args) {
		
		String q = "Q.���� �� ������ �ƴ� ����?";
		String choiceMsg = "1. ������\n2.��\n3.Ű����\n4.����";
		int choice = 0;
		int answer = 3;
		
		String resultMsg = "";
		
		//���ڿ� �񱳽� ==�� ������� �ʰ� equals()�� ����Ѵ�.
		//���ڿ�.equals(���ڿ�);
		while(!resultMsg.equals("����!")) {
			choice = Integer.parseInt(JOptionPane.showInputDialog(q + "\n" + choiceMsg));
			
			if(choice == answer) {
				resultMsg = "����!";
			}else if(choice >= 1 && choice <= 4) {
				//����
				resultMsg = "����";
			}else {
				//�߸� �Է��� �κ�
				resultMsg = "�߸� �Է��ϼ̽��ϴ�.";
			}
	
			JOptionPane.showMessageDialog(null, resultMsg);
		}
	}
}














