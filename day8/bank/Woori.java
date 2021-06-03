package bank;

public class Woori extends Bank{
	
	public Woori() {;}
	
	//잔액조회 재산 반토막
	@Override
	String balance() {
		//전 재산의 50%를 감소시킨다.
		this.money *= 0.5;
		return super.balance();
	}
}
