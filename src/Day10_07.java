
public class Day10_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [][] c= {	{5,32,23,34,2},
						{4,12,13,36,6},
						{87,62,21,43,97},
						{65,32,12,32,22} };
		
//		위 배열에서 열의 합을 각각 출력하시오
		int sum=0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				sum+=c[j][i];
			}
			System.out.println(i+"열의 합계: "+sum);
			sum=0;
		}
	
		
	}

}
