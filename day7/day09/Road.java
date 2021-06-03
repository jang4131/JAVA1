package day09;

import java.util.Scanner;

class Car{
	String brand;
	String color;
	int price;
	boolean check;	//false �ڵ� �ʱ�ȭ
	String pw = "0000";
	int policeCnt;
	
	//����ڰ� ���� �����ڸ� �����ϸ�, ������ �����ڰ� �⺻ �����ڰ� �ȴ�.
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public Car(String color, int price) {
		this.color = color;
		this.price = price;
	}
	
	public Car() {
		
	}
	
	
	
	//�õ��� �ѱ� �� ��й�ȣ�� �Է¹ް�
	//��й�ȣ�� ��ġ�ϸ� �õ� �ѱ�
	//��й�ȣ ���� 3ȸ ���� �� ���� �⵿(���)
	
	//���ڵ��� �ʱ� ��й�ȣ�� 0000�̴�. ����ڰ� ������ ���� �� �����ڸ� ���ؼ� ���ο� ��й�ȣ�� ���޹޴´�.
	
	public Car(String brand, String color, int price, String pw) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.pw = pw;
	}
	//�����丵
	boolean checkPw(String pw) {
		if(this.pw.equals(pw)) {
			return true;
		}
		policeCnt++;
		return false;
	}
	
	//�õ��� �̹� �����ִ� �� �˻�
	//���� �����ִٸ� ���� �޼��� ���
	boolean engineStart() {
		if(!check) {
			return true;
		}
		return false;
	}
	

	//�õ��� �̹� �����ִ� �� �˻�
	//���� �����ִٸ� ���� �޼��� ���
	boolean engineStop() {
		if(check) {
			return true;
		}
		return false;
	}
}

public class Road {
	public static void main(String[] args) {
		
		Car myCar = new Car("ferrari", "Red", 35000);
		
		String msg = "1.�õ��ѱ�\n2.�õ�����";
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		while(true) {
			System.out.println(msg);
			choice = sc.nextInt();
			
			//�õ� �ѱ�
			if(choice == 1) {
				if(myCar.engineStart()) {
					System.out.print("��й�ȣ : ");
					if(myCar.checkPw(sc.next())) {
						myCar.check = true;
						myCar.policeCnt = 0;
						System.out.println("�õ� Ŵ");
					}else {
						if(myCar.policeCnt == 3) {
							System.out.println("���� �⵿!");
							break;
						}
					}
				}else {
					System.out.println("�̹� �õ��� �����ֽ��ϴ�.");
				}
			//�õ� ����
			}else if(choice == 2) {
				if(myCar.engineStop()) {
					myCar.check = false;
					System.out.println("�õ� ��");
					break;
				}else {
					System.out.println("�̹� �õ��� �����ֽ��ϴ�.");
				}
			}
		}
		
//		Car momCar = new Car("Benz", "Black", 15000);
//		Car dadyCar = new Car("Blue", 13000);
//		Car myCar = new Car();
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("�ƺ��� � �� �첨��?");
//		dadyCar.brand = sc.next();
//		
//		System.out.println("����~ �ƺ��� " + dadyCar.brand + " ����~");
		
		
//		momCar.brand = "Benz";
//		momCar.color = "Black";
//		momCar.price = 15000;
//		
//		dadyCar.brand = "BMW";
//		dadyCar.
		
	}
}









