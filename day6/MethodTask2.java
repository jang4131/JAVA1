package day07;

public class MethodTask2 {
	//[�ʱ�]
	//�̸��� 10�� ����ϴ� �޼ҵ�
	void printNameFor10(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.println(name);
		}
	}
	//1~100���� ����ϴ� �޼ҵ�
	void printFrom1To100() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i+1);
		}
	}
	//1~100���� �� ���� ���ϴ� �޼ҵ�
	int getTotalFrom1To100() {
		int total = 0;
		for (int i = 0; i < 100; i++) {
			total += i+1;
		}
		return total;
	}
	//1~n������ ���� ���ϴ� �޼ҵ�
	int getTotalFrom1(int end) {
		int total = 0;
		for (int i = 0; i < end; i++) {
			total += i+1;
		}
		return total;
	}
	//[�߱�]
	//������ �Է¹ް� Ȧ���� ¦���� ¦���� Ȧ���� �ٲ��ִ� �޼ҵ�
	int change(int num) {
		return ++num;
	}
	//�� ������ �������� ����ϴ� �޼ҵ�
	void div(int num1, int num2) {
		String resultMsg = null;
		
		if(num2 != 0) {
			resultMsg = num1 / num2 + "";
		}else {
			resultMsg = "0���� ���� �� �����ϴ�.";
		}
		System.out.println(resultMsg);
	}
	
	//�α���(���̵� : apple, �н�����:1234) �޼ҵ�
	boolean login(String id, String pw) {
		if(id.equals("apple")) {
			if(pw.equals("1234")) {
				return true;
			}
		}
		return false;
	}
	
	//[���]
	//�ѱ��� ������ �ٲ��ִ� �޼ҵ�
	int changeToHangle(String hangle) {
		String hangle_org = "�����̻�����ĥ�ȱ�";
		String result = "";
		
		for (int i = 0; i < hangle.length(); i++) {
			result += hangle_org.indexOf(hangle.charAt(i));
		}
		return Integer.parseInt(result);
	}
	//���ڿ��� �Է¹ް� �빮�ڸ� �ҹ��ڷ� �����ִ� �޼ҵ�
	String changeToLower(String str) {
		String result = "";
		boolean check = false;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if(c >= 65 && c <=90) {
				result += (char)(c + 32);
				check = true;
			}else {
				result += c;
			}
		}
		return check ? result : "�빮�ڰ� �����ϴ�.";
	}
	//5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�
	void getMaxAndMin(int[] arData, int[] arResult) {
		arResult[0] = arData[0];
		arResult[1] = arData[0];
		
		for (int i = 1; i < arData.length; i++) {
			if(arResult[0] < arData[i]) {arResult[0] = arData[i];}
			if(arResult[1] > arData[i]) {arResult[1] = arData[i];}
		}
	}
	
	
	//�������α׷��� ������ִ� �޼ҵ�
	//�ּҰ��� ����ϴ� ������ ���� ���� 2�� �̻��� �� �ذ��ϱ� �����̴�.
	public static void main(String[] args) {
		MethodTask2 m2 = new MethodTask2();
		int[] arResult = new int[2];
		int[] arData = {3, 1, 5, 2, 7};
		
		m2.getMaxAndMin(arData, arResult);
		
		System.out.println("�ִ밪 : " + arResult[0]);
		System.out.println("�ּҰ� : " + arResult[1]);
		
//		System.out.println(m2.changeToLower("apPle1234!@#$"));
//		int result = m2.changeToHangle("�ϻ�����ϱ�����");
//		System.out.println(result + 1);
//		if(m2.login("apple", "1234")) {
//			System.out.println("�α��� ����");
//		}else {
//			System.out.println("�α��� ����");
//		}
	}
}























