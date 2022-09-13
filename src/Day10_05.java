
public class Day10_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		17 13 9 5 1 
//		18 14 10 6 2 
//		19 15 11 7 3 
//		20 16 12 8 4 
//		의 배열을 저장하시오
		
		
		int [][]a=new int [4][5];
		int cnt=1;
		
		for (int i=4; i>=0; i--) {
			for(int j=0; j<4; j++) {
				a[j][i]=cnt; cnt++;
			}
		}
		
		for (int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
