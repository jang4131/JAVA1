package bank;

public class Shinhan extends Bank{
	
	public Shinhan() {;}
	
	//�Աݽ� ������ 50%
	@Override
	void deposit(int money) {
		//�Ա��� �ݾ��� 50%�� �������̱� ������ �����Ḧ ������ �ݾ��� deposit�� �����Ѵ�.
		money *= 0.5;
		super.deposit(money);
	}
}
