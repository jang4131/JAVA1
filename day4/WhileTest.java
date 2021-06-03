package day04;

public class WhileTest {
	public static void main(String[] args) {
		//이름 10번 출력
		int cnt = 0;
		while(cnt != 10) {
			cnt++;
			System.out.println(cnt + ".한동석");
		}
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		do{
			System.out.println("1.통신요금조회\n2.분실신고\n3.통신사이동\n0.상담원 연결");
			choice = sc.nextInt();
		}while(choice != 0);
		
		while(choice != 0) {
			System.out.println("1.통신요금조회\n2.분실신고\n3.통신사이동\n0.상담원 연결");
			choice = sc.nextInt();
		}
	}
}
