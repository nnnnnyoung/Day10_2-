
public class Day10_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] a=new int[4][5];
		int cnt=1;
		
		for(int i=0; i<4; i++) {
			for(int j=4; j>=0; j--) {
				a[i][j]=cnt;
				cnt++;
			}
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
