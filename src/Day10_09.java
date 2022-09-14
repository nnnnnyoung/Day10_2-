
public class Day10_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]a=new int [4][5];

//		1	2	4	7	11	
//		3	5	8	12	15	
//		6	9	13	16	18	
//		10	14	17	19	20	
//		
//		a배열에 위 숫자를 저장하시오
		
		int cnt=1;
		
		for(int i=0; i<5; i++) {
			int emp=i;
			for(int j=0; j<4; j++) {
				if(emp>=0) {
					a[j][emp]=cnt;
					cnt++;
					emp-=1;
				}
			}
		}
		
		for(int i=1; i<4; i++) {
			int emp2=i;
			for(int j=4; j>=0; j-- ) {
				if(emp2<4) {
					a[emp2][j]=cnt;
					cnt++;
					emp2+=1;
				}
			}
		}
		
		
		
			for(int i=0; i<4; i++) {
				for(int j=0; j<5; j++) {
					System.out.print(a[i][j]+"\t");
				}
				System.out.println();
			}
	}

}
