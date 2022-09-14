
public class Day10_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=1;
		int [][] a=new int[4][5];
		
		for(int i=0; i<4;i++ ) {
			if(i%2==0) {
				for(int j=0; j<5; j++) {
					a[i][j]=cnt;
					cnt++;
				}
			}else {
				for(int j=4; j>=0; j--) {
					a[i][j]=cnt;
					cnt++;
				}
			}
		}
		 
		int [][]b= {{54,23,23,53,23},
					{3,21,22,32,2},
					{2,32,22,12,23},
					{32,32,12,33,32}};
		
//		A,B배열의 같은 자리에 있는 값끼리 더한 배열을 만들어라
		
		int [][] c=new int [4][5];
		for (int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				c[i][j]=(a[i][j]+b[i][j]);
			}
		}
		for (int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(c[i][j]+"/");
			}
			System.out.println();
		}
	
		
	}

}
