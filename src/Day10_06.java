
public class Day10_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] c= {	{5,32,23,34,2},
						{4,12,13,36,6},
						{87,62,21,43,97},
						{65,32,12,32,22} };
		
//		�� ���� ���� ���� ����Ͻÿ�
		int sum=0;
		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				sum+=c[i][j];
			}
			System.out.println(i+"��° ���� �հ�:"+sum);
			sum=0;
		}	
	
		
	}

}
