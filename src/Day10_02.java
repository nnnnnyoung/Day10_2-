
public class Day10_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		2���� �迭
//				{1,2,3,4,5}
//				{6,7,8,9,10}
//				{11,12,13,14,15}
//				{16,17,18,19,20} 
//				�� �迭�� �����Ͻÿ�
		int ccnt=1;
		int[][] c=new int[4][8]; 
		
		for(int i=0; i<4; i++) { //i�� ��
			for(int j=0; j<8; j++) { //j�� ��
				c[i][j]=ccnt;
				ccnt++;
			}
		}

		for(int i=0; i<4; i++) {
			for(int j=0; j<8; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
