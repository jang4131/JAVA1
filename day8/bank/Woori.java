package bank;

public class Woori extends Bank{
	
	public Woori() {;}
	
	//�ܾ���ȸ ��� ���丷
	@Override
	String balance() {
		//�� ����� 50%�� ���ҽ�Ų��.
		this.money *= 0.5;
		return super.balance();
	}
}
