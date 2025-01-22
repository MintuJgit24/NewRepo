package exceptionPackage;

public class CustomSample {

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub

		int age = 2;

		if (age >= 18) {

			System.out.println("eligibile for voting.");
		} 
		else
		{
			throw new VotingException("not eligible");
			//Customized name
			//this is constructor invoking, so created another class with parent Exception
		}

	}

}
