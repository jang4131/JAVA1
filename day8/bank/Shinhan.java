package bank;

public class Shinhan extends Bank{
	
	public Shinhan() {;}
	
	//입금시 수수료 50%
	@Override
	void deposit(int money) {
		//입금한 금액의 50%가 수수료이기 때문에 수수료를 제외한 금액을 deposit에 전달한다.
		money *= 0.5;
		super.deposit(money);
	}
}
