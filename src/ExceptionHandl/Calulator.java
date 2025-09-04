package ExceptionHandl;

public class Calulator {

	public static void div(int a, int b) {
		try {
			int c = a / b;
			System.out.println("The value of C is:" + c);
			int N[] = new int[2];
			N[4] = 1;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception as divide by no is 0");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException is shown as provide the value beyond the size");
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		div(10, 0);
		System.out.println("Bye");

	}

}
