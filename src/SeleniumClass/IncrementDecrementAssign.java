package SeleniumClass;

public class IncrementDecrementAssign {
	public static void main(String[] args) {
		//1
		int x=0;
		x = x++ - --x + ++x - x--;
		System.out.println(x);
		//2
		int y=0;
		y = y++ - --y + ++y - y--;
		System.out.println(y);
		//3
		int i =11;
		i = i++ + ++i;
		System.out.println(i);
		//4
		int j =11;
		j = j++ + ++j + ++j - --j;
		System.out.println(j);
		//5
		int a=11, b=22, c;
				c = a + b + a++ + b++ + ++a + ++b;
				System.out.println("a="+a);
				System.out.println("b="+b);
				System.out.println("c="+c);		
		//6
	     //boolean m =true;   //Exception in thread "main" java.lang.Error: Unresolved compilation prob 
	     //m++; //Type mismatch: cannot convert from boolean to int
	     //System.out.println(m);
	     //7
				int r=1, s=2, t=3;
				int u = r-- - s-- - t--;
				System.out.println("r="+r);
				System.out.println("s="+s);
				System.out.println("t="+t);
				System.out.println("u="+u);
		 //8
				int a1=1,b1=2;
				int c1=--b1- ++a1 + ++b1 - --a1;
				System.out.println(a1);
				System.out.println(b1);
				System.out.println(c1);
			//9
				int i1=19,j1=29,k1=9;
				int m1 = i1-- - j1-- - k1--;
				System.out.println("i1="+i1);
				System.out.println("j1="+j1);
				System.out.println("k1="+k1);
				System.out.println("m1="+m1);
		//10
				int s1 = 11;
				//int t1 = --(s1++);//COmpilation error -can't modify the same variable twice within a single expression
				int t1 = s1++;
				--s1;
				System.out.println("s1="+s1);
				System.out.println("t1="+t1); 
			//11
				int h1=0,h2=0;
				int h3=--h1 * --h2 * h2-- * h1--;
				System.out.println("h1="+h1);
				System.out.println("h2="+h2); 
				System.out.println("h3="+h3);
			//12
				int a2=1;
				a2=a2++ + ++a2 * --a2 - a2--;
				System.out.println(a2);
		 //13
				//int A1=11++;	// Compillation error-increment /decrement should not be used in literal values it should be on variables
				int A1=11;
				System.out.println(A1++);
			//14
				int ch = 'A';
				System.out.println(++ch);
				System.out.println(ch++);
				System.out.println(ch);
				//15
				char sh = 'A';
				System.out.println(sh++ + 1);
				System.out.println(sh);
				System.out.println(++sh);
				//16
				double d=1.5, D=2.5;
				System.out.println(d++ + ++D);
				//17
				//int a4= 10;
				 //System.out.println(++a4++);//COmpilation error -can't modify the same variable twice within a single expression
	}
    }
