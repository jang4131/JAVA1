package variable;

public class V1 {
	int data = 10;
	static int data_s = 20;
	
	void increaseData() {
		System.out.println(++data);
	}
	
	static void increaseData_s() {
		System.out.println(++data_s);
	}
}
