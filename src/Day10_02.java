
public class Day10_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		2차원 배열
		
		int ccnt=1;
		int[][] c=new int[4][8];
		
		for(int i=0; i<4; i++) { //i는 행
			for(int j=0; j<8; j++) { //j는 열
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
