package day06;

public class DArTest {
	public static void main(String[] args) {
		//2�� 3��
		int[][] arrData = {{5,5,5}, {6,6,6}};
		int cnt = 0;
		
		for(int i=0; i<arrData.length; i++) {
			for(int j=0; j<arrData[i].length; j++) {
				//���� �����ڰ� ���� �� �� ��������ڰ� �۵��Ѵ�.
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
	
		//2���� �迭�� 6 5 4 3 2 1 �����ϱ�
		for (int i = 0; i < length; i++) {
			arrData[i / 3][i % 3] = 6 - i;
		}
	
		for (int i = 0; i < length; i++) {
			//i		0 1 2 3 4 5
			//��	0 0 0 1 1 1 : i / 3
			//��	0 1 2 0 1 2 : i % 3
			System.out.println(arrData[i / 3][i % 3]);
		}
		
		//������ ���
		int[][] ggd = new int[8][9]; // ������ �� ������ ���� �迭 ����
		for(int i=0; i<8; i++){ // �ܼ�(��) �ݺ�
			for(int j=0; j<9; j++){ // ���ϱ�(��) �ݺ�
				ggd[i][j] = (i+2) * (j+1); // �迭�� �� ����
				System.out.print((i+2)+"*"+(j+1)+"="+ggd[i][j]+"\t");
			}
			System.out.println();
		}
	}
}











