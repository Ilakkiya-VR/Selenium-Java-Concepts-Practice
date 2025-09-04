package ClassAndObj;

public class MethodAssign {
	public int Operation(String Opr,int a,int b) //Operation of two numbers
	{System.out.println("Operation of two numbers");
	int Ans=0;
		switch(Opr) {
		case "Add":
			Ans=a+b;
			System.out.println("The addition of two number is: "+ a+"and"+b);
			break;
		case "Sub":
			Ans=a-b;
			System.out.println("The subtraction of two number is: "+ a+"and"+b);
			break;
		case "Multiply":
			Ans=a*b;
			System.out.println("The multiply of two number is: "+ a+"and"+b);
			break;
		case "Divison":
			Ans=a/b;
			System.out.println("The divison of two number is: "+ a+"and"+b);
			break;
		}
          return Ans;
	} 
	public double product(double c, double d) //product of two double two numbers
	{System.out.println("Product of two numbers:"+c+" and "+d);
	double pdt=c*d;
	return pdt;	
	}
	public double AreaofCircle(int a) {  // Area of circle
		System.out.println("Radius: "+a);
		double AC=3.14*a*a;
		System.out.println("Calculation:Area of Circle:");
		return AC;
	}
	public double CircumofCircle(int a) {  // Circumference of circle
		System.out.println("Radius: "+a);
		double CC=2*3.14*a;
		System.out.println("Calculation:Circumference of Circle:");
		return CC;
	}
	
	public static void main(String[] args) {
	
		MethodAssign A=new MethodAssign();
		int s=A.Operation("Add", 40, 10);
		System.out.println(s);
		System.out.println("---------------------");
		int t=A.Operation("Sub", 40, 10);
		System.out.println(t);
		System.out.println("---------------------");
		int L=A.Operation("Multiply", 40, 10);
		System.out.println(L);
		System.out.println("---------------------");
		int M=A.Operation("Divison", 40, 10);
		System.out.println(M);
		System.out.println("---------------");
        double P=A.product(10.10, 5.5);
        System.out.println(P);
    	System.out.println("---------------");
    	double q=A.AreaofCircle(5);
    	System.out.println(q);
    	System.out.println("---------------");
    	double r=A.CircumofCircle(20);
    	System.out.println((float)r);
    


	}

}
