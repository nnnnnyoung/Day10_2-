
public class Day10_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		2차원 배열
//				{1,2,3,4,5}
//				{6,7,8,9,10}
//				{11,12,13,14,15}
//				{16,17,18,19,20} 
//				의 배열을 저장하시오
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
