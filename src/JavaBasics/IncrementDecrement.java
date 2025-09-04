package JavaBasics;

public class IncrementDecrement {

	public static void main(String[] args) {

		int m = 0, n = 0;

		int p = --m * --n * n-- * m--;

		System.out.println(p);
		System.out.println(m);
		System.out.println(n);
		int a =20;
		a= a++ +1;
		System.out.println(a);
		int b =20;
		b= ++b +1;
		System.out.println(b);
		int d=20;
		d= ++d + ++d;
		System.out.println(d);
	    int f, g;
	    f=10;
	    g=--f;
	    System.out.println(f);
	    System.out.println(g);

	}

}
