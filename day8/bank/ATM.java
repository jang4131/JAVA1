package bank;

public class ATM {
	public static void main(String[] args) {
		//각 은행별로 최대 100명의 고객을 유치할 수 있다.
		Shinhan[] arS = new Shinhan[100];
		Kookmin[] arK = new Kookmin[100];
		Woori[] arW = new Woori[100];
		
		Bank[] arNewMember = {new Shinhan(), new Kookmin(), new Woori()};
		
		Bank[][] arBank = {arS, arK, arW};
		//메인메뉴 : 은행선택(신한, 국민, 우리)
		//사용자메뉴 : 계좌개설, 입금하기, 출금하기, 잔액조회, 계좌번호 찾기, 은행 선택하기로 돌아가기
		
		//계좌 개설시 필요한 정보
		//1. 예금주
		//2. 비밀번호(비밀번호는 4자리이고, 4자리를 입력할 때까지 무한반복)
		//3. 계좌번호(계좌번호는 6자리이며, 100000부터 시작한다. 중복검사 후 중복이 없을 때 까지 무한반복)
		//4. 핸드폰 번호(-를 제외하고 입력받으며 중복검사 후 중복이 없을 때 까지 무한 반복)
		
		//※ 중복검사는 해당 은행의 고객 수만큼만 반복하여 검사한다.
		
		//계좌번호 찾기 구현방법
		//핸드폰 번호와 비밀번호를 입력한 후 일치하는 고객의 계좌번호를 재발급해준다.
		
	}
}













