package ClassAndObj;

public class MinMax {
	public int min(int a,int b, int c) {
		int min=0;
		{System.out.println("Find the minimum number among 3 numbers ");
		if(a<b&&a<c) {System.out.println("The below  number is the minimum number among 3 numbers");
	    min=a;}
		else if(b<c) {System.out.println("The below  number is the minimum number among 3 numbers");
		min=b;}
		else {System.out.println("The below  number is the minimum number among 3 numbers");
		min =c;}
		
		return min;
		
	}
	}
	public int max(int a,int b, int c) {
		int max=0;
		{
		System.out.println(" Find the number maximum number among 3 numbers ");
		if(a>b&&a>c) {System.out.println("The below number is the maximum number among 3 numbers "); max=a;}
		else if(b>c) {System.out.println("The below number is the maximum number among 3 numbers ");max=b;}
		else {System.out.println("The below number is the maximum number among 3 numbers ");max=c;}
		return max;
	}
	}
	public static void main(String[] args) {
	
MinMax MM=new MinMax();
int MI= MM.max(500, 80, 100);
System.out.println(MI);
	}

}
