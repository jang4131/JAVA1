package day10;

class A{
	int data = 100;
	
	public A() {
		System.out.println("�θ� ������ ȣ���.");
	}
	
	void intro() {
		System.out.println("�θ� Ŭ���� A �Դϴ�.");
	}
}

class B extends A{
	String str = "ABC";
	
	public B() {
		System.out.println("�ڽ� ������ ȣ���.");
	}
	
	void printData() {
		System.out.println(data);
	}
	
	@Override
	void intro() {
//		super.intro();
		System.out.println("�ڽ� Ŭ���� B �Դϴ�.");
	}
	
}

public class InheritanceTest {
	public static void main(String[] args) {
		B b = new B();
		b.intro();
		b.data = 150;
		b.printData();
	}
}




















