package day09;

import java.util.Scanner;

class Car{
	String brand;
	String color;
	int price;
	boolean check;	//false 자동 초기화
	String pw = "0000";
	int policeCnt;
	
	//사용자가 직접 생성자를 선언하면, 선언한 생성자가 기본 생성자가 된다.
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
	
	
	
	//시동을 켜기 전 비밀번호를 입력받고
	//비밀번호가 일치하면 시동 켜기
	//비밀번호 연속 3회 실패 시 경찰 출동(출력)
	
	//※자동차 초기 비밀번호는 0000이다. 사용자가 변경을 원할 시 생성자를 통해서 새로운 비밀번호를 전달받는다.
	
	public Car(String brand, String color, int price, String pw) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.pw = pw;
	}
	//리팩토링
	boolean checkPw(String pw) {
		if(this.pw.equals(pw)) {
			return true;
		}
		policeCnt++;
		return false;
	}
	
	//시동이 이미 켜져있는 지 검사
	//만약 켜져있다면 오류 메세지 출력
	boolean engineStart() {
		if(!check) {
			return true;
		}
		return false;
	}
	

	//시동이 이미 꺼져있는 지 검사
	//만약 꺼져있다면 오류 메세지 출력
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
		
		String msg = "1.시동켜기\n2.시동끄기";
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		while(true) {
			System.out.println(msg);
			choice = sc.nextInt();
			
			//시동 켜기
			if(choice == 1) {
				if(myCar.engineStart()) {
					System.out.print("비밀번호 : ");
					if(myCar.checkPw(sc.next())) {
						myCar.check = true;
						myCar.policeCnt = 0;
						System.out.println("시동 킴");
					}else {
						if(myCar.policeCnt == 3) {
							System.out.println("경찰 출동!");
							break;
						}
					}
				}else {
					System.out.println("이미 시동이 켜져있습니다.");
				}
			//시동 끄기
			}else if(choice == 2) {
				if(myCar.engineStop()) {
					myCar.check = false;
					System.out.println("시동 끔");
					break;
				}else {
					System.out.println("이미 시동이 꺼져있습니다.");
				}
			}
		}
		
//		Car momCar = new Car("Benz", "Black", 15000);
//		Car dadyCar = new Car("Blue", 13000);
//		Car myCar = new Car();
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("아빠는 어떤 차 살꺼야?");
//		dadyCar.brand = sc.next();
//		
//		System.out.println("엄마~ 아빠는 " + dadyCar.brand + " 산대요~");
		
		
//		momCar.brand = "Benz";
//		momCar.color = "Black";
//		momCar.price = 15000;
//		
//		dadyCar.brand = "BMW";
//		dadyCar.
		
	}
}









