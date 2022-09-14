
public class Day10_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=1;
		int [][] a=new int[4][5];
		int sRow=0;
		int mRow=3;
		int sCol=0;
		int mCol=4;
		
		for(int k=1; k<=2; k++) {
			for (int i=sCol; i<=mCol; i++) {
				a[sRow][i]=cnt; cnt++;		
			}
			sRow++; 
			
			for(int i=sRow; i<=mRow; i++) {
				a[i][mCol]=cnt; cnt++;
			}
			mCol--;
			for(int i=mCol; i>=sCol; i--) {
				a[mRow][i]=cnt; cnt++;
			}
			mRow--;
			for(int i=mRow; i>=sRow; i--) {
				a[i][sCol]=cnt; cnt++;
			}
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
