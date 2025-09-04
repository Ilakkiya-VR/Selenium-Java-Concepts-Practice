package SeleniumClass;

public class SwitchAssign {

	public static void main(String[] args) {
		// Browser Launch
		String brow= "internet explorer";
		String browser= brow.toLowerCase().trim();

		switch (browser) {
		case "firefox":
			System.out.println("Launch Firefox");
			break;
		case "chrome":
			System.out.println("Launch Chrome");
			break;
		case "edge":
			System.out.println("Launch Edge");
			break;
		case "internet explorer":
			System.out.println("Launch IE");
			break;
		case "safari":
			System.out.println("Launch Safari");
			break;
		case "opera":
			System.out.println("Launch opera");
			break;

		default:
			System.out.println("This browser is not supported");
			break;
		} System.out.println("-----------");
		//day of the week
		int day =0;
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;	
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			default:
				System.out.println("Enter the number to know the day of the week");
			break;
		}
		 System.out.println("-----------");
			//vowel and consonant
		 char c='A';
		 switch(Character.toLowerCase(c)) {
		 case 'a':
		 System.out.println("Alphabet a is vowel");
		 break;
		 case 'e':
			 System.out.println("Alphabet e is vowel");	
			 break;
		 case 'i':
			 System.out.println("Alphabet i is vowel");	
			 break;
		 case 'o':
			 System.out.println("Alphabet o is vowel");
			 break;
		 case 'u':
			 System.out.println("Alphabet u is vowel");	
			 break;
		 default:
			 System.out.println("Alphabet "+ c+ " is consonant");	
			 break;
		 }
		 System.out.println("-----------");
			//user role
		 String role = "AUThoriser";
		 switch(role.toLowerCase()) {
		 case "inquiry":
			 System.out.println("User can only view");
			 break;
		 case "operator":
			 System.out.println("User can only view and edit");
			 break;
		 case "authoriser":
			 System.out.println("User can only view and authorise");
			 break;
		 case "admin":
			 System.out.println("User can only view, edit and authorise");
			 break;
			default:
				System.out.println("Please define the role of the user to provide the access");
				break;
		 }
		 System.out.println("-----------");
			//os selection
		 String os="Linux";
		switch(os.toLowerCase()) {
		case "linux":
		System.out.println("Selected OS:"+" "+os);
		break;
		case "windows":
			System.out.println("Selected OS:"+" "+os);
			break;
		case "mac":
			System.out.println("Selected OS:"+" "+os);
			break;
			default:
				System.out.println("Selected OS:"+" "+os);
				break;
		}
		//payment mode
		 System.out.println("-----------");
		int Amt=10000;
		String pay="";
switch(pay.toLowerCase()) {
case "upi":
	if (Amt>=500000)
	{System.out.println("Please provide approve to proceed further");}
	else
	System.out.println("Payment is done using upi");
	break;
case "paypal":
	if (Amt>=500000)
	{System.out.println("Please provide approve to proceed further");}
	else
	System.out.println("Payment is done using Paypal");
	break;
case "debitcard":
	if (Amt>=500000)
	{System.out.println("Please provide approve to proceed further");}
	else
	System.out.println("Payment is done using Debit Card");
	break;
case "creditcard":
	if (Amt>=500000)
	{System.out.println("Please provide approve to proceed further");}
	else
	System.out.println("Payment is done using Credit Card");
	break;
case "netbanking":
	if (Amt>=500000)
	{System.out.println("Please provide approve to proceed further");}
	else
		{System.out.println("Payment is done using Net Banking");}
	break;
default:
	System.out.println("Payment is done using Cash");
}
System.out.println("-----------");
//environment config
String env="dr";
switch(env.toUpperCase()) {
case("ST"):
	System.out.println("https://STDEVsite.com/");
break;
case("SIT"):
	System.out.println("https://SITsite.com/");
break;
case("UAT"):
	System.out.println("https://UATsite.com/");
break;
case("DR"):
	System.out.println("https://DRsite.com/");
break;
case("PROD"):
	System.out.println("https://prodsite.com/");
break;
default:
	System.out.println("Invalid Env");
	break;
	}
System.out.println("-----------");
//Department
String iss="";
String dpt="finance";
switch(dpt.toUpperCase()) {
case "IT":
	System.out.println("Welcome to the IT department");
	break;
case "HR":
	System.out.println("Welcome to the HR department");
	break;
case "FINANCE":
	if (iss=="salary") {System.out.println("please contact payroll department");}
	else
	System.out.println("Welcome to the Finance department");
	break;
case "ADMIN":
	System.out.println("Welcome to the IT department");
	break;	
default:
	System.out.println("Invalid department");
	break;

}
 }	
}


