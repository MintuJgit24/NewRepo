package superSample;

public class AdditionClass2 extends AdditionClass1 {

	public void divisionCheck() {
		
		double result=super.sum(10,20);
		if(result % 10 == 0) {
			System.out.println(result+" is divisible by 10.");
		}else {
			
			System.out.println(result+" is not divisible by 10.");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionClass2 obj=new AdditionClass2();
		System.out.println("sum of two numbers from class 1 is: "+ obj.sum(10,20));
		obj.divisionCheck();
	}

}
