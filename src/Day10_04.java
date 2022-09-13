
public class Day10_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1 5 9 13 17 
//		2 6 10 14 18 
//		3 7 11 15 19 
//		4 8 12 16 20 
//		의 배열을 저장하시오
		
		int [][] a=new int [4][5];
		int cnt=1;
		
		for (int i=0; i<5; i++) {
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
