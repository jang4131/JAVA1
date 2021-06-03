package day09;

class Test{
	int a = 100;
	
	void f() {
		System.out.println("this : " + this);
		System.out.println(this.a);
	}
}

public class ClassEx {
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		Test t4 = new Test();
		Test t5 = new Test();
	
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
		
		t1.a = 10;
		t2.a = 20;
		t3.a = 30;
		t4.a = 40;
		t5.a = 50;
		
		t1.f();
		t2.f();
		t3.f();
		t4.f();
		t5.f();
		
		
	}
}











