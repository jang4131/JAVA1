package test;

import javax.swing.JOptionPane;

public class ATM {

	public static void main(String[] args) {
		
		String menuString = "ó���� ������ ����ּ���\n1.�ܾ���ȸ 2. �Ա� 3. ��� 0. ����";
		int totalMoney = 1000000;	
		int inputMoney = 0;
		int outputMoney = 0;
		
		int cmd = -1;
		
		while(cmd != 0) {
			
			cmd = Integer.parseInt(JOptionPane.showInputDialog(menuString));
			
			if(cmd == 1) {
				JOptionPane.showMessageDialog(null, "�ܾ� : " + totalMoney + " ��");		
			}else if(cmd == 2) {
				inputMoney = Integer.parseInt(JOptionPane.showInputDialog("�󸶸� �Ա��Ͻðھ��?"));
				totalMoney += inputMoney;
				JOptionPane.showMessageDialog(null, "�ܾ� : " + totalMoney + " ��");	
			}else if(cmd == 3) {
				outputMoney = Integer.parseInt(JOptionPane.showInputDialog("�󸶸� ��� �Ͻðھ��?"));
				totalMoney -= outputMoney;
				JOptionPane.showMessageDialog(null, "�ܾ� : " + totalMoney + " ��");			
			}else {
				JOptionPane.showMessageDialog(null, "ó���� �� ���� �����Դϴ�.");	
			}
		}
	}
}
