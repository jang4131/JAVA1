package day06;

public class DArTest {
	public static void main(String[] args) {
		//2행 3열
		int[][] arrData = {{5,5,5}, {6,6,6}};
		int cnt = 0;
		
		for(int i=0; i<arrData.length; i++) {
			for(int j=0; j<arrData[i].length; j++) {
				//증감 연산자가 먼저 된 후 산술연산자가 작동한다.
				arrData[i][j] = 6 - cnt++; 
			}
		}
		
		for(int i=0; i<arrData.length; i++) {
			for(int j=0; j<arrData[i].length; j++) {
				System.out.println(arrData[i][j]);
			}
		}
		
		int length = arrData.length * arrData[0].length;
		System.out.println(arrData);
		System.out.println(arrData.length);
		System.out.println(arrData[1].length);
	
		//2차원 배열에 6 5 4 3 2 1 대입하기
		for (int i = 0; i < length; i++) {
			arrData[i / 3][i % 3] = 6 - i;
		}
	
		for (int i = 0; i < length; i++) {
			//i		0 1 2 3 4 5
			//행	0 0 0 1 1 1 : i / 3
			//열	0 1 2 0 1 2 : i % 3
			System.out.println(arrData[i / 3][i % 3]);
		}
		
		//구구단 출력
		int[][] ggd = new int[8][9]; // 구구단 값 저장을 위한 배열 생성
		for(int i=0; i<8; i++){ // 단수(행) 반복
			for(int j=0; j<9; j++){ // 곱하기(열) 반복
				ggd[i][j] = (i+2) * (j+1); // 배열에 값 저장
				System.out.print((i+2)+"*"+(j+1)+"="+ggd[i][j]+"\t");
			}
			System.out.println();
		}
	}
}











