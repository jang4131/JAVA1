package day10;

class A{
	int data = 100;
	
	public A() {
		System.out.println("부모 생성자 호출됨.");
	}
	
	void intro() {
		System.out.println("부모 클래스 A 입니다.");
	}
}

class B extends A{
	String str = "ABC";
	
	public B() {
		System.out.println("자식 생성자 호출됨.");
	}
	
	void printData() {
		System.out.println(data);
	}
	
	@Override
	void intro() {
//		super.intro();
		System.out.println("자식 클래스 B 입니다.");
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




















