package day06;

import java.util.Scanner;

public class CafeIncome {
	public static void main(String[] args) {
		//강남점, 홍대점, 신촌점
		//카페
		String[] arBranch = {"강남점", "홍대점", "신촌점"};
		Scanner sc = new Scanner(System.in);
		
		//flag
		boolean check = false;
		
		String resultMsg = "";
		
		int[] arIncome = new int[arBranch.length];
		
		int total = 0;
		double avg = 0.0;
		//각 매출액 입력시 사용자에게 어떤 매장의 매출액인지를 반드시 출력
		//예)홍대점 매출액을 입력하세요.
		for (int i = 0; i < arBranch.length; i++) {
			System.out.println(arBranch[i] + " 매출액을 입력하세요[단위 : 만원]");
			arIncome[i] = sc.nextInt();
			total += arIncome[i];
		}
		//총 매출액과 평균 매출액 출력
		avg = Double.parseDouble( 
					String.format("%.2f", (double)total / arBranch.length));
		System.out.println("======================");
		System.out.println("동석카페 총 매출액 : " + total + "만원");
		System.out.println("동석카페 평균 매출액 : " + avg + "만원");
		System.out.println("======================");
		
		//평균 매출액보다 많이 번 매장은 인센티브 매장으로 출력
		//예)★인센티브 매장★
		//   강남점
		//   홍대점
		resultMsg += "★인센티브 매장★\n";
		for (int i = 0; i < arIncome.length; i++) {
			if(arIncome[i] > avg) {
				resultMsg += arBranch[i] + "\n";
				check = true;
			}
		}
		//※만약 인센티브 매장이 없다면 "분발하세요"출력하기
		//예) 인센티브 매장이 없습니다. 분발하세요.
		resultMsg = check ? resultMsg : "인센티브 매장이 없습니다. 분발하세요.";
		System.out.println(resultMsg);
	}
}





