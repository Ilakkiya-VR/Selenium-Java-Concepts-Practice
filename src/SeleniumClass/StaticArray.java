package SeleniumClass;

import java.util.Arrays;

public class StaticArray {

	public static void main(String[] args) {
		int AR[]=new int[4];
		AR[0]=10;
		AR[1]=20;
		AR[2]=30;
		AR[3]=50;
		System.out.println(AR.length);
		System.out.println("Li="+0);
		System.out.println("Hi="+( AR.length-1));
		System.out.println(AR[0]+AR[1]+AR[2]+AR[3]);
		for(int R=0;R<AR.length;R++) {System.out.println(AR[R]); 
		if(R==0) { System.out.println("STop,Bye");}
			}
		System.out.println("----------------");		
		for(int f:AR) {System.out.println(f);}
		System.out.println("----------------");	
		System.out.println(AR);//when we try to print array name, then we will get the reference/memory addr of that array variable
		String emp[]= {"Bala","Adi","Aaru","Sindhu"};
		System.out.println(Arrays.toString(emp));
		System.out.println("----------------");		
		System.out.println(emp.length);
		for(String e:emp)System.out.println(e);
		System.out.println(emp.length-1);
		System.out.println("----------------");	
		int ho[]=new int[5];
		ho[0]=301;
		ho[1]=302;
		ho[2]=303;
		ho[3]=304;
		for (int j=0;j<ho.length;j++)
	   switch(ho[j]) {	
	   case 301: System.out.println("House Owner:Adidev:"+  ho[0]);
	   break;
	   case 302: System.out.println("House Owner:Aaru:"+ ho[1]);
	   break;
	   case 303: System.out.println("House Owner:Ilakkiya:"+ ho[2]);
	   break;
	   case 304: System.out.println("House Owner:Balamurugan:"+ ho[3]);
	   break;
	   }
		System.out.println("----------------");	
		String day[]= {"Monday","Tuesday","Wednesday","Thursday", "Friday","Saturday","Sunday"};
		System.out.println(day.length);
		for(int x=0;x<day.length;x++)
			if(x<day.length-2) {System.out.println("Weekday"+day[x]);}
			else
			{System.out.println("Weekend"+day[x]);}
		System.out.println("----------------");	
		int n[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(n.length);
		for(int y=0;y<=n.length;y++)
			if(y%2==0) {System.out.println("Even Number:"+y);}
			else
			{System.out.println("Odd Number:"+y);}
		System.out.println("----------------");	
		Object stud[]=new Object[5];
		stud[0]="Adidev";
		stud[1]="Grade 3";
		stud[2]="First Class";
		stud[3]=9;
		stud[4]=27.9;
		System.out.println(Arrays.toString(stud));
		for(int m=0;m<stud.length;m++)
		if(m==3) {System.out.println(stud[0]+ " is eligible to study  "+ stud[1]);}
		for(Object m:stud) 
		{System.out.println(m);}
		System.out.println("----------------");	
		String month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
		int a=366;
		System.out.println(month.length);
		System.out.println(Arrays.toString(month));
		if(a==366) {System.out.println("Leap Year");}
		for(int z=0;z<month.length;z++) {
		switch(month[z].toLowerCase()) {
		case "january":
			System.out.println(month[0]+":No of days:31");
			if(month[0].equals("January")) {System.out.println("Pongal Festival is in January month");}
			break;
		case "february":
			System.out.println(month[1]+":No of days:28"); break;
		case "march":
			System.out.println(month[2]+":No of days:31"); break;
		case "april":
			System.out.println(month[3]+":No of days:30"); break;
		case "may":
			System.out.println(month[4]+":No of days:31"); break;
		case "june":
			System.out.println(month[5]+":No of days:30"); break;
		case "july":
			System.out.println(month[6]+":No of days:31"); break;
		case "august":
			System.out.println(month[7]+":No of days:31"); break;
		case "september":
			System.out.println(month[8]+":No of days:30"); break;
		case "october":
			System.out.println(month[9]+":No of days:31"); break;
		case "november":
			System.out.println(month[10]+":No of days:30"); break;
		case "december":
			System.out.println(month[11]+":No of days:31"); break;
		}	
		}
		System.out.println("---------");
		Object empData[]= new Object[5];
		empData[0]="Bala";
		empData[1]="TechM";
		empData[2]=3475;
		empData[3]="Senior TM";
		empData[4]="45L";
		for(Object e:empData) {System.out.println(e);}
		for(int f=0;f<empData.length;f++)
		if(f==3) {System.out.println(empData[0]+ " is eligible for promotion" +" and the current role is "+ empData[f]);}
		}
		
		} 
			
	


	


