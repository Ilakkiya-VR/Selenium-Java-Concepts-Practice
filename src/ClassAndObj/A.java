package ClassAndObj;

public class A {
	
	public void a(int a) {System.out.println(a);}
	public void a(int a, int b){System.out.println(a+b);}
	public void a(String a,int b){System.out.println("a"+b);}
	public void a(int b,String a){System.out.println("a"+b);}
	public static void main(String[] args) {
		System.out.println("A main method");
		A add=new A();
		add.a(10);
		B.main(args);
		

	}

}
