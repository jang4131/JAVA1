package test;

import javax.swing.JOptionPane;

public class ATM {

	public static void main(String[] args) {
		
		String menuString = "처리할 업무를 골라주세요\n1.잔액조회 2. 입금 3. 출금 0. 종료";
		int totalMoney = 1000000;	
		int inputMoney = 0;
		int outputMoney = 0;
		
		int cmd = -1;
		
		while(cmd != 0) {
			
			cmd = Integer.parseInt(JOptionPane.showInputDialog(menuString));
			
			if(cmd == 1) {
				JOptionPane.showMessageDialog(null, "잔액 : " + totalMoney + " 원");		
			}else if(cmd == 2) {
				inputMoney = Integer.parseInt(JOptionPane.showInputDialog("얼마를 입급하시겠어요?"));
				totalMoney += inputMoney;
				JOptionPane.showMessageDialog(null, "잔액 : " + totalMoney + " 원");	
			}else if(cmd == 3) {
				outputMoney = Integer.parseInt(JOptionPane.showInputDialog("얼마를 출금 하시겠어요?"));
				totalMoney -= outputMoney;
				JOptionPane.showMessageDialog(null, "잔액 : " + totalMoney + " 원");			
			}else {
				JOptionPane.showMessageDialog(null, "처리할 수 없는 업무입니다.");	
			}
		}
	}
}
