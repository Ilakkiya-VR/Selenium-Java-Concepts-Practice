package JavaBasics;

public class ArithmeticOper {

	public static void main(String[] args) {
		int a = 100;
		float b = 200.0009f;
		byte c = 10, g= 11;
		char d = 'a';
		float e = a-b+c+d*g;
		int f= (int)e;
		System.out.println(e);
		System.out.println((byte)d);
		System.out.println(f);
		System.out.println((int)e);
		System.out.println((char)e);
		System.out.println("---------");
		int m=  022;
		System.out.println(m);
		int n = m%2; 
		if(n==0) {
			System.out.println(m+" is even number");
		}
		else
		{System.out.println(m+" is odd number");}
       float x = 700;
       float y = 3;
       float R = x%y;
       float z = x/y;
       System.out.println(z);     
       System.out.println((int)R);  
       System.out.println("---------");
      // System.out.println(1/0); (any integer/0 - AE)
       //System.out.println(0/0);(any integer/0 - AE)
       System.out.println(0/1000); //0/any integer value-0
       System.out.println(0/10.01);//0/any float value-0.0
       System.out.println(1.0/0); //infinity - float value/0
       System.out.println(1/0.0); //infinity -  integer value /0.0
       System.out.println(0/0.0);//NaN
       System.out.println(0.0/0.0);//NaN
       System.out.println(0.0/0);//NaN
       System.out.println("---------");
       int x2 = 10000;
       int y2 = 5000;
       int z2 = x2+y2;
       System.out.println("Total:"+z2);
       int m2 = z2*10/100;
       z2  -= (z2*10/100);
       System.out.println("Discount Amount:"+m2);
       System.out.println("Amount to be paid after discount:"+z2);
       System.out.println("---------");
       String name = "Ilakkiya";
       name +=" - TCS Employee";
       System.out.println(name);
       System.out.println("---------");
       String product1 = "";
       String product2 = "Kojic Serum";
       int Price1=500;
       int Price2=200;
       if(product1== "Glycolic Serum" && product2=="Kojic Serum") {
    	   int Total=Price1;
    	   Total +=Total*2/100;
    	   System.out.println("Buy 2 get 1 free- Amount To Be paid:" + Total);
       }
       else if(product1 == "Glycolic Serum") {
    	   int Total=Price1;
    	   Total +=Total*2/100;
    	   System.out.println("Amount To Be paid:" + Total);
       }
       else if(product2 == "Kojic Serum") {
    	   int Total=Price2;
    	   Total +=Total*2/100;
    	   System.out.println("Amount To Be paid:" + Total);
       }
       else
       {System.out.println("Add your product to the cart");}  
       
}
}