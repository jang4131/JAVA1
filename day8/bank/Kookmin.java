package bank;

public class Kookmin extends Bank{
	
	public Kookmin() {;}
	
	//��ݽ� ������ 50%
	@Override
	boolean withdraw(int money) {
		//��� �����ᰡ 50%�̱� ������ ����� �ݾ׿� 1.5�踦 �θ��� withdraw�� �����Ѵ�.
		money *= 1.5;
		return super.withdraw(money);
	}
}
