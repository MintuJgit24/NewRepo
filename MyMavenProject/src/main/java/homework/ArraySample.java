package homework;

public class ArraySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{1,2,3},{3,4,5},{5,6,7}};
		
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length;j++) {
				
				System.out.print(a[i][j] + " ");
				
			}
			System.out.println();
		}

	}

}
