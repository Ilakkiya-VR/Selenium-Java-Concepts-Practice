package SeleniumClass;

public class IfELseAssign {

	public static void main(String[] args) {
		// greatest number
		int a=25;
		int b=78;
		int c=87;
		int d=97;
		if(a>b&&a>b&&a>c&&a>d) {
			System.out.println(a+" is the greatest number");
		}
		else if(b>c&&b>d)
			System.out.println(b+" is the greatest number");
		else if(c>d)
			System.out.println(c+" is the greatest number");
		else 
			System.out.println(d+" is the greatest number");
		System.out.println("-------");
		//positive negative
		 int f=-11;
		 if(f>0) 
		 {System.out.println(f+" is the positive number"); }
		 else System.out.println(f+" is the negative number");
		 System.out.println("-------");
			//even odd number
		 int g=5;
		 if(g%2==0) {System.out.println(g+" is even number");}
		 else System.out.println(g+" is odd  number");
		 System.out.println("-------");
		 //letter
		 char w='A';
		 for(w='A';w<='Z';w++) {System.out.println(w);}
		 System.out.println("-------");
		 //uber
		 int km=90;
		 String car="Premium";
		 switch (car.toLowerCase()) {
		case "mini":
			System.out.println("Mini car is booked");
			break;
		case"sedan":
			System.out.println("Sedan car is booked");
			break;
		case"suv":
			System.out.println("SUV car is booked");
			break;
		case"premium":
			System.out.println("Premium car is booked");
			if(km>=100)
			{System.out.println("5% discount");
			}
			break;
		default:
			System.out.println("Please provide the right car type to book");
			break;
		}
		 System.out.println("-------");
		 String brow="firefox";
		 String browser=brow.toLowerCase();
		 if(browser=="firefox") System.out.println("Launch Firefox");
		 else if(browser=="chrome") System.out.println("Launch chrome");
		 else if(browser=="internet explorer") System.out.println("Launch IE");
		 else if(browser=="mac") System.out.println("Launch MAC");
		 else System.out.println("Please pass the right browser name");
		 System.out.println("-------");
		 double sal=36000;
		 double intrate;
		 String loantype="car loan";
		 switch (loantype.toLowerCase()) {
		case "car loan":
			intrate=6.5;
			System.out.println("Applicable for "+loantype+" and the interest rate is "+intrate+"%");
			break;
		case "personal loan":
			intrate=10.5;
			System.out.println("Applicable for "+loantype+" and the interest rate is "+intrate+"%");
			break;
		case "housing loan":
			intrate=7.5;
			if(sal<35000) 
				System.out.println("Not applicable for housing loan");
			else
			System.out.println("Applicable for "+loantype+" and the interest rate is "+intrate+"%");
			break;
		case "education loan":
			intrate=8.5;
			System.out.println("Applicable for "+loantype+" and the interest rate is "+intrate+"%");
			break;
		default:
			System.out.println("Please provide the loan type");
			break;
		}
	}
}
	
	
	
	
