package constructor;

public class ReturnPgm {

	public static void sum() {

		int a = 10;
		int b = 5;
		int c = a + b;
		System.out.println("sum:" + c);

	}

	public static void sum(int a, int b) {

		int c = a + b;
		System.out.println("sum:" + c);

	}

	public static void sum(int a, int b, int c) {

		int sum = a + b + c;
		System.out.println("sum is:" + sum);

	}

	public static void sum(float a, int b) {
		float sum = a + b;
		System.out.println("sum is:" + sum);

	}

	public static int sum1(int a, int b) {
		int sum = a + b;
		return sum;

	}

	public static void main(String args[]) {

		sum();
		sum(2, 3);
		sum(1, 2, 3);
		sum(2.3f, 4);
		System.out.println("sum is:" + sum1(2, 6));
	}

}
