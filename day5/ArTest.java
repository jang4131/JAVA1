package day05;

public class ArTest {
	public static void main(String[] args) {
		int[] arData = {3, 4, 2, 1, 6};
		System.out.println(arData);
		System.out.println(arData.length);
		
		System.out.println(arData[0]);
		System.out.println(arData[1]);
		System.out.println(arData[2]);
		System.out.println(arData[3]);
		System.out.println(arData[4]);
		System.out.println(arData[10]);	//오류

		
		//출력했을 때 5, 4, 3, 2, 1 이 나오도록 값을 수정하기
		for(int i=0; i<arData.length; i++) {
			arData[i] = 5 - i;
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(arData[i]);
		}
		
		//[초급]
		//1~100까지 배열에 넣고 출력하기
		int[] arData = new int[100];
		
		for (int i = 0; i < arData.length; i++) {
			arData[i] = i+1;
		}
		
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
		
		
		//100~1까지 중 짝수만 배열에 넣고 출력하기
		int[] arData = new int[50];
		
		for (int i = 0; i < arData.length; i++) {
			arData[i] = (50 - i) * 2;
		}
		
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
		//1~10까지 배열에 넣고 총 합 구하기
		int[] arData = new int[10];
		
		int total = 0;
		
		for (int i = 0; i < arData.length; i++) {
			//대입 연산자는 항상 우항이 먼저 완료된 후 실행된다.
			//arData[i]에 i+1이 먼저 담기고 그 다음 arData[i]의 값이 total에 누적합이 된다.
			total += arData[i] = i+1;
			//arData[i] = i+1;
			//total = total + arData[i]
			
			//1번째 반복
			//total = 0 + 1
			
			//2번째 반복
			//total = (0+1) + 2
			
			//3번째 반복
			//total = (0+1+2) + 3
		}
		
		System.out.println(total);
		
		
		//[중급]
		//사용자가 선택한 개수만큼 배열을 할당하고 정수 입력받고 배열에 넣고 출력하기(동적 배열)
		Scanner sc = new Scanner(System.in);
		//주소값이 미정이면 넣을 수 있는 초기값은 null이다.
		int[] arNum = null;
		String msg = "몇 개의 정수를 입력하실 건가요?";
		
		System.out.println(msg);
		//사용자가 입력한 정수만큼 배열을 할당하고, 첫번째 주소값을 arNum에 담아준다.
		arNum = new int[sc.nextInt()];
		
		//사용자가 만든 배열의 칸수만큼 정수를 입력받는다.
		for (int i = 0; i < arNum.length; i++) {
			System.out.print(i + 1 + "번째 정수 : ");
			arNum[i] = sc.nextInt();
		}
		
		//입력한 정수를 모두 출력한다.
		for (int i = 0; i < arNum.length; i++) {
			System.out.println(arNum[i]);
		}
		
		//A~F까지 배열에 넣고 출력하기(아스키 코드)
		char[] arData = new char[6];
//		'A' : 65
//		'B' : 66
//		'C' : 67
		for (int i = 0; i < arData.length; i++) {
			arData[i] = (char)(65+i);
		}
		
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
		
	}
}
















