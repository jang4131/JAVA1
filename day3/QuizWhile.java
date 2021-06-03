package day04;

import javax.swing.JOptionPane;

public class Quiz {
	public static void main(String[] args) {
		
		String q = "Q.다음 중 동물이 아닌 것은?";
		String choiceMsg = "1. 강아지\n2.소\n3.키보드\n4.돼지";
		int choice = 0;
		int answer = 3;
		
		String resultMsg = "";
		
		//문자열 비교시 ==을 사용하지 않고 equals()를 사용한다.
		//문자열.equals(문자열);
		while(!resultMsg.equals("정답!")) {
			choice = Integer.parseInt(JOptionPane.showInputDialog(q + "\n" + choiceMsg));
			
			if(choice == answer) {
				resultMsg = "정답!";
			}else if(choice >= 1 && choice <= 4) {
				//오답
				resultMsg = "오답";
			}else {
				//잘못 입력한 부분
				resultMsg = "잘못 입력하셨습니다.";
			}
	
			JOptionPane.showMessageDialog(null, resultMsg);
		}
	}
}














