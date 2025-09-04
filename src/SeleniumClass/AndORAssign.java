package SeleniumClass;

public class AndORAssign {

	public static void main(String[] args) {
		// voter eligibility
		int age =15;
		boolean iscitizen=true;
		if(age>=18 & iscitizen) {
			System.out.println("Eligible to vote");
		}
		else
			System.out.println("Not eligible to vote");
		System.out.println("----------");
	// login check
	boolean isUserNameCorrect=false;
	boolean isPasswordCorrect=false;
	if(isUserNameCorrect&&isPasswordCorrect) 
System.out.println("Login Successfull");
	else
		System.out.println("Login failed");
	System.out.println("----------");
	if (isUserNameCorrect||isPasswordCorrect) {System.out.println("Atlease one credential is correct");}
	else
		 System.out.println("Both credentia are incorrect");
	System.out.println("----------");
	if(isUserNameCorrect&isPasswordCorrect) 
		System.out.println("Login Successfull");
			else
				System.out.println("Login failed");
			System.out.println("----------");
			if (isUserNameCorrect|isPasswordCorrect) {System.out.println("Atlease one credential is correct");}
			else
				 System.out.println("Both credentia are incorrect");
			// discount eligibility	
			System.out.println("----------");
			String customer="Ilakkiya";
			boolean isPrimeMember=true;
			int total=100;
			if(total>1000||isPrimeMember) {System.out.println("Total Amount"+total);
			System.out.println(customer+" is eligible for discount");
			total-=total*20/100;
			System.out.println("Amount to be paid after discount:"+total);
			}	
			else
				System.out.println(customer+" is not eligible for discount"+ "\n"+ "Amount to be paid:"+total);
			System.out.println("----------");
			//Access control
			boolean isuser=true;
			boolean isadmin=false;
			int accesslevel=6;
			if (isadmin||(isuser&&accesslevel>5)) 
				System.out.println("Access granted");
			else
				System.out.println("Access denied");
			System.out.println("----------");
			//the greatest of four numbers
			int a=1000;
			int b=100;
			int c=300;
			int d=500;
			if(a>b&& a>c&& a>d)
			System.out.println(a+" is the greatest number");
			else if(b>c&& b>d)
				System.out.println(b+" is the greatest number");
			else if(c>d)
				System.out.println(c+" is the greatest number");
			else 
				System.out.println(d+" is the greatest number");
			System.out.println("----------");
			//short circuit behavior
			int m=6;
			if(m>5||printMessage()) {System.out.println("Condition Passed");}
			if(m>5|printMessage()) {System.out.println("Condition Passed");}
	}
	public static boolean printMessage() {
		System.out.println("Inside printMessage()");
		return true;
	}
	
}

	
