package bank;

public class Bank {
	//����(�ܾ�)
	int money;
	//������
	String name;
	//���¹�ȣ
	String account;
	//��й�ȣ
	String pw;
	//�ڵ��� ��ȣ
	String phone;
	
	public Bank() {;}
	
	//�Ա��ϱ�
	void deposit(int money) {
		this.money += money;
	}
	//����ϱ�
	boolean withdraw(int money) {
		if(this.money - money < 0) {
			return false;
		}
		this.money -= money;
		return true;
	}
	//�ܾ���ȸ
	String balance() {
		return "���� �ܾ� : " + this.money + "��";
	}
}













