
public class Day10_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]a= {{54,23,23,53,87},
					{3,21,55,90,27},
					{2,32,22,18,65},
					{32,39,12,33,94}};
//		위의 배열을 아래와 같이 변경하시오
//		단 배열을 새로 만들지 않는다.
//		3	54	23	23	53	
//		2	32	21	55	87	
//		32	22	18	90	27	
//		39	12	33	94	65	
		 
		int sRow=0;
		int mRow=3;
		int sCol=0;
		int mCol=4;
		
		
		for(int k=1; k<=2; k++) {
			int a1=a[sRow][mCol];
			int a2=a[mRow][mCol];
			int a3=a[mRow][sCol];
	
			
			for(int i=mCol; i>sCol; i--) {
				a[sRow][i]=a[sRow][i-1];
			}
			
			sRow++;
			
			
			
			for(int i=mRow; i>sRow; i--) {
				a[i][mCol]=a[i-1][mCol];
			}
			
			a[sRow][mCol]=a1;
			mCol--;
	
	
			
			for(int i=sCol; i<mCol; i++) {
				a[mRow][i]=a[mRow][i+1];
			}
			
			a[mRow][mCol]=a2;
			mRow--;
			
			for(int i=sRow; i<=mRow; i++) {
				a[i-1][sCol]=a[i][sCol];
			}
				
			a[mRow][sCol]=a3;
			sCol++;

			
		}	
			
			
		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
