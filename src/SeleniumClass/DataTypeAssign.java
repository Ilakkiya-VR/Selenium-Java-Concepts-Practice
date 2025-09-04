package SeleniumClass;

public class DataTypeAssign {

	public static void main(String[] args) {
		//1.
		String a= "Hello ";
		String b =" Naveen K";
		System.out.println(a+b);
	//2.
        int x = 74;
        int y = 36;
        int z = x+y;
        System.out.println(z);
        //3.
        int i = 50;
        int j = 3;
        int k = i/j;
        System.out.println(k);
        //4.
        float x1 = 25.5f;
        float x2 = 3.5f;
        float x3 = 40.5f;
        float x4 = 4.5f;
        double x5 = ((x1*x2-x2*x2)/(x3-x4));
        System.out.println(x5);
        //5.
        char r = 't';
        System.out.println("hello selenium"+r);
        //6.
        int y1=100;
        int y2=200;
        int y3=3400;
        int y4 = y1+y2+y3;
        System.out.println("Your Total Amount is:"+y4);
        System.out.println((byte)'h');
        //7.
        byte m = 3;
        byte n = 'd';
        int o = m+n;
        System.out.println((byte)n);
        System.out.println((char)o);
        //8.
        float f1=3.9f;
        float f2 = f1*f1;
        double f3 = Math.pow(f1, 2);
        System.out.println(f2);
        System.out.println(f3);
	  
   
        
      
         
	}

}
