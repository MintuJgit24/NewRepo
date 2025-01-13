package exceptionPackage;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{1,2},{3,4}};
		
		int c=10;
		int div;
		
		try {
			for(int i=0;i<3;i++) {
				
				for(int j=0;j<2;j++) {
					
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
			
		}
		catch(Exception e) {
			System.out.println("handled the type of exception: " +e);
		}
		finally {
			
			div = c/2;
			System.out.println("value of div is: "+div);
			
		}

	}

}
