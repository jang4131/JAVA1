package day04;

public class OperTest {
	public static void main(String[] args) {
		
		int money = 10000;
		money = money - 1000;
		money -= 1000;
		System.out.println(money);

		int data = 10;
		data += 1;
		data++;
//		System.out.println(data++);
		System.out.println(++data);
		System.out.println(data);
	}
}
