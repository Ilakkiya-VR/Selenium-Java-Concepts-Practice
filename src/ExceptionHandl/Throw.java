package ExceptionHandl;

public class Throw {
	
	public static void m3() 
	{System.out.println("m3 method");
	m2();
	}
	
	public static void m2() {
		System.out.println("m2 method");
		try {
		m1(10, 0);}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
			e.printStackTrace();
		}
	}
	
	public static void m1(int a , int b) throws ArithmeticException {
		System.out.println("m1 method");
		int c=a/b;
		System.out.println("C value"+c);
	}
	public static void main(String[] args) {
		
		m3();
		System.out.println("Byeeeeeee");
		
	
	}

}
