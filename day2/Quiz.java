package day03;

import javax.swing.JOptionPane;

public class Quiz {
	public static void main(String[] args) {
		
		//문제 출제(객관식)
		//사용자가 입력한 값과 정답을 삼항연산자로 비교하여
		//알맞은 메세지 출력하기
		String q = "Q.다음 중 동물이 아닌 것은?";
		String choiceMsg = "1. 강아지\n2.소\n3.키보드\n4.돼지";
		int choice = 0;
		int answer = 3;
		
		String resultMsg = null;
		
		choice = Integer.parseInt(JOptionPane.showInputDialog(q + "\n" + choiceMsg));
		
		resultMsg = choice == answer ? "정답!" :
			choice > 0 && choice < 5 ? "오답ㅠㅠ" : "?";

		JOptionPane.showMessageDialog(null, resultMsg);
	}
}














