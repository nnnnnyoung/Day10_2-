
public class Day10_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1 2 3 4 5 
//		10 9 8 7 6 
//		11 12 13 14 15 
//		20 19 18 17 16 
//		배열을 저장하시오
		
		int cnt=1;
		int [][] c=new int[4][5];
		
		for(int i=0; i<4;i++ ) {
			if(i%2==0) {
				for(int j=0; j<5; j++) {
					c[i][j]=cnt;
					cnt++;
				}
			}else {
				for(int j=4; j>=0; j--) {
					c[i][j]=cnt;
					cnt++;
				}
			}
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	
		
	}

}
