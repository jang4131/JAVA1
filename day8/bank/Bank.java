package bank;

public class Bank {
	//통장(잔액)
	int money;
	//예금주
	String name;
	//계좌번호
	String account;
	//비밀번호
	String pw;
	//핸드폰 번호
	String phone;
	
	public Bank() {;}
	
	//입금하기
	void deposit(int money) {
		this.money += money;
	}
	//출금하기
	boolean withdraw(int money) {
		if(this.money - money < 0) {
			return false;
		}
		this.money -= money;
		return true;
	}
	//잔액조회
	String balance() {
		return "현재 잔액 : " + this.money + "원";
	}
}













