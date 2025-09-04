package JavaBasics;

public class Switch {

	public static void main(String[] args) {
		String Role=" Senior SOFTWARE ENgineer";
		String Designation = Role.toLowerCase().trim();
		switch (Designation) {
		case "software engineer":
			String Package ="10L";
			System.out.println("Salary of the S/w Engineer: "+Package);
			break;
		case "senior software engineer":
			String Package1="15L";
			Package1="10L+5L(Variable)";
		System.out.println("Salary of the Senior S/w Engineer: "+Package1);
		break;
		default:
			System.out.println("Please provide the role of the employee");
			break;
		}
		System.out.println("-------");
		String Prod1 = "Serum";
		int price1= 0;
		String Prod2 = "Moisture";
		int price2=300;
		String Prod3="Lipbalm";
		int price3=150;
		int total =price1+price2+price3; 
		if(price1==400 & price2==300) 
		{System.out.println("Products ordered:" +" 1."+ Prod1 + " 2." +Prod2);
		System.out.println("Buy 2 get 1 free:"+ "Total Amount to be paid:"+ total);	
		System.out.println("Amount to be paid after discount:"+price1);}
		else if(price1==400 & price3==150) 
		{System.out.println("Products ordered:"+" 1."+ Prod1 + " 2." + Prod3);
			System.out.println("Buy 2 get 1 free:"+ "Total Amount to be paid:"+ total);	
		System.out.println("Amount to be paid after discount:"+price1);	
		}
		else if(price2==300 & price3==150) 
		{System.out.println("Products ordered:"+" 1."+ Prod2 + " 2." +Prod3);
			System.out.println("Buy 2 get 1 free:"+ "Total Amount to be paid:"+ total);	
		System.out.println("Amount to be paid after discount:"+price2);	
		}
		else 
		{System.out.println("Amount to be paid:"+total);	
		}
		System.out.println("-------");  
		String offer= price1+","+price2+","+price3;
		switch (offer) {
		case "400,300,0":{System.out.println("Products ordered:" +" 1."+ Prod1 + " 2." +Prod2);
		System.out.println("Buy 2 get 1 free:"+ "Total Amount to be paid:"+ total);	
		System.out.println("Amount to be paid after discount:"+price1);}
			break;
		case "400,0,150":
		{System.out.println("Products ordered:"+" 1."+ Prod1 + " 2." + Prod3);
		System.out.println("Buy 2 get 1 free:"+ "Total Amount to be paid:"+ total);	
	System.out.println("Amount to be paid after discount:"+price1);	
	} break;
		case "0,300,150":
		{System.out.println("Products ordered:"+" 1."+ Prod2 + " 2." +Prod3);
		System.out.println("Buy 2 get 1 free:"+ "Total Amount to be paid:"+ total);	
	System.out.println("Amount to be paid after discount:"+price2);	
	} break;
		default:
		{System.out.println("Amount to be paid:"+total);	
		}
			break;
		}
	}

}
