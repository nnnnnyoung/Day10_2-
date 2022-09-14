
public class Day10_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2차원 배열
//		{5,4,3,2,1}
//		{10,9,8,7,6}
//		{15,14,13,12,11}
//		{20,19,18,17,16} 
//		의 배열을 저장하시오
		
	
		
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
